/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.City

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CityRecord() : UpdatableRecordImpl<CityRecord>(City.CITY), Record3<Long?, Long?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var countryCode: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var name: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Long?, Long?, String?> = super.fieldsRow() as Row3<Long?, Long?, String?>
    override fun valuesRow(): Row3<Long?, Long?, String?> = super.valuesRow() as Row3<Long?, Long?, String?>
    override fun field1(): Field<Long?> = City.CITY.ID
    override fun field2(): Field<Long?> = City.CITY.COUNTRY_CODE
    override fun field3(): Field<String?> = City.CITY.NAME
    override fun component1(): Long? = id
    override fun component2(): Long? = countryCode
    override fun component3(): String? = name
    override fun value1(): Long? = id
    override fun value2(): Long? = countryCode
    override fun value3(): String? = name

    override fun value1(value: Long?): CityRecord {
        this.id = value
        return this
    }

    override fun value2(value: Long?): CityRecord {
        this.countryCode = value
        return this
    }

    override fun value3(value: String?): CityRecord {
        this.name = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: String?): CityRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(id: Long? = null, countryCode: Long? = null, name: String? = null): this() {
        this.id = id
        this.countryCode = countryCode
        this.name = name
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.City?): this() {
        if (value != null) {
            this.id = value.id
            this.countryCode = value.countryCode
            this.name = value.name
        }
    }
}
