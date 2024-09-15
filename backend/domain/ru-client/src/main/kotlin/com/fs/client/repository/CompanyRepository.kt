package com.fs.client.repository

import com.fs.client.repository.blocked.CompanyBlockingRepository
import com.fs.client.converter.CompanyModelConverter
import com.fs.domain.jooq.tables.Address.Companion.ADDRESS
import com.fs.domain.jooq.tables.Company.Companion.COMPANY
import com.fs.domain.jooq.tables.CompanyProfession.Companion.COMPANY_PROFESSION
import com.fs.domain.jooq.tables.Office.Companion.OFFICE
import com.fs.domain.jooq.tables.pojos.Company
import com.fs.domain.jooq.tables.records.CompanyPartnerRecord
import com.fs.domain.jooq.tables.records.CompanyRecord
import com.fs.domain.jooq.tables.references.CITY
import com.fs.domain.jooq.tables.references.COMPANY_PARTNER
import com.fs.service.ru.CompanyModel
import io.micrometer.core.annotation.Timed
import org.jooq.DSLContext
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

abstract class CompanyRepository(
    open val dsl: DSLContext,
    open val converter: CompanyModelConverter,
    open val companyBlockingRepository: CompanyBlockingRepository
) {

    fun getCompanyById(id: Long): Mono<CompanyModel> {
        return Mono.fromSupplier {
            companyBlockingRepository.getById(id)
        }
    }

    @Timed(value = "companies.time", description = "Time taken to return all companies")
    open fun getAllCompanies(): Flux<CompanyModel> {
        return Flux.from(
            dsl.select(COMPANY.asterisk()).from(COMPANY)
        ).map { it.into(Company::class.java) }
            .map(converter::toModel)
    }

    fun getAllCompaniesByProfessionId(professionId: Long): Flux<CompanyModel> {
        return Flux.from(
            dsl.select(COMPANY.asterisk()).from(COMPANY)
                .where(
                    COMPANY.ID.`in`(
                        dsl.select(COMPANY_PROFESSION.COMPANY_ID).from(COMPANY_PROFESSION)
                            .where(COMPANY_PROFESSION.PROFESSION_ID.eq(professionId))
                    )
                )

        ).map { it.into(Company::class.java) }
            .map(converter::toModel)
    }

    fun getAllCompaniesByCountryCode(countryCode: Long): Flux<CompanyModel> {
        return Flux.from(
            dsl.select(COMPANY.asterisk()).from(COMPANY)
                .where(
                    COMPANY.ID.`in`(
                        dsl.select(OFFICE.COMPANY_ID).from(OFFICE)
                            .where(
                                OFFICE.ADDRESS_ID.`in`(
                                    dsl.select(ADDRESS.ID).from(ADDRESS)
                                        .where(
                                            ADDRESS.CITY_ID.`in`(
                                                dsl.select(CITY.ID).from(CITY)
                                                    .where(CITY.COUNTRY_CODE.eq(countryCode))
                                            )
                                        )
                                )
                            )
                    )
                )
        ).map { it.into(Company::class.java) }
            .map(converter::toModel)
    }

    fun getAllCompaniesByCityId(cityId: Long): Flux<CompanyModel> {
        return Flux.from(
            dsl.select(COMPANY.asterisk()).from(COMPANY)
                .where(
                    COMPANY.ID.`in`(
                        dsl.select(OFFICE.COMPANY_ID).from(OFFICE)
                            .where(
                                OFFICE.ADDRESS_ID.`in`(
                                    dsl.select(ADDRESS.ID).from(ADDRESS)
                                        .where(ADDRESS.CITY_ID.eq(cityId))
                                )
                            )
                    )
                )
        ).map { it.into(Company::class.java) }
            .map(converter::toModel)
    }

    fun insertCompany(companyModel: CompanyModel): Mono<CompanyModel> {
        return Mono.fromSupplier {
            val newCompanyRecord: CompanyRecord = dsl.newRecord(COMPANY)
            newCompanyRecord.from(companyModel)
            newCompanyRecord.reset(COMPANY.ID)
            newCompanyRecord.store()
            return@fromSupplier newCompanyRecord.into(Company::class.java)
        }
            .map(converter::toModel)
    }

    fun insertCompanyByPartnerId(partnerId: Long, companyModel: CompanyModel): Mono<CompanyModel> {
        return Mono.fromSupplier {
            val newCompanyRecord: CompanyRecord = dsl.newRecord(COMPANY)
            newCompanyRecord.from(companyModel)
            newCompanyRecord.reset(COMPANY.ID)
            newCompanyRecord.store()

            val newPartnerCompanyRecord: CompanyPartnerRecord = dsl.newRecord(COMPANY_PARTNER)
            newPartnerCompanyRecord.partnerId = partnerId
            newPartnerCompanyRecord.companyId = newCompanyRecord.id
            dsl.insertInto(COMPANY_PARTNER)
                .set(newPartnerCompanyRecord)
                .execute()
            return@fromSupplier newCompanyRecord.into(Company::class.java)
        }
            .map(converter::toModel)
    }

    fun updateCompany(companyModel: CompanyModel): Mono<Boolean> {
        return Mono.fromSupplier {
            val oldCompanyModel: CompanyModel = companyBlockingRepository.getById(companyModel.id!!)!!

            dsl.update(COMPANY)
                .set(
                    COMPANY.COMPANY_INDUSTRY,
                    companyModel.companyIndustry ?: oldCompanyModel.companyIndustry
                )
                .set(
                    COMPANY.LEGAL_CAPACITY_STATUS,
                    companyModel.legalCapacityStatus ?: oldCompanyModel.legalCapacityStatus
                )
                .set(COMPANY.NAME, companyModel.name ?: oldCompanyModel.name)
                .set(COMPANY.SITE, companyModel.site ?: oldCompanyModel.site)
                .set(COMPANY.SHORT_DESCRIPTION, companyModel.shortDescription ?: oldCompanyModel.shortDescription)
                .where(COMPANY.ID.eq(companyModel.id))
                .execute() == 1
        }
    }

    fun deleteCompany(companyId: Long): Mono<Boolean> {
        return Mono.fromSupplier {

            dsl.deleteFrom(COMPANY_PARTNER)
                .where(COMPANY_PARTNER.COMPANY_ID.eq(companyId))
                .execute()

            val returnResult = dsl.deleteFrom(COMPANY)
                .where(COMPANY.ID.eq(companyId))
                .execute() == 1

            dsl.deleteFrom(COMPANY_PROFESSION)
                .where(COMPANY_PROFESSION.COMPANY_ID.eq(companyId))
                .execute()

            return@fromSupplier returnResult
        }
    }
}