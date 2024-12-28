/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.domain.jooq.DefaultSchema
import com.fs.domain.jooq.keys.CLIENTS_REFRESH_TOKENS_PKEY
import com.fs.domain.jooq.keys.CLIENTS_REFRESH_TOKENS__CLIENTS_REFRESH_TOKENS_CLIENT_ID_FKEY
import com.fs.domain.jooq.tables.records.ClientsRefreshTokensRecord

import java.time.LocalDate
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
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
open class ClientsRefreshTokens(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ClientsRefreshTokensRecord>?,
    aliased: Table<ClientsRefreshTokensRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ClientsRefreshTokensRecord>(
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
         * The reference instance of <code>clients_refresh_tokens</code>
         */
        val CLIENTS_REFRESH_TOKENS: ClientsRefreshTokens = ClientsRefreshTokens()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ClientsRefreshTokensRecord> = ClientsRefreshTokensRecord::class.java

    /**
     * The column <code>clients_refresh_tokens.id</code>.
     */
    val ID: TableField<ClientsRefreshTokensRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>clients_refresh_tokens.client_id</code>.
     */
    val CLIENT_ID: TableField<ClientsRefreshTokensRecord, String?> = createField(DSL.name("client_id"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>clients_refresh_tokens.token</code>.
     */
    val TOKEN: TableField<ClientsRefreshTokensRecord, String?> = createField(DSL.name("token"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>clients_refresh_tokens.expiry_day</code>.
     */
    val EXPIRY_DAY: TableField<ClientsRefreshTokensRecord, LocalDate?> = createField(DSL.name("expiry_day"), SQLDataType.LOCALDATE, this, "")

    private constructor(alias: Name, aliased: Table<ClientsRefreshTokensRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ClientsRefreshTokensRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>clients_refresh_tokens</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>clients_refresh_tokens</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>clients_refresh_tokens</code> table reference
     */
    constructor(): this(DSL.name("clients_refresh_tokens"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ClientsRefreshTokensRecord>): this(Internal.createPathAlias(child, key), child, key, CLIENTS_REFRESH_TOKENS, null)
    override fun getSchema(): Schema? = if (aliased()) null else DefaultSchema.DEFAULT_SCHEMA
    override fun getIdentity(): Identity<ClientsRefreshTokensRecord, Long?> = super.getIdentity() as Identity<ClientsRefreshTokensRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<ClientsRefreshTokensRecord> = CLIENTS_REFRESH_TOKENS_PKEY
    override fun getReferences(): List<ForeignKey<ClientsRefreshTokensRecord, *>> = listOf(CLIENTS_REFRESH_TOKENS__CLIENTS_REFRESH_TOKENS_CLIENT_ID_FKEY)

    private lateinit var _client: Client

    /**
     * Get the implicit join path to the <code>public.client</code> table.
     */
    fun client(): Client {
        if (!this::_client.isInitialized)
            _client = Client(this, CLIENTS_REFRESH_TOKENS__CLIENTS_REFRESH_TOKENS_CLIENT_ID_FKEY)

        return _client;
    }

    val client: Client
        get(): Client = client()
    override fun `as`(alias: String): ClientsRefreshTokens = ClientsRefreshTokens(DSL.name(alias), this)
    override fun `as`(alias: Name): ClientsRefreshTokens = ClientsRefreshTokens(alias, this)
    override fun `as`(alias: Table<*>): ClientsRefreshTokens = ClientsRefreshTokens(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ClientsRefreshTokens = ClientsRefreshTokens(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ClientsRefreshTokens = ClientsRefreshTokens(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ClientsRefreshTokens = ClientsRefreshTokens(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Long?, String?, String?, LocalDate?> = super.fieldsRow() as Row4<Long?, String?, String?, LocalDate?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, LocalDate?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, LocalDate?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
