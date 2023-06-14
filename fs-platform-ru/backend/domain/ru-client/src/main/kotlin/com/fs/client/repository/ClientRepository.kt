package com.fs.client.repository

import com.fs.client.ru.ClientModel
import com.fs.client.service.ClientModelConverter
import com.fs.domain.jooq.tables.Basket
import com.fs.domain.jooq.tables.City
import com.fs.domain.jooq.tables.Client.Companion.CLIENT
import com.fs.domain.jooq.tables.Country
import com.fs.domain.jooq.tables.Order.Companion.ORDER
import com.fs.domain.jooq.tables.pojos.Client
import com.fs.domain.jooq.tables.records.ClientRecord
import com.fs.domain.jooq.tables.references.BASKET
import com.fs.service.ru.BasketModel
import org.jooq.DSLContext
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


abstract class ClientRepository(
    open val dsl: DSLContext,
    open val converter: ClientModelConverter,
    open val basketRepository: BasketRepository,
) {

    fun getClintById(id: Long?): Mono<ClientModel> {
        return Mono.from(
            dsl.select(CLIENT.asterisk()).from(CLIENT)
                .join(Basket.BASKET).on(CLIENT.BASKET_ID.eq(Basket.BASKET.ID))
                .join(City.CITY).on(CLIENT.CITY_ID.eq(City.CITY.ID))
                .join(Country.COUNTRY).on(City.CITY.COUNTRY_CODE.eq(Country.COUNTRY.CODE))
                .where(CLIENT.ID.eq(id))
        )
            .map { it.into(Client::class.java) }
            .map(converter::toModel)
    }

    fun getAllClients(): Flux<ClientModel> {
        return Flux.from(
            dsl.selectFrom(CLIENT)
        )
            .map { it.into(Client::class.java) }
            .map(converter::toModel)
    }

    fun updateClientInfo(newClientModel: ClientModel): Mono<Boolean> {
        return Mono.fromSupplier {
            val oldClientModel: ClientModel = getClintById(newClientModel.id).block()!!

            dsl.update(CLIENT)
                .set(CLIENT.CITY_ID, newClientModel.cityId ?: oldClientModel.cityId)
                .set(CLIENT.BIRTHDAY, newClientModel.birthday ?: oldClientModel.birthday)
                .set(
                    CLIENT.EDUCATION_STATUS,
                    newClientModel.educationStatus ?: oldClientModel.educationStatus
                )
                .set(CLIENT.EMAIL, newClientModel.email ?: oldClientModel.email)
                .set(CLIENT.EMPLOYMENT, newClientModel.employment ?: oldClientModel.employment)
                .set(CLIENT.FIRST_NAME, newClientModel.firstName ?: oldClientModel.firstName)
                .set(CLIENT.LAST_NAME, newClientModel.lastName ?: oldClientModel.lastName)
                .set(CLIENT.PHONE_NUMBER, newClientModel.phoneNumber ?: oldClientModel.phoneNumber)
                .set(CLIENT.TELEGRAM_USERNAME, newClientModel.telegramUsername ?: oldClientModel.telegramUsername)
                .set(CLIENT.USERNAME, newClientModel.username ?: oldClientModel.username)
                .where(CLIENT.ID.eq(newClientModel.id))
                .execute() == 1
        }
    }

    fun changeActiveStatus(id: Long, activeStatus: Boolean): Mono<Boolean> {
        return Mono.fromSupplier {
            dsl.update(CLIENT)
                .set(CLIENT.ACTIVATE_STATUS, activeStatus)
                .where(CLIENT.ID.eq(id))
                .execute() == 1
        }
    }

    fun changePassword(id: Long, password: String): Mono<Boolean> {
        return Mono.fromSupplier {
            dsl.update(CLIENT)
                .set(CLIENT.PASSWORD, password)
                .where(CLIENT.ID.eq(id))
                .execute() == 1
        }
    }

    //Should to think how to realize this function

//    fun changeRole(id: Long, role: ClientRoleModel): Mono<Boolean> {
//        return Mono.fromSupplier {
//
//            val updatableClientModel = dsl.update(CLIENT)
//                .set(CLIENT.ROLE, role)
//                .where(CLIENT.ID.eq(id))
//                .returning()
//                .map { it.into(Client::class.java) }
//                .map(converter::toModel)
//                .first()
//
//            val oldPartnerClientId = dsl.select(Partner.PARTNER.CLIENT_ID).from(Partner.PARTNER)
//                .where(Partner.PARTNER.CLIENT_ID.eq(id))
//                .map { it.into(Long::class.java) }
//
//            if(role == ClientRoleModel.PARTNER && oldPartnerClientId.isEmpty()){
//
//                partnerRepository.insert(updatableClientModel)
//
//            }
//
//            return@fromSupplier true
//        }
//    }

    fun insert(clientModel: ClientModel) =
        Mono.fromSupplier {

            val newClientRecord: ClientRecord = dsl.newRecord(CLIENT)
            val basket: BasketModel = basketRepository.insert().block()!!
            clientModel.basketId = basket.id
            newClientRecord.from(clientModel)
            newClientRecord.reset(CLIENT.ID)
            newClientRecord.store()
            return@fromSupplier newClientRecord.into(Client::class.java)
        }
            .map(converter::toModel)


    fun delete(id: Long): Mono<Boolean> {
        return Mono.fromSupplier {
            val clientRecord: ClientRecord? = dsl.fetchOne(CLIENT, CLIENT.ID.eq(id))
            if (clientRecord != null) {
                val result = dsl.deleteFrom(CLIENT)
                    .where(CLIENT.ID.eq(id))
                    .execute() == 1
                dsl.deleteFrom(BASKET)
                    .where(BASKET.ID.eq(clientRecord.basketId))
                    .execute()
                dsl.deleteFrom(ORDER)
                    .where(ORDER.BASKET_ID.eq(clientRecord.basketId))
                    .execute()
                return@fromSupplier result
            }
            false
        }
    }

//    fun deleteClient(id: Long): Mono<Boolean> {
//        return Mono.fromSupplier {
//            dsl.deleteFrom(BASKET)
//                .where(BASKET.ID.eq(CLIENT.BASKET_ID))
//                .execute()
//            dsl.deleteFrom(CLIENT)
//                .where(CLIENT.ID.eq(id))
//                .execute() == 1
//        }
//    }

}



