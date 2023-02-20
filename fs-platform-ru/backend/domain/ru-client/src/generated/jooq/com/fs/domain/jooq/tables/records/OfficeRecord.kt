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
open class OfficeRecord() : UpdatableRecordImpl<OfficeRecord>(Office.OFFICE), Record4<Int?, Int?, Int?, String?> {

    var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var addressId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    var companyId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    var phoneNumber: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Int?, Int?, Int?, String?> = super.fieldsRow() as Row4<Int?, Int?, Int?, String?>
    override fun valuesRow(): Row4<Int?, Int?, Int?, String?> = super.valuesRow() as Row4<Int?, Int?, Int?, String?>
    override fun field1(): Field<Int?> = Office.OFFICE.ID
    override fun field2(): Field<Int?> = Office.OFFICE.ADDRESS_ID
    override fun field3(): Field<Int?> = Office.OFFICE.COMPANY_ID
    override fun field4(): Field<String?> = Office.OFFICE.PHONE_NUMBER
    override fun component1(): Int? = id
    override fun component2(): Int? = addressId
    override fun component3(): Int? = companyId
    override fun component4(): String? = phoneNumber
    override fun value1(): Int? = id
    override fun value2(): Int? = addressId
    override fun value3(): Int? = companyId
    override fun value4(): String? = phoneNumber

    override fun value1(value: Int?): OfficeRecord {
        this.id = value
        return this
    }

    override fun value2(value: Int?): OfficeRecord {
        this.addressId = value
        return this
    }

    override fun value3(value: Int?): OfficeRecord {
        this.companyId = value
        return this
    }

    override fun value4(value: String?): OfficeRecord {
        this.phoneNumber = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: Int?, value4: String?): OfficeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(id: Int? = null, addressId: Int? = null, companyId: Int? = null, phoneNumber: String? = null) : this() {
        this.id = id
        this.addressId = addressId
        this.companyId = companyId
        this.phoneNumber = phoneNumber
    }

    /**
     * Create a detached, initialised OfficeRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Office?) : this() {
        if (value != null) {
            this.id = value.id
            this.addressId = value.addressId
            this.companyId = value.companyId
            this.phoneNumber = value.phoneNumber
        }
    }
}
