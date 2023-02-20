/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.CompaniesPositions

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CompaniesPositionsRecord() :
    TableRecordImpl<CompaniesPositionsRecord>(CompaniesPositions.COMPANIES_POSITIONS), Record2<Int?, Int?> {

    var companyId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var positionId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<Int?, Int?> = super.fieldsRow() as Row2<Int?, Int?>
    override fun valuesRow(): Row2<Int?, Int?> = super.valuesRow() as Row2<Int?, Int?>
    override fun field1(): Field<Int?> = CompaniesPositions.COMPANIES_POSITIONS.COMPANY_ID
    override fun field2(): Field<Int?> = CompaniesPositions.COMPANIES_POSITIONS.POSITION_ID
    override fun component1(): Int? = companyId
    override fun component2(): Int? = positionId
    override fun value1(): Int? = companyId
    override fun value2(): Int? = positionId

    override fun value1(value: Int?): CompaniesPositionsRecord {
        this.companyId = value
        return this
    }

    override fun value2(value: Int?): CompaniesPositionsRecord {
        this.positionId = value
        return this
    }

    override fun values(value1: Int?, value2: Int?): CompaniesPositionsRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised CompaniesPositionsRecord
     */
    constructor(companyId: Int? = null, positionId: Int? = null) : this() {
        this.companyId = companyId
        this.positionId = positionId
    }

    /**
     * Create a detached, initialised CompaniesPositionsRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.CompaniesPositions?) : this() {
        if (value != null) {
            this.companyId = value.companyId
            this.positionId = value.positionId
        }
    }
}
