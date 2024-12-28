/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.DefaultSchema
import com.fs.domain.jooq.keys.DATABASECHANGELOGLOCK_PKEY
import com.fs.domain.jooq.tables.records.DatabasechangeloglockRecord

import java.time.LocalDateTime
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
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
open class Databasechangeloglock(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DatabasechangeloglockRecord>?,
    aliased: Table<DatabasechangeloglockRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DatabasechangeloglockRecord>(
    alias,
    DefaultSchema.DEFAULT_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>databasechangeloglock</code>
         */
        val DATABASECHANGELOGLOCK: Databasechangeloglock = Databasechangeloglock()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DatabasechangeloglockRecord> = DatabasechangeloglockRecord::class.java

    /**
     * The column <code>databasechangeloglock.id</code>.
     */
    val ID: TableField<DatabasechangeloglockRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>databasechangeloglock.locked</code>.
     */
    val LOCKED: TableField<DatabasechangeloglockRecord, Boolean?> = createField(DSL.name("locked"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>databasechangeloglock.lockgranted</code>.
     */
    val LOCKGRANTED: TableField<DatabasechangeloglockRecord, LocalDateTime?> = createField(DSL.name("lockgranted"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>databasechangeloglock.lockedby</code>.
     */
    val LOCKEDBY: TableField<DatabasechangeloglockRecord, String?> = createField(DSL.name("lockedby"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<DatabasechangeloglockRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DatabasechangeloglockRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>databasechangeloglock</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>databasechangeloglock</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>databasechangeloglock</code> table reference
     */
    constructor(): this(DSL.name("databasechangeloglock"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DatabasechangeloglockRecord>): this(Internal.createPathAlias(child, key), child, key, DATABASECHANGELOGLOCK, null)
    override fun getSchema(): Schema? = if (aliased()) null else DefaultSchema.DEFAULT_SCHEMA
    override fun getPrimaryKey(): UniqueKey<DatabasechangeloglockRecord> = DATABASECHANGELOGLOCK_PKEY
    override fun `as`(alias: String): Databasechangeloglock = Databasechangeloglock(DSL.name(alias), this)
    override fun `as`(alias: Name): Databasechangeloglock = Databasechangeloglock(alias, this)
    override fun `as`(alias: Table<*>): Databasechangeloglock = Databasechangeloglock(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Databasechangeloglock = Databasechangeloglock(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Databasechangeloglock = Databasechangeloglock(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Databasechangeloglock = Databasechangeloglock(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Int?, Boolean?, LocalDateTime?, String?> = super.fieldsRow() as Row4<Int?, Boolean?, LocalDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, Boolean?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, Boolean?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
