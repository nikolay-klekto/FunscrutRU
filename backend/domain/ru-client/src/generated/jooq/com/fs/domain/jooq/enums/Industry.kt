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
enum class Industry(@get:JvmName("literal") public val literal: String) : EnumType {
    `Economy and Business`("Economy and Business"),
    `Science and Technology`("Science and Technology"),
    `Education and Culture`("Education and Culture"),
    `Public Administration and Law`("Public Administration and Law"),
    `Healthcare and Medicine`("Healthcare and Medicine"),
    `Ecology and Agriculture`("Ecology and Agriculture"),
    OTHER("OTHER");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = DefaultSchema.DEFAULT_SCHEMA
    override fun getName(): String = "industry"
    override fun getLiteral(): String = literal
}
