package com.fs.client.repository.impl

import com.fs.client.repository.CompanyRepository
import com.fs.client.repository.blocked.CompanyBlockingRepository
import com.fs.client.converter.CompanyModelConverter
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
open class DefaultCompanyRepository(
    dsl: DSLContext,
    converter: CompanyModelConverter,
    companyBlockingRepository: CompanyBlockingRepository
) : CompanyRepository(dsl, converter, companyBlockingRepository)
