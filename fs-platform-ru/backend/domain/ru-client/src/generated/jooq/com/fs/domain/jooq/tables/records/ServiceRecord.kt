/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.Service

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ServiceRecord() : UpdatableRecordImpl<ServiceRecord>(Service.SERVICE), Record3<Int?, Int?, String?> {

    var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var price: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    var name: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Int?, Int?, String?> = super.fieldsRow() as Row3<Int?, Int?, String?>
    override fun valuesRow(): Row3<Int?, Int?, String?> = super.valuesRow() as Row3<Int?, Int?, String?>
    override fun field1(): Field<Int?> = Service.SERVICE.ID
    override fun field2(): Field<Int?> = Service.SERVICE.PRICE
    override fun field3(): Field<String?> = Service.SERVICE.NAME
    override fun component1(): Int? = id
    override fun component2(): Int? = price
    override fun component3(): String? = name
    override fun value1(): Int? = id
    override fun value2(): Int? = price
    override fun value3(): String? = name

    override fun value1(value: Int?): ServiceRecord {
        this.id = value
        return this
    }

    override fun value2(value: Int?): ServiceRecord {
        this.price = value
        return this
    }

    override fun value3(value: String?): ServiceRecord {
        this.name = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?): ServiceRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised ServiceRecord
     */
    constructor(id: Int? = null, price: Int? = null, name: String? = null) : this() {
        this.id = id
        this.price = price
        this.name = name
    }

    /**
     * Create a detached, initialised ServiceRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Service?) : this() {
        if (value != null) {
            this.id = value.id
            this.price = value.price
            this.name = value.name
        }
    }
}
