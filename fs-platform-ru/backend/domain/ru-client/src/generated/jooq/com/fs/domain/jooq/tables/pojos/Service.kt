/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Service(
    var id: Long? = null,
    var pricePerDay: Long? = null,
    var name: String? = null
) : Serializable {


    override fun toString(): String {
        val sb = StringBuilder("Service (")

        sb.append(id)
        sb.append(", ").append(pricePerDay)
        sb.append(", ").append(name)

        sb.append(")")
        return sb.toString()
    }
}
