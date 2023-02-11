package com.fs.client.repository.impl

import com.fs.client.repository.ClientRepository
import com.fs.client.service.ClientModelConverter
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
open class DefaultClientRepository(dsl: DSLContext, converter: ClientModelConverter) : ClientRepository(dsl, converter)
