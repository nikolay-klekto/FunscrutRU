/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables


import com.fs.client.ru.enums.ClientRoleModel
import com.fs.client.ru.enums.EducationModel
import com.fs.client.ru.enums.EmploymentModel
import com.fs.domain.jooq.Public
import com.fs.domain.jooq.enums.Education
import com.fs.domain.jooq.enums.Employment
import com.fs.domain.jooq.enums.Role
import com.fs.domain.jooq.keys.CLIENT_PKEY
import com.fs.domain.jooq.keys.CLIENT__CLIENT_BASKET_ID_FKEY
import com.fs.domain.jooq.keys.CLIENT__CLIENT_CITY_ID_FKEY
import com.fs.domain.jooq.tables.records.ClientRecord
import org.jooq.*
import org.jooq.impl.*
import org.jooq.impl.Internal
import java.time.LocalDate
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Client(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ClientRecord>?,
    aliased: Table<ClientRecord>?,
    parameters: Array<Field<*>?>?
) : TableImpl<ClientRecord>(
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
         * The reference instance of <code>public.client</code>
         */
        val CLIENT: Client = Client()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ClientRecord> = ClientRecord::class.java

    /**
     * The column <code>public.client.id</code>.
     */
    val ID: TableField<ClientRecord, Long?> =
        createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.client.basket_id</code>.
     */
    val BASKET_ID: TableField<ClientRecord, Long?> = createField(DSL.name("basket_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.client.city_id</code>.
     */
    val CITY_ID: TableField<ClientRecord, Long?> = createField(DSL.name("city_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.client.activate_status</code>.
     */
    val ACTIVATE_STATUS: TableField<ClientRecord, Boolean?> =
        createField(DSL.name("activate_status"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.client.birthday</code>.
     */
    val BIRTHDAY: TableField<ClientRecord, LocalDate?> =
        createField(DSL.name("birthday"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>public.client.date_created</code>.
     */
    val DATE_CREATED: TableField<ClientRecord, LocalDateTime?> =
        createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.client.education_status</code>.
     */
    val EDUCATION_STATUS: TableField<ClientRecord, EducationModel?> = createField(
        DSL.name("education_status"),
        SQLDataType.VARCHAR.asEnumDataType(com.fs.domain.jooq.enums.Education::class.java),
        this,
        "",
        EnumConverter<Education, EducationModel>(Education::class.java, EducationModel::class.java)
    )

    /**
     * The column <code>public.client.email</code>.
     */
    val EMAIL: TableField<ClientRecord, String?> = createField(DSL.name("email"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.employment</code>.
     */
    val EMPLOYMENT: TableField<ClientRecord, EmploymentModel?> = createField(
        DSL.name("employment"),
        SQLDataType.VARCHAR.asEnumDataType(com.fs.domain.jooq.enums.Employment::class.java),
        this,
        "",
        EnumConverter<Employment, EmploymentModel>(Employment::class.java, EmploymentModel::class.java)
    )

    /**
     * The column <code>public.client.first_name</code>.
     */
    val FIRST_NAME: TableField<ClientRecord, String?> =
        createField(DSL.name("first_name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.last_name</code>.
     */
    val LAST_NAME: TableField<ClientRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.password</code>.
     */
    val PASSWORD: TableField<ClientRecord, String?> = createField(DSL.name("password"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.phone_number</code>.
     */
    val PHONE_NUMBER: TableField<ClientRecord, String?> =
        createField(DSL.name("phone_number"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.role</code>.
     */
    val ROLE: TableField<ClientRecord, ClientRoleModel?> = createField(
        DSL.name("role"),
        SQLDataType.VARCHAR.asEnumDataType(com.fs.domain.jooq.enums.Role::class.java),
        this,
        "",
        EnumConverter<Role, ClientRoleModel>(Role::class.java, ClientRoleModel::class.java)
    )

    /**
     * The column <code>public.client.telegram_username</code>.
     */
    val TELEGRAM_USERNAME: TableField<ClientRecord, String?> =
        createField(DSL.name("telegram_username"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.client.username</code>.
     */
    val USERNAME: TableField<ClientRecord, String?> = createField(DSL.name("username"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<ClientRecord>?) : this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ClientRecord>?, parameters: Array<Field<*>?>?) : this(
        alias,
        null,
        null,
        aliased,
        parameters
    )

    /**
     * Create an aliased <code>public.client</code> table reference
     */
    constructor(alias: String) : this(DSL.name(alias))

    /**
     * Create an aliased <code>public.client</code> table reference
     */
    constructor(alias: Name) : this(alias, null)

    /**
     * Create a <code>public.client</code> table reference
     */
    constructor() : this(DSL.name("client"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ClientRecord>) : this(
        Internal.createPathAlias(
            child,
            key
        ), child, key, CLIENT, null
    )
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<ClientRecord, Long?> = super.getIdentity() as Identity<ClientRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<ClientRecord> = CLIENT_PKEY
    override fun getReferences(): List<ForeignKey<ClientRecord, *>> =
        listOf(CLIENT__CLIENT_BASKET_ID_FKEY, CLIENT__CLIENT_CITY_ID_FKEY)

    private lateinit var _basket: Basket
    private lateinit var _city: City

    /**
     * Get the implicit join path to the <code>public.basket</code> table.
     */
    fun basket(): Basket {
        if (!this::_basket.isInitialized)
            _basket = Basket(this, CLIENT__CLIENT_BASKET_ID_FKEY)

        return _basket;
    }

    /**
     * Get the implicit join path to the <code>public.city</code> table.
     */
    fun city(): City {
        if (!this::_city.isInitialized)
            _city = City(this, CLIENT__CLIENT_CITY_ID_FKEY)

        return _city;
    }

    override fun `as`(alias: String): Client = Client(DSL.name(alias), this)
    override fun `as`(alias: Name): Client = Client(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Client = Client(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Client = Client(name, null)

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row16<Long?, Long?, Long?, Boolean?, LocalDate?, LocalDateTime?, EducationModel?, String?, EmploymentModel?, String?, String?, String?, String?, ClientRoleModel?, String?, String?> =
        super.fieldsRow() as Row16<Long?, Long?, Long?, Boolean?, LocalDate?, LocalDateTime?, EducationModel?, String?, EmploymentModel?, String?, String?, String?, String?, ClientRoleModel?, String?, String?>
}
