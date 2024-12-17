/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.Profession

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ProfessionRecord() : UpdatableRecordImpl<ProfessionRecord>(Profession.PROFESSION), Record5<Long?, String?, String?, Int?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var clientsNumber: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var professionIndustry: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<Long?, String?, String?, Int?, String?> = super.fieldsRow() as Row5<Long?, String?, String?, Int?, String?>
    override fun valuesRow(): Row5<Long?, String?, String?, Int?, String?> = super.valuesRow() as Row5<Long?, String?, String?, Int?, String?>
    override fun field1(): Field<Long?> = Profession.PROFESSION.ID
    override fun field2(): Field<String?> = Profession.PROFESSION.NAME
    override fun field3(): Field<String?> = Profession.PROFESSION.DESCRIPTION
    override fun field4(): Field<Int?> = Profession.PROFESSION.CLIENTS_NUMBER
    override fun field5(): Field<String?> = Profession.PROFESSION.PROFESSION_INDUSTRY
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = description
    override fun component4(): Int? = clientsNumber
    override fun component5(): String? = professionIndustry
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = description
    override fun value4(): Int? = clientsNumber
    override fun value5(): String? = professionIndustry

    override fun value1(value: Long?): ProfessionRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): ProfessionRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): ProfessionRecord {
        this.description = value
        return this
    }

    override fun value4(value: Int?): ProfessionRecord {
        this.clientsNumber = value
        return this
    }

    override fun value5(value: String?): ProfessionRecord {
        this.professionIndustry = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Int?, value5: String?): ProfessionRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised ProfessionRecord
     */
    constructor(id: Long? = null, name: String? = null, description: String? = null, clientsNumber: Int? = null, professionIndustry: String? = null): this() {
        this.id = id
        this.name = name
        this.description = description
        this.clientsNumber = clientsNumber
        this.professionIndustry = professionIndustry
    }

    /**
     * Create a detached, initialised ProfessionRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Profession?): this() {
        if (value != null) {
            this.id = value.id
            this.name = value.name
            this.description = value.description
            this.clientsNumber = value.clientsNumber
            this.professionIndustry = value.professionIndustry
        }
    }
}
