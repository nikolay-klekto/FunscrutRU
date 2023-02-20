/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.enums


import com.fs.domain.jooq.Public

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class Currency(@get:JvmName("literal") public val literal: String) : EnumType {
    BYN("BYN"),
    USD("USD"),
    EUR("EUR"),
    RUB("RUB"),
    PLN("PLN");

    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "currency"
    override fun getLiteral(): String = literal
}
