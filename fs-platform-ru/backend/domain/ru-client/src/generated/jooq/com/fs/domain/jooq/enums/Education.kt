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
enum class Education(@get:JvmName("literal") public val literal: String) : EnumType {
    LOWER_SECONDARY("LOWER_SECONDARY"),
    SECONDARY("SECONDARY"),
    INCOMPLETE_HIGHER("INCOMPLETE_HIGHER"),
    HIGHER("HIGHER"),
    MAGISTRACY("MAGISTRACY"),
    OTHER("OTHER");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "education"
    override fun getLiteral(): String = literal
}
