package com.fs.client.repository

import com.fs.client.ru.AddressModel
import com.fs.client.service.AddressModelConverter
import com.fs.domain.jooq.tables.Address.Companion.ADDRESS
import com.fs.domain.jooq.tables.pojos.Address
import com.fs.domain.jooq.tables.records.AddressRecord
import org.jooq.DSLContext
import reactor.core.publisher.Mono

abstract class AddressRepository(
    open val dsl: DSLContext,
    open val converter: AddressModelConverter
) {

    fun getByAddressId(id: Int): Mono<AddressModel> {
        return Mono.from(
            dsl.select(ADDRESS.asterisk()).from(ADDRESS)
                .where(ADDRESS.ID.eq(id))
        )
            .map { it.into(Address::class.java) }
            .map(converter::toModel)
    }

    fun create(addressModel: AddressModel): Mono<AddressModel> =
        Mono.fromSupplier {
            val newAddressRecord: AddressRecord = dsl.newRecord(ADDRESS)
            newAddressRecord.from(addressModel)
            newAddressRecord.reset(ADDRESS.ID)
            newAddressRecord.store()
            return@fromSupplier newAddressRecord.into(Address::class.java)
        }
            .map(converter::toModel)

    fun updateByAddressId(addressId: Int, address: AddressModel): Mono<Boolean> {
        val oldAddressModel: AddressModel = getByAddressId(addressId).block() ?: return Mono.just(false)
        Mono.from(
            dsl.update(ADDRESS)
                .set(ADDRESS.CITY_ID, address.cityId ?: oldAddressModel.cityId)
                .set(ADDRESS.APARTMENT, address.apartment ?: oldAddressModel.apartment)
                .set(ADDRESS.BUILDING, address.building ?: oldAddressModel.building)
                .set(ADDRESS.HOUSE, address.house ?: oldAddressModel.house)
                .set(ADDRESS.STREET, address.street ?: oldAddressModel.street)
                .where(ADDRESS.ID.eq(addressId))
        )
        return Mono.just(true)
    }

    fun deleteByAddressId(id: Int): Mono<Void> {
        return Mono.from(
            dsl.deleteFrom(ADDRESS)
                .where(ADDRESS.ID.eq(id))
        ).then()
    }
}