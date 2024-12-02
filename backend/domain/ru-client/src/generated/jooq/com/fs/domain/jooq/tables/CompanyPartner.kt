/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.COMPANY_PARTNER_PKEY
import com.fs.domain.jooq.keys.COMPANY_PARTNER__COMPANY_PARTNER_COMPANY_ID_FKEY
import com.fs.domain.jooq.keys.COMPANY_PARTNER__COMPANY_PARTNER_PARTNER_ID_FKEY
import com.fs.domain.jooq.tables.records.CompanyPartnerRecord

import java.util.function.Function

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row2
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
open class CompanyPartner(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CompanyPartnerRecord>?,
    aliased: Table<CompanyPartnerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CompanyPartnerRecord>(
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
         * The reference instance of <code>public.company_partner</code>
         */
        val COMPANY_PARTNER: CompanyPartner = CompanyPartner()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CompanyPartnerRecord> = CompanyPartnerRecord::class.java

    /**
     * The column <code>public.company_partner.company_id</code>.
     */
    val COMPANY_ID: TableField<CompanyPartnerRecord, Long?> = createField(DSL.name("company_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.company_partner.partner_id</code>.
     */
    val PARTNER_ID: TableField<CompanyPartnerRecord, Long?> = createField(DSL.name("partner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CompanyPartnerRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CompanyPartnerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.company_partner</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.company_partner</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.company_partner</code> table reference
     */
    constructor(): this(DSL.name("company_partner"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CompanyPartnerRecord>): this(Internal.createPathAlias(child, key), child, key, COMPANY_PARTNER, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CompanyPartnerRecord> = COMPANY_PARTNER_PKEY
    override fun getReferences(): List<ForeignKey<CompanyPartnerRecord, *>> = listOf(COMPANY_PARTNER__COMPANY_PARTNER_COMPANY_ID_FKEY, COMPANY_PARTNER__COMPANY_PARTNER_PARTNER_ID_FKEY)

    private lateinit var _company: Company
    private lateinit var _partner: Partner

    /**
     * Get the implicit join path to the <code>public.company</code> table.
     */
    fun company(): Company {
        if (!this::_company.isInitialized)
            _company = Company(this, COMPANY_PARTNER__COMPANY_PARTNER_COMPANY_ID_FKEY)

        return _company;
    }

    val company: Company
        get(): Company = company()

    /**
     * Get the implicit join path to the <code>public.partner</code> table.
     */
    fun partner(): Partner {
        if (!this::_partner.isInitialized)
            _partner = Partner(this, COMPANY_PARTNER__COMPANY_PARTNER_PARTNER_ID_FKEY)

        return _partner;
    }

    val partner: Partner
        get(): Partner = partner()
    override fun `as`(alias: String): CompanyPartner = CompanyPartner(DSL.name(alias), this)
    override fun `as`(alias: Name): CompanyPartner = CompanyPartner(alias, this)
    override fun `as`(alias: Table<*>): CompanyPartner = CompanyPartner(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CompanyPartner = CompanyPartner(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CompanyPartner = CompanyPartner(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CompanyPartner = CompanyPartner(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, Long?> = super.fieldsRow() as Row2<Long?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
