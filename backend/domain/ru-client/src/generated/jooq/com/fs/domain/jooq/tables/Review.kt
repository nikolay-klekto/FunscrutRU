/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.REVIEW_PKEY
import com.fs.domain.jooq.keys.REVIEW__REVIEW_CLIENT_ID_FKEY
import com.fs.domain.jooq.keys.REVIEW__REVIEW_COMPANY_ID_FKEY
import com.fs.domain.jooq.tables.records.ReviewRecord

import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row7
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
open class Review(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ReviewRecord>?,
    aliased: Table<ReviewRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ReviewRecord>(
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
         * The reference instance of <code>public.review</code>
         */
        val REVIEW: Review = Review()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReviewRecord> = ReviewRecord::class.java

    /**
     * The column <code>public.review.id</code>.
     */
    val ID: TableField<ReviewRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.review.company_id</code>.
     */
    val COMPANY_ID: TableField<ReviewRecord, Long?> = createField(DSL.name("company_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.review.client_id</code>.
     */
    val CLIENT_ID: TableField<ReviewRecord, String?> = createField(DSL.name("client_id"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.review.date_created</code>.
     */
    val DATE_CREATED: TableField<ReviewRecord, LocalDateTime?> = createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.review.description</code>.
     */
    val DESCRIPTION: TableField<ReviewRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.review.rate</code>.
     */
    val RATE: TableField<ReviewRecord, Long?> = createField(DSL.name("rate"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.review.username</code>.
     */
    val USERNAME: TableField<ReviewRecord, String?> = createField(DSL.name("username"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<ReviewRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ReviewRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.review</code> table reference
     */
    constructor(): this(DSL.name("review"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ReviewRecord>): this(Internal.createPathAlias(child, key), child, key, REVIEW, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<ReviewRecord, Long?> = super.getIdentity() as Identity<ReviewRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<ReviewRecord> = REVIEW_PKEY
    override fun getReferences(): List<ForeignKey<ReviewRecord, *>> = listOf(REVIEW__REVIEW_COMPANY_ID_FKEY, REVIEW__REVIEW_CLIENT_ID_FKEY)

    private lateinit var _company: Company
    private lateinit var _client: Client

    /**
     * Get the implicit join path to the <code>public.company</code> table.
     */
    fun company(): Company {
        if (!this::_company.isInitialized)
            _company = Company(this, REVIEW__REVIEW_COMPANY_ID_FKEY)

        return _company;
    }

    val company: Company
        get(): Company = company()

    /**
     * Get the implicit join path to the <code>public.client</code> table.
     */
    fun client(): Client {
        if (!this::_client.isInitialized)
            _client = Client(this, REVIEW__REVIEW_CLIENT_ID_FKEY)

        return _client;
    }

    val client: Client
        get(): Client = client()
    override fun `as`(alias: String): Review = Review(DSL.name(alias), this)
    override fun `as`(alias: Name): Review = Review(alias, this)
    override fun `as`(alias: Table<*>): Review = Review(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Review = Review(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Review = Review(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Review = Review(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?> = super.fieldsRow() as Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, String?, LocalDateTime?, String?, Long?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, String?, LocalDateTime?, String?, Long?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
