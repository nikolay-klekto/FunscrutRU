/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.CompanyProfession

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CompanyProfessionRecord() : UpdatableRecordImpl<CompanyProfessionRecord>(CompanyProfession.COMPANY_PROFESSION), Record5<Long?, Long?, Long?, Double?, Long?> {

    var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var companyId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    var internshipTypeId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    var pricePerDay: Double?
        set(value): Unit = set(3, value)
        get(): Double? = get(3) as Double?

    var professionId: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<Long?, Long?, Long?, Double?, Long?> = super.fieldsRow() as Row5<Long?, Long?, Long?, Double?, Long?>
    override fun valuesRow(): Row5<Long?, Long?, Long?, Double?, Long?> = super.valuesRow() as Row5<Long?, Long?, Long?, Double?, Long?>
    override fun field1(): Field<Long?> = CompanyProfession.COMPANY_PROFESSION.ID
    override fun field2(): Field<Long?> = CompanyProfession.COMPANY_PROFESSION.COMPANY_ID
    override fun field3(): Field<Long?> = CompanyProfession.COMPANY_PROFESSION.INTERNSHIP_TYPE_ID
    override fun field4(): Field<Double?> = CompanyProfession.COMPANY_PROFESSION.PRICE_PER_DAY
    override fun field5(): Field<Long?> = CompanyProfession.COMPANY_PROFESSION.PROFESSION_ID
    override fun component1(): Long? = id
    override fun component2(): Long? = companyId
    override fun component3(): Long? = internshipTypeId
    override fun component4(): Double? = pricePerDay
    override fun component5(): Long? = professionId
    override fun value1(): Long? = id
    override fun value2(): Long? = companyId
    override fun value3(): Long? = internshipTypeId
    override fun value4(): Double? = pricePerDay
    override fun value5(): Long? = professionId

    override fun value1(value: Long?): CompanyProfessionRecord {
        this.id = value
        return this
    }

    override fun value2(value: Long?): CompanyProfessionRecord {
        this.companyId = value
        return this
    }

    override fun value3(value: Long?): CompanyProfessionRecord {
        this.internshipTypeId = value
        return this
    }

    override fun value4(value: Double?): CompanyProfessionRecord {
        this.pricePerDay = value
        return this
    }

    override fun value5(value: Long?): CompanyProfessionRecord {
        this.professionId = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: Long?, value4: Double?, value5: Long?): CompanyProfessionRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised CompanyProfessionRecord
     */
    constructor(id: Long? = null, companyId: Long? = null, internshipTypeId: Long? = null, pricePerDay: Double? = null, professionId: Long? = null): this() {
        this.id = id
        this.companyId = companyId
        this.internshipTypeId = internshipTypeId
        this.pricePerDay = pricePerDay
        this.professionId = professionId
    }

    /**
     * Create a detached, initialised CompanyProfessionRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.CompanyProfession?): this() {
        if (value != null) {
            this.id = value.id
            this.companyId = value.companyId
            this.internshipTypeId = value.internshipTypeId
            this.pricePerDay = value.pricePerDay
            this.professionId = value.professionId
        }
    }
}
