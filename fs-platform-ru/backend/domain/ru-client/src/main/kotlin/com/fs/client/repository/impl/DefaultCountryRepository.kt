package com.fs.client.repository.impl

import com.fs.client.repository.CountryRepository
import com.fs.client.service.CountryModelConverter
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
open class DefaultCountryRepository(
    dsl: DSLContext,
    converter: CountryModelConverter
) : CountryRepository(dsl, converter) {
}