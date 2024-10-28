/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.COMPANY_PKEY
import com.fs.domain.jooq.tables.records.CompanyRecord
import com.fs.service.ru.enums.CompanyLegalCapacityStatus

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row6
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.EnumConverter
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Company(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CompanyRecord>?,
    aliased: Table<CompanyRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CompanyRecord>(
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
         * The reference instance of <code>public.company</code>
         */
        val COMPANY: Company = Company()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CompanyRecord> = CompanyRecord::class.java

    /**
     * The column <code>public.company.id</code>.
     */
    val ID: TableField<CompanyRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.company.company_industry</code>.
     */
    val COMPANY_INDUSTRY: TableField<CompanyRecord, String?> = createField(DSL.name("company_industry"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.company.legal_capacity_status</code>.
     */
    val LEGAL_CAPACITY_STATUS: TableField<CompanyRecord, CompanyLegalCapacityStatus?> = createField(DSL.name("legal_capacity_status"), SQLDataType.VARCHAR, this, "", EnumConverter<String, CompanyLegalCapacityStatus>(String::class.java, CompanyLegalCapacityStatus::class.java))

    /**
     * The column <code>public.company.name</code>.
     */
    val NAME: TableField<CompanyRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.company.site</code>.
     */
    val SITE: TableField<CompanyRecord, String?> = createField(DSL.name("site"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.company.short_description</code>.
     */
    val SHORT_DESCRIPTION: TableField<CompanyRecord, String?> = createField(DSL.name("short_description"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<CompanyRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CompanyRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.company</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.company</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.company</code> table reference
     */
    constructor(): this(DSL.name("company"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CompanyRecord>): this(Internal.createPathAlias(child, key), child, key, COMPANY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CompanyRecord, Long?> = super.getIdentity() as Identity<CompanyRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CompanyRecord> = COMPANY_PKEY
    override fun `as`(alias: String): Company = Company(DSL.name(alias), this)
    override fun `as`(alias: Name): Company = Company(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Company = Company(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Company = Company(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Long?, String?, CompanyLegalCapacityStatus?, String?, String?, String?> = super.fieldsRow() as Row6<Long?, String?, CompanyLegalCapacityStatus?, String?, String?, String?>
}
