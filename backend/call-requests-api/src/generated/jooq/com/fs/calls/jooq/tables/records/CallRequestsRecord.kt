/*
 * This file is generated by jOOQ.
 */
package com.fs.calls.jooq.tables.records


import com.fs.calls.jooq.tables.CallRequests

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CallRequestsRecord() : UpdatableRecordImpl<CallRequestsRecord>(CallRequests.CALL_REQUESTS), Record6<Long?, String?, String?, Boolean?, LocalDateTime?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var phoneNum: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsActive")
    open var isActive: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    open var dateCreated: LocalDateTime?
        set(value): Unit = set(4, value)
        get(): LocalDateTime? = get(4) as LocalDateTime?

    open var callTime: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<Long?, String?, String?, Boolean?, LocalDateTime?, String?> = super.fieldsRow() as Row6<Long?, String?, String?, Boolean?, LocalDateTime?, String?>
    override fun valuesRow(): Row6<Long?, String?, String?, Boolean?, LocalDateTime?, String?> = super.valuesRow() as Row6<Long?, String?, String?, Boolean?, LocalDateTime?, String?>
    override fun field1(): Field<Long?> = CallRequests.CALL_REQUESTS.ID
    override fun field2(): Field<String?> = CallRequests.CALL_REQUESTS.NAME
    override fun field3(): Field<String?> = CallRequests.CALL_REQUESTS.PHONE_NUM
    override fun field4(): Field<Boolean?> = CallRequests.CALL_REQUESTS.IS_ACTIVE
    override fun field5(): Field<LocalDateTime?> = CallRequests.CALL_REQUESTS.DATE_CREATED
    override fun field6(): Field<String?> = CallRequests.CALL_REQUESTS.CALL_TIME
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = phoneNum
    override fun component4(): Boolean? = isActive
    override fun component5(): LocalDateTime? = dateCreated
    override fun component6(): String? = callTime
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = phoneNum
    override fun value4(): Boolean? = isActive
    override fun value5(): LocalDateTime? = dateCreated
    override fun value6(): String? = callTime

    override fun value1(value: Long?): CallRequestsRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): CallRequestsRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): CallRequestsRecord {
        this.phoneNum = value
        return this
    }

    override fun value4(value: Boolean?): CallRequestsRecord {
        this.isActive = value
        return this
    }

    override fun value5(value: LocalDateTime?): CallRequestsRecord {
        this.dateCreated = value
        return this
    }

    override fun value6(value: String?): CallRequestsRecord {
        this.callTime = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Boolean?, value5: LocalDateTime?, value6: String?): CallRequestsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised CallRequestsRecord
     */
    constructor(id: Long? = null, name: String? = null, phoneNum: String? = null, isActive: Boolean? = null, dateCreated: LocalDateTime? = null, callTime: String? = null): this() {
        this.id = id
        this.name = name
        this.phoneNum = phoneNum
        this.isActive = isActive
        this.dateCreated = dateCreated
        this.callTime = callTime
    }

    /**
     * Create a detached, initialised CallRequestsRecord
     */
    constructor(value: com.fs.calls.jooq.tables.pojos.CallRequests?): this() {
        if (value != null) {
            this.id = value.id
            this.name = value.name
            this.phoneNum = value.phoneNum
            this.isActive = value.isActive
            this.dateCreated = value.dateCreated
            this.callTime = value.callTime
        }
    }
}
