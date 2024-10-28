/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.ORDER_PKEY
import com.fs.domain.jooq.keys.ORDER__ORDER_BASKET_ID_FKEY
import com.fs.domain.jooq.keys.ORDER__ORDER_COMPANY_OFFICE_ID_FKEY
import com.fs.domain.jooq.keys.ORDER__ORDER_COMPANY_PROFESSION_ID_FKEY
import com.fs.domain.jooq.tables.records.OrderRecord
import com.fs.service.ru.enums.OrderStatus

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row10
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.EnumConverter
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Order(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, OrderRecord>?,
    aliased: Table<OrderRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<OrderRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.order</code>
         */
        val ORDER: Order = Order()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<OrderRecord> = OrderRecord::class.java

    /**
     * The column <code>public.order.id</code>.
     */
    val ID: TableField<OrderRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.order.basket_id</code>.
     */
    val BASKET_ID: TableField<OrderRecord, Long?> = createField(DSL.name("basket_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.order.company_office_id</code>.
     */
    val COMPANY_OFFICE_ID: TableField<OrderRecord, Long?> = createField(DSL.name("company_office_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.order.is_expired</code>.
     */
    val IS_EXPIRED: TableField<OrderRecord, Boolean?> = createField(DSL.name("is_expired"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.order.start_work_date</code>.
     */
    val START_WORK_DATE: TableField<OrderRecord, LocalDateTime?> = createField(DSL.name("start_work_date"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.order.total_work_days</code>.
     */
    val TOTAL_WORK_DAYS: TableField<OrderRecord, Long?> = createField(DSL.name("total_work_days"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.order.price</code>.
     */
    val PRICE: TableField<OrderRecord, Double?> = createField(DSL.name("price"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.order.order_status</code>.
     */
    val ORDER_STATUS: TableField<OrderRecord, OrderStatus?> = createField(DSL.name("order_status"), SQLDataType.VARCHAR, this, "", EnumConverter<String, OrderStatus>(String::class.java, OrderStatus::class.java))

    /**
     * The column <code>public.order.date_created</code>.
     */
    val DATE_CREATED: TableField<OrderRecord, LocalDateTime?> = createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.order.company_profession_id</code>.
     */
    val COMPANY_PROFESSION_ID: TableField<OrderRecord, Long?> = createField(DSL.name("company_profession_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<OrderRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<OrderRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.order</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.order</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.order</code> table reference
     */
    constructor(): this(DSL.name("order"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, OrderRecord>): this(Internal.createPathAlias(child, key), child, key, ORDER, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<OrderRecord, Long?> = super.getIdentity() as Identity<OrderRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<OrderRecord> = ORDER_PKEY
    override fun getReferences(): List<ForeignKey<OrderRecord, *>> = listOf(ORDER__ORDER_BASKET_ID_FKEY, ORDER__ORDER_COMPANY_OFFICE_ID_FKEY, ORDER__ORDER_COMPANY_PROFESSION_ID_FKEY)

    private lateinit var _basket: Basket
    private lateinit var _office: Office
    private lateinit var _companyProfession: CompanyProfession

    /**
     * Get the implicit join path to the <code>public.basket</code> table.
     */
    fun basket(): Basket {
        if (!this::_basket.isInitialized)
            _basket = Basket(this, ORDER__ORDER_BASKET_ID_FKEY)

        return _basket;
    }

    /**
     * Get the implicit join path to the <code>public.office</code> table.
     */
    fun office(): Office {
        if (!this::_office.isInitialized)
            _office = Office(this, ORDER__ORDER_COMPANY_OFFICE_ID_FKEY)

        return _office;
    }

    /**
     * Get the implicit join path to the <code>public.company_profession</code>
     * table.
     */
    fun companyProfession(): CompanyProfession {
        if (!this::_companyProfession.isInitialized)
            _companyProfession = CompanyProfession(this, ORDER__ORDER_COMPANY_PROFESSION_ID_FKEY)

        return _companyProfession;
    }
    override fun `as`(alias: String): Order = Order(DSL.name(alias), this)
    override fun `as`(alias: Name): Order = Order(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Order = Order(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Order = Order(name, null)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<Long?, Long?, Long?, Boolean?, LocalDateTime?, Long?, Double?, OrderStatus?, LocalDateTime?, Long?> = super.fieldsRow() as Row10<Long?, Long?, Long?, Boolean?, LocalDateTime?, Long?, Double?, OrderStatus?, LocalDateTime?, Long?>
}
