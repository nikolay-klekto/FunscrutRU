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
enum class CompanyLegalCapacityStatus(@get:JvmName("literal") public val literal: String) : EnumType {
    CAPABLE("CAPABLE"),
    TEMPORARILY_UNAVAILABLE("TEMPORARILY_UNAVAILABLE"),
    CLOSED("CLOSED");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "company_legal_capacity_status"
    override fun getLiteral(): String = literal
}
