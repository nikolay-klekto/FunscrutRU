package com.fs.client.controller

import com.fs.client.repository.OfficeRepository
import com.fs.client.ru.CompanyAddress
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Tag(name = "Office")
@RestController
@RequestMapping("/office", produces = ["application/json"])
open class OfficeController(open val officeRepository: OfficeRepository) {

    @GetMapping("company/{id}")
    fun getByCompanyId(@PathVariable("id") companyId: Long) =
        officeRepository.getAllByCompanyId(companyId)

    @GetMapping("{id}")
    fun getByOfficeId(@PathVariable("id") officeId: Long) =
        officeRepository.getByOfficeId(officeId)

    @PutMapping("{id}")
    fun updateByOfficeId(
        @PathVariable("id") officeId: Long,
        @RequestBody companyAddress: CompanyAddress
    ) =
        officeRepository.updateCompanyAddress(officeId, companyAddress)


    @PostMapping
    fun insertOfficeAddress(
        @RequestBody companyAddress: CompanyAddress
    ) =
        officeRepository.insert(companyAddress)

    @DeleteMapping("{id}")
    fun deleteByCompanyId(@PathVariable companyId: Long) =
        officeRepository.deleteAllByCompanyId(companyId)
}