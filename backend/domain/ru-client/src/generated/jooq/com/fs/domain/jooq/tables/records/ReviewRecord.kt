/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.records


import com.fs.domain.jooq.tables.Review

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReviewRecord() : UpdatableRecordImpl<ReviewRecord>(Review.REVIEW), Record7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var companyId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var clientId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var dateCreated: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    open var description: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var rate: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var username: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?> = super.fieldsRow() as Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?>
    override fun valuesRow(): Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?> = super.valuesRow() as Row7<Long?, Long?, String?, LocalDateTime?, String?, Long?, String?>
    override fun field1(): Field<Long?> = Review.REVIEW.ID
    override fun field2(): Field<Long?> = Review.REVIEW.COMPANY_ID
    override fun field3(): Field<String?> = Review.REVIEW.CLIENT_ID
    override fun field4(): Field<LocalDateTime?> = Review.REVIEW.DATE_CREATED
    override fun field5(): Field<String?> = Review.REVIEW.DESCRIPTION
    override fun field6(): Field<Long?> = Review.REVIEW.RATE
    override fun field7(): Field<String?> = Review.REVIEW.USERNAME
    override fun component1(): Long? = id
    override fun component2(): Long? = companyId
    override fun component3(): String? = clientId
    override fun component4(): LocalDateTime? = dateCreated
    override fun component5(): String? = description
    override fun component6(): Long? = rate
    override fun component7(): String? = username
    override fun value1(): Long? = id
    override fun value2(): Long? = companyId
    override fun value3(): String? = clientId
    override fun value4(): LocalDateTime? = dateCreated
    override fun value5(): String? = description
    override fun value6(): Long? = rate
    override fun value7(): String? = username

    override fun value1(value: Long?): ReviewRecord {
        this.id = value
        return this
    }

    override fun value2(value: Long?): ReviewRecord {
        this.companyId = value
        return this
    }

    override fun value3(value: String?): ReviewRecord {
        this.clientId = value
        return this
    }

    override fun value4(value: LocalDateTime?): ReviewRecord {
        this.dateCreated = value
        return this
    }

    override fun value5(value: String?): ReviewRecord {
        this.description = value
        return this
    }

    override fun value6(value: Long?): ReviewRecord {
        this.rate = value
        return this
    }

    override fun value7(value: String?): ReviewRecord {
        this.username = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: String?, value4: LocalDateTime?, value5: String?, value6: Long?, value7: String?): ReviewRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised ReviewRecord
     */
    constructor(id: Long? = null, companyId: Long? = null, clientId: String? = null, dateCreated: LocalDateTime? = null, description: String? = null, rate: Long? = null, username: String? = null): this() {
        this.id = id
        this.companyId = companyId
        this.clientId = clientId
        this.dateCreated = dateCreated
        this.description = description
        this.rate = rate
        this.username = username
    }

    /**
     * Create a detached, initialised ReviewRecord
     */
    constructor(value: com.fs.domain.jooq.tables.pojos.Review?): this() {
        if (value != null) {
            this.id = value.id
            this.companyId = value.companyId
            this.clientId = value.clientId
            this.dateCreated = value.dateCreated
            this.description = value.description
            this.rate = value.rate
            this.username = value.username
        }
    }
}
