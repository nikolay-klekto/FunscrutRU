/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.CompanyPartner

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CompanyPartnerRecord() : UpdatableRecordImpl<CompanyPartnerRecord>(CompanyPartner.COMPANY_PARTNER), Record2<Long?, Long?> {

    var companyId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var partnerId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<Long?, Long?> = super.fieldsRow() as Row2<Long?, Long?>
    override fun valuesRow(): Row2<Long?, Long?> = super.valuesRow() as Row2<Long?, Long?>
    override fun field1(): Field<Long?> = CompanyPartner.COMPANY_PARTNER.COMPANY_ID
    override fun field2(): Field<Long?> = CompanyPartner.COMPANY_PARTNER.PARTNER_ID
    override fun component1(): Long? = companyId
    override fun component2(): Long? = partnerId
    override fun value1(): Long? = companyId
    override fun value2(): Long? = partnerId

    override fun value1(value: Long?): CompanyPartnerRecord {
        this.companyId = value
        return this
    }

    override fun value2(value: Long?): CompanyPartnerRecord {
        this.partnerId = value
        return this
    }

    override fun values(value1: Long?, value2: Long?): CompanyPartnerRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised CompanyPartnerRecord
     */
    constructor(companyId: Long? = null, partnerId: Long? = null): this() {
        this.companyId = companyId
        this.partnerId = partnerId
    }

    /**
     * Create a detached, initialised CompanyPartnerRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.CompanyPartner?): this() {
        if (value != null) {
            this.companyId = value.companyId
            this.partnerId = value.partnerId
        }
    }
}