/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Review(
    var id: Int? = null,
    var companyId: Int? = null,
    var dateCreated: LocalDateTime? = null,
    var description: String? = null,
    var rate: Int? = null,
    var username: String? = null
) : Serializable {


    override fun toString(): String {
        val sb = StringBuilder("Review (")

        sb.append(id)
        sb.append(", ").append(companyId)
        sb.append(", ").append(dateCreated)
        sb.append(", ").append(description)
        sb.append(", ").append(rate)
        sb.append(", ").append(username)

        sb.append(")")
        return sb.toString()
    }
}
