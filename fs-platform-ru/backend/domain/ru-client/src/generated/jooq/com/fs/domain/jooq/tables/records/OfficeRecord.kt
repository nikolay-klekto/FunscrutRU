/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.Office

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class OfficeRecord() : UpdatableRecordImpl<OfficeRecord>(Office.OFFICE), Record4<Long?, Long?, Long?, String?> {

    var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var addressId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    var companyId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    var phoneNumber: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Long?, Long?, Long?, String?> = super.fieldsRow() as Row4<Long?, Long?, Long?, String?>
    override fun valuesRow(): Row4<Long?, Long?, Long?, String?> = super.valuesRow() as Row4<Long?, Long?, Long?, String?>
    override fun field1(): Field<Long?> = Office.OFFICE.ID
    override fun field2(): Field<Long?> = Office.OFFICE.ADDRESS_ID
    override fun field3(): Field<Long?> = Office.OFFICE.COMPANY_ID
    override fun field4(): Field<String?> = Office.OFFICE.PHONE_NUMBER
    override fun component1(): Long? = id
    override fun component2(): Long? = addressId
    override fun component3(): Long? = companyId
    override fun component4(): String? = phoneNumber
    override fun value1(): Long? = id
    override fun value2(): Long? = addressId
    override fun value3(): Long? = companyId
    override fun value4(): String? = phoneNumber

    override fun value1(value: Long?): OfficeRecord {
        this.id = value
        return this
    }

    override fun value2(value: Long?): OfficeRecord {
        this.addressId = value
        return this
    }

    override fun value3(value: Long?): OfficeRecord {
        this.companyId = value
        return this
    }

    override fun value4(value: String?): OfficeRecord {
        this.phoneNumber = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: Long?, value4: String?): OfficeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(id: Long? = null, addressId: Long? = null, companyId: Long? = null, phoneNumber: String? = null): this() {
        this.id = id
        this.addressId = addressId
        this.companyId = companyId
        this.phoneNumber = phoneNumber
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Office?): this() {
        if (value != null) {
            this.id = value.id
            this.addressId = value.addressId
            this.companyId = value.companyId
            this.phoneNumber = value.phoneNumber
        }
    }
}