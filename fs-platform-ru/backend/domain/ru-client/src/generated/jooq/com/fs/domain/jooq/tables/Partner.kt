/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.Public
import com.fs.domain.jooq.keys.PARTNER_PKEY
import com.fs.domain.jooq.keys.PARTNER__PARTNER_CLIENT_ID_FKEY
import com.fs.domain.jooq.tables.records.PartnerRecord
import org.jooq.*
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Partner(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PartnerRecord>?,
    aliased: Table<PartnerRecord>?,
    parameters: Array<Field<*>?>?
) : TableImpl<PartnerRecord>(
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
         * The reference instance of <code>public.partner</code>
         */
        val PARTNER: Partner = Partner()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PartnerRecord> = PartnerRecord::class.java

    /**
     * The column <code>public.partner.id</code>.
     */
    val ID: TableField<PartnerRecord, Long?> =
        createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.partner.client_id</code>.
     */
    val CLIENT_ID: TableField<PartnerRecord, Long?> = createField(DSL.name("client_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PartnerRecord>?) : this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PartnerRecord>?, parameters: Array<Field<*>?>?) : this(
        alias,
        null,
        null,
        aliased,
        parameters
    )

    /**
     * Create an aliased <code>public.partner</code> table reference
     */
    constructor(alias: String) : this(DSL.name(alias))

    /**
     * Create an aliased <code>public.partner</code> table reference
     */
    constructor(alias: Name) : this(alias, null)

    /**
     * Create a <code>public.partner</code> table reference
     */
    constructor() : this(DSL.name("partner"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, PartnerRecord>) : this(
        Internal.createPathAlias(
            child,
            key
        ), child, key, PARTNER, null
    )

    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<PartnerRecord, Long?> = super.getIdentity() as Identity<PartnerRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<PartnerRecord> = PARTNER_PKEY
    override fun getReferences(): List<ForeignKey<PartnerRecord, *>> = listOf(PARTNER__PARTNER_CLIENT_ID_FKEY)

    private lateinit var _client: Client

    /**
     * Get the implicit join path to the <code>public.client</code> table.
     */
    fun client(): Client {
        if (!this::_client.isInitialized)
            _client = Client(this, PARTNER__PARTNER_CLIENT_ID_FKEY)

        return _client;
    }
    override fun `as`(alias: String): Partner = Partner(DSL.name(alias), this)
    override fun `as`(alias: Name): Partner = Partner(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Partner = Partner(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Partner = Partner(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, Long?> = super.fieldsRow() as Row2<Long?, Long?>
}
