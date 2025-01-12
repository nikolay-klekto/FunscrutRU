/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.enums


import com.fs.domain.jooq.DefaultSchema

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class OrderStatus(@get:JvmName("literal") public val literal: String) : EnumType {
    EXPIRED("EXPIRED"),
    ACTUAL("ACTUAL"),
    PRE_ORDERED("PRE_ORDERED");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = DefaultSchema.DEFAULT_SCHEMA
    override fun getName(): String = "order_status"
    override fun getLiteral(): String = literal
}
