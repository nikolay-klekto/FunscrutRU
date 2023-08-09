package com.fs.client.repository.blocked

import com.fs.client.repository.OrderRepository
import com.fs.client.service.CountryModelConverter
import com.fs.client.service.OrderModelConverter
import com.fs.domain.jooq.tables.Basket
import com.fs.domain.jooq.tables.Basket.Companion.BASKET
import com.fs.domain.jooq.tables.Order.Companion.ORDER
import com.fs.domain.jooq.tables.pojos.Order
import com.fs.domain.jooq.tables.records.OrderRecord
import com.fs.service.ru.BasketModel
import com.fs.service.ru.OrderModel
import com.fs.service.ru.enums.OrderStatus
import org.jooq.DSLContext
import reactor.core.publisher.Mono
import java.time.LocalDateTime

abstract class OrderBlockingRepository(
    open val dsl: DSLContext,
    open val converter: OrderModelConverter,
    open val basketBlockingRepository: BasketBlockingRepository,
    open val serviceBlockingRepository: ServiceBlockingRepository
) {

    fun getById(orderId: Long): OrderModel? {
        return dsl.select(ORDER.asterisk()).from(ORDER)
            .where(ORDER.ID.eq(orderId))
            .map { it.into(Order::class.java) }
            .map(converter::toModel)
            .firstOrNull()
    }

    fun decreaseBasketTotalPriceByOrderId(orderId: Long) {
        val basketTotalPrice: Double? = dsl.select(BASKET.TOTAL_PRICE).from(BASKET)
            .where(BASKET.ID.eq(dsl.select(ORDER.BASKET_ID).from(ORDER).where(ORDER.ID.eq(orderId))))
            .map { it.into(Double::class.java)}.firstOrNull()

        val currentOrder: OrderModel? = getById(orderId)

        val currentOrderPrice = currentOrder?.price

        val totalBasketPrice = basketTotalPrice!! - currentOrderPrice!!

        basketBlockingRepository.update(BasketModel(currentOrder.basketId!!, totalBasketPrice))
    }

    fun isBasketEmpty(basketId: Long): Boolean {
        val ordersWithCurrentBasket: Int = dsl.selectCount().from(ORDER).where(ORDER.BASKET_ID.eq(basketId))
            .first()
            .map{it.into(Int::class.java)}
        return ordersWithCurrentBasket == 0
    }

    private fun isPreOrdersInBasket(basketId: Long): Boolean {
        val preOrdersQuantity: Int =  dsl.selectCount().from(ORDER)
            .where(ORDER.BASKET_ID.eq(basketId).and(ORDER.ORDER_STATUS.eq(OrderStatus.PRE_ORDERED)))
            .map { it.into(Int::class.java)}
            .first()
        return preOrdersQuantity > 0
    }

    fun deleteById(orderId: Long): Boolean {
        decreaseBasketTotalPriceByOrderId(orderId)
        return dsl.deleteFrom(ORDER)
            .where(ORDER.ID.eq(orderId))
            .execute() == 1
    }

    fun insert(orderModel: OrderModel): OrderModel {
        if (orderModel.serviceId == null || orderModel.companyOfficeId == null ||
            orderModel.startWorkDate == null || orderModel.totalWorkDays == null
        ) {
            throw Exception("Необходимо заполнить все обязательные поля!")
        }

        var newOrderStatus: OrderStatus? = null
        var basketId: Long? = orderModel.basketId
        var isBasketTemporary: Boolean = false

        if (orderModel.basketId != null) {
            isBasketTemporary = isPreOrdersInBasket(orderModel.basketId!!)
            if(isBasketTemporary){
                newOrderStatus = OrderStatus.PRE_ORDERED
            }
        }

        if (orderModel.basketId == null) {
            val newBasketModel: BasketModel = basketBlockingRepository.insert()
            basketId = newBasketModel.id
        } else {
            if (!isBasketTemporary) {
                newOrderStatus = if (orderModel.startWorkDate!!.plusDays(orderModel.totalWorkDays!!)
                        .isBefore(LocalDateTime.now())
                ) {
                    OrderStatus.EXPIRED
                } else {
                    OrderStatus.ACTUAL
                }
            }
        }

        val pastTotalPrice: Double? =
            basketBlockingRepository.getById(basketId!!)?.totalPrice

        val servicePrice: Double =
            serviceBlockingRepository.getById(orderModel.serviceId!!)
                ?.pricePerDay!!.toDouble() * orderModel.totalWorkDays!!

        val totalPrice: Double = if (pastTotalPrice != null) {

            pastTotalPrice + servicePrice

        } else {
            servicePrice
        }
        basketBlockingRepository.update(BasketModel(basketId, totalPrice))

        val newOrderModel = OrderModel(
            DEFAULT_ORDER_ID,
            basketId,
            orderModel.companyOfficeId,
            LocalDateTime.now(),
            orderModel.positionId,
            orderModel.serviceId,
            newOrderStatus ?: orderModel.orderStatus,
            orderModel.startWorkDate,
            orderModel.totalWorkDays,
            servicePrice
        )
        val newOrderRecord: OrderRecord = dsl.newRecord(ORDER)
        newOrderRecord.from(newOrderModel)
        newOrderRecord.reset(ORDER.ID)
        newOrderRecord.store()
        return converter.toModel(newOrderRecord.into(Order::class.java))
    }

    companion object {
        private const val DEFAULT_ORDER_ID: Long = 1

    }
}