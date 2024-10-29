/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.COMPANY_PROFESSION_PKEY
import com.fs.domain.jooq.keys.COMPANY_PROFESSION__COMPANY_PROFESSION_COMPANY_ID_FKEY
import com.fs.domain.jooq.keys.COMPANY_PROFESSION__COMPANY_PROFESSION_INTERNSHIP_TYPE_ID_FKEY
import com.fs.domain.jooq.keys.COMPANY_PROFESSION__COMPANY_PROFESSION_PROFESSION_ID_FKEY
import com.fs.domain.jooq.tables.records.CompanyProfessionRecord

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row5
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
open class CompanyProfession(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CompanyProfessionRecord>?,
    aliased: Table<CompanyProfessionRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CompanyProfessionRecord>(
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
         * The reference instance of <code>public.company_profession</code>
         */
        val COMPANY_PROFESSION: CompanyProfession = CompanyProfession()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CompanyProfessionRecord> = CompanyProfessionRecord::class.java

    /**
     * The column <code>public.company_profession.id</code>.
     */
    val ID: TableField<CompanyProfessionRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.company_profession.company_id</code>.
     */
    val COMPANY_ID: TableField<CompanyProfessionRecord, Long?> = createField(DSL.name("company_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.company_profession.internship_type_id</code>.
     */
    val INTERNSHIP_TYPE_ID: TableField<CompanyProfessionRecord, Long?> = createField(DSL.name("internship_type_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.company_profession.price_per_day</code>.
     */
    val PRICE_PER_DAY: TableField<CompanyProfessionRecord, Double?> = createField(DSL.name("price_per_day"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.company_profession.profession_id</code>.
     */
    val PROFESSION_ID: TableField<CompanyProfessionRecord, Long?> = createField(DSL.name("profession_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<CompanyProfessionRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CompanyProfessionRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.company_profession</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.company_profession</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.company_profession</code> table reference
     */
    constructor(): this(DSL.name("company_profession"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CompanyProfessionRecord>): this(Internal.createPathAlias(child, key), child, key, COMPANY_PROFESSION, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CompanyProfessionRecord, Long?> = super.getIdentity() as Identity<CompanyProfessionRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CompanyProfessionRecord> = COMPANY_PROFESSION_PKEY
    override fun getReferences(): List<ForeignKey<CompanyProfessionRecord, *>> = listOf(COMPANY_PROFESSION__COMPANY_PROFESSION_COMPANY_ID_FKEY, COMPANY_PROFESSION__COMPANY_PROFESSION_INTERNSHIP_TYPE_ID_FKEY, COMPANY_PROFESSION__COMPANY_PROFESSION_PROFESSION_ID_FKEY)

    private lateinit var _company: Company
    private lateinit var _internshipType: InternshipType
    private lateinit var _profession: Profession

    /**
     * Get the implicit join path to the <code>public.company</code> table.
     */
    fun company(): Company {
        if (!this::_company.isInitialized)
            _company = Company(this, COMPANY_PROFESSION__COMPANY_PROFESSION_COMPANY_ID_FKEY)

        return _company;
    }

    /**
     * Get the implicit join path to the <code>public.internship_type</code>
     * table.
     */
    fun internshipType(): InternshipType {
        if (!this::_internshipType.isInitialized)
            _internshipType = InternshipType(this, COMPANY_PROFESSION__COMPANY_PROFESSION_INTERNSHIP_TYPE_ID_FKEY)

        return _internshipType;
    }

    /**
     * Get the implicit join path to the <code>public.profession</code> table.
     */
    fun profession(): Profession {
        if (!this::_profession.isInitialized)
            _profession = Profession(this, COMPANY_PROFESSION__COMPANY_PROFESSION_PROFESSION_ID_FKEY)

        return _profession;
    }
    override fun `as`(alias: String): CompanyProfession = CompanyProfession(DSL.name(alias), this)
    override fun `as`(alias: Name): CompanyProfession = CompanyProfession(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CompanyProfession = CompanyProfession(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CompanyProfession = CompanyProfession(name, null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<Long?, Long?, Long?, Double?, Long?> = super.fieldsRow() as Row5<Long?, Long?, Long?, Double?, Long?>
}
