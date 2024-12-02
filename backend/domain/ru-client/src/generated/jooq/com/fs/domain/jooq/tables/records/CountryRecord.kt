/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.Country

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CountryRecord() : UpdatableRecordImpl<CountryRecord>(Country.COUNTRY), Record3<Long?, String?, String?> {

    open var code: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var currency: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

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

    override fun fieldsRow(): Row3<Long?, String?, String?> = super.fieldsRow() as Row3<Long?, String?, String?>
    override fun valuesRow(): Row3<Long?, String?, String?> = super.valuesRow() as Row3<Long?, String?, String?>
    override fun field1(): Field<Long?> = Country.COUNTRY.CODE
    override fun field2(): Field<String?> = Country.COUNTRY.CURRENCY
    override fun field3(): Field<String?> = Country.COUNTRY.NAME
    override fun component1(): Long? = code
    override fun component2(): String? = currency
    override fun component3(): String? = name
    override fun value1(): Long? = code
    override fun value2(): String? = currency
    override fun value3(): String? = name

    override fun value1(value: Long?): CountryRecord {
        this.code = value
        return this
    }

    override fun value2(value: String?): CountryRecord {
        this.currency = value
        return this
    }

    override fun value3(value: String?): CountryRecord {
        this.name = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?): CountryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    constructor(code: Long? = null, currency: String? = null, name: String? = null): this() {
        this.code = code
        this.currency = currency
        this.name = name
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Country?): this() {
        if (value != null) {
            this.code = value.code
            this.currency = value.currency
            this.name = value.name
        }
    }
}
