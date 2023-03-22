package com.fs.client.controller

import com.fs.client.repository.CityRepository
import com.fs.client.ru.AddressModel
import com.fs.client.ru.CityModel
import com.fs.client.ru.ClientModel
import com.fs.client.ru.CountryModel
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@Tag(name = "City")
@RestController
@RequestMapping("/city", produces = ["application/json"])
open class CityController(open val cityRepository: CityRepository) {

    @GetMapping("{id}")
    fun getById(@PathVariable("id") cityId: Long) =
        cityRepository.getCityById(cityId)

    @GetMapping("country/{id}")
    fun getCountryByCityId(@PathVariable("id") cityId: Long) =
        cityRepository.getCountryByCityId(cityId)

    @PostMapping
    fun createCity(@RequestBody cityModel: CityModel) =
        cityRepository.createCity(cityModel)

    @QueryMapping
    fun getCity(@Argument id: Long): Mono<CityModel> {
        return cityRepository.getCityById(id)
    }

    @QueryMapping
    fun getCountryByCity(@Argument id: Long): Mono<CountryModel> {
        return cityRepository.getCountryByCityId(id)
    }

    @MutationMapping
    fun addCity(@Argument city: CityModel): Mono<CityModel> {
        return cityRepository.createCity(city)
    }

    @MutationMapping
    fun deleteCity(@Argument cityId: Long): Mono<Boolean> {
        return cityRepository.deleteCity(cityId)
    }

    @SchemaMapping(typeName = "Client", field = "city")
    fun getCityForClient(client: ClientModel): Mono<CityModel> {
        return cityRepository.getCityById(client.cityId!!)
    }

    @SchemaMapping(typeName = "Address", field = "city")
    fun getCityForAddress(address: AddressModel): Mono<CityModel> {
        return cityRepository.getCityById(address.cityId!!)
    }
}