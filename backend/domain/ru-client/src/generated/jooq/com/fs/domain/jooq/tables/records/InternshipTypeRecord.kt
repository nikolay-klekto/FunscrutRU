/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.InternshipType

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InternshipTypeRecord() : UpdatableRecordImpl<InternshipTypeRecord>(InternshipType.INTERNSHIP_TYPE), Record3<Long?, String?, String?> {

    var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var description: String?
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
    override fun field1(): Field<Long?> = InternshipType.INTERNSHIP_TYPE.ID
    override fun field2(): Field<String?> = InternshipType.INTERNSHIP_TYPE.NAME
    override fun field3(): Field<String?> = InternshipType.INTERNSHIP_TYPE.DESCRIPTION
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = description
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = description

    override fun value1(value: Long?): InternshipTypeRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): InternshipTypeRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): InternshipTypeRecord {
        this.description = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?): InternshipTypeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised InternshipTypeRecord
     */
    constructor(id: Long? = null, name: String? = null, description: String? = null): this() {
        this.id = id
        this.name = name
        this.description = description
    }

    /**
     * Create a detached, initialised InternshipTypeRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.InternshipType?): this() {
        if (value != null) {
            this.id = value.id
            this.name = value.name
            this.description = value.description
        }
    }
}
