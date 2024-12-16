/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.EVENT_CATEGORY_PKEY
import com.fs.domain.jooq.tables.records.EventCategoriesRecord

import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventCategories(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, EventCategoriesRecord>?,
    aliased: Table<EventCategoriesRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<EventCategoriesRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.event_categories</code>
         */
        val EVENT_CATEGORIES: EventCategories = EventCategories()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventCategoriesRecord> = EventCategoriesRecord::class.java

    /**
     * The column <code>public.event_categories.id</code>.
     */
    val ID: TableField<EventCategoriesRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.event_categories.category</code>.
     */
    val CATEGORY: TableField<EventCategoriesRecord, String?> = createField(DSL.name("category"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.event_categories.description</code>.
     */
    val DESCRIPTION: TableField<EventCategoriesRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<EventCategoriesRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<EventCategoriesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.event_categories</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.event_categories</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.event_categories</code> table reference
     */
    constructor(): this(DSL.name("event_categories"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, EventCategoriesRecord>): this(Internal.createPathAlias(child, key), child, key, EVENT_CATEGORIES, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<EventCategoriesRecord, Long?> = super.getIdentity() as Identity<EventCategoriesRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<EventCategoriesRecord> = EVENT_CATEGORY_PKEY
    override fun `as`(alias: String): EventCategories = EventCategories(DSL.name(alias), this)
    override fun `as`(alias: Name): EventCategories = EventCategories(alias, this)
    override fun `as`(alias: Table<*>): EventCategories = EventCategories(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventCategories = EventCategories(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventCategories = EventCategories(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventCategories = EventCategories(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<Long?, String?, String?> = super.fieldsRow() as Row3<Long?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
