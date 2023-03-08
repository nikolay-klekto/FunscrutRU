package com.fs.client.repository.impl

import com.fs.client.repository.ClientRepository
import com.fs.client.repository.OrderRepository
import com.fs.client.service.OrderModelConverter
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
open class DefaultOrderRepository(
    dsl: DSLContext,
    converter: OrderModelConverter,
    clientRepository: ClientRepository
) : OrderRepository(dsl, converter, clientRepository)