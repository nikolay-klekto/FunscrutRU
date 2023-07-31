/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.BASKET_PKEY
import com.fs.domain.jooq.tables.records.BasketRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row2
import org.jooq.Schema
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
open class Basket(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, BasketRecord>?,
    aliased: Table<BasketRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<BasketRecord>(
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
         * The reference instance of <code>public.basket</code>
         */
        val BASKET: Basket = Basket()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BasketRecord> = BasketRecord::class.java

    /**
     * The column <code>public.basket.id</code>.
     */
    val ID: TableField<BasketRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.basket.total_price</code>.
     */
    val TOTAL_PRICE: TableField<BasketRecord, Double?> = createField(DSL.name("total_price"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<BasketRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<BasketRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.basket</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.basket</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.basket</code> table reference
     */
    constructor(): this(DSL.name("basket"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, BasketRecord>): this(Internal.createPathAlias(child, key), child, key, BASKET, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<BasketRecord, Long?> = super.getIdentity() as Identity<BasketRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<BasketRecord> = BASKET_PKEY
    override fun `as`(alias: String): Basket = Basket(DSL.name(alias), this)
    override fun `as`(alias: Name): Basket = Basket(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Basket = Basket(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Basket = Basket(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, Double?> = super.fieldsRow() as Row2<Long?, Double?>
}
