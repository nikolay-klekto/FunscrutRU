package com.fs.client.controller

import com.fs.client.repository.AddressRepository
import com.fs.client.ru.AddressModel
import com.fs.client.ru.OfficeModel
import com.fs.service.ru.EventModel
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@Tag(name = "Address")
@RestController
@RequestMapping("/address", produces = ["application/json"])
open class AddressController(open val addressRepository: AddressRepository) {

    @GetMapping("{id}")
    fun getAddressById(@PathVariable("id") addressId: Long) =
        addressRepository.getByAddressId(addressId)

    @PostMapping
    fun insertAddressModel(
        @RequestBody addressModel: AddressModel
    ) =
        addressRepository.create(addressModel)

    @MutationMapping
    fun addAddress(@Argument address: AddressModel): Mono<AddressModel> {
        return addressRepository.create(address)
    }

    @MutationMapping
    open fun updateAddress(@Argument address: AddressModel): Mono<Boolean> {
        return addressRepository.update(address)
    }

    @MutationMapping
    open fun deleteAddress(@Argument id: Long): Mono<Boolean> {
        return addressRepository.deleteByAddressId(id)
    }

    @SchemaMapping(typeName = "Office", field = "address")
    fun getAddressForOffice(office: OfficeModel): Mono<AddressModel> {
        return addressRepository.getByAddressId(office.addressId!!)
    }

    @SchemaMapping(typeName = "Event", field = "address")
    fun getAddressForEvent(event: EventModel): Mono<AddressModel> {
        return addressRepository.getByAddressId(event.addressId!!)
    }
}