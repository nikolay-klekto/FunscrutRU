/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.pojos


import com.fs.client.ru.enums.ClientRoleModel
import com.fs.client.ru.enums.EducationModel
import com.fs.client.ru.enums.EmploymentModel

import java.io.Serializable
import java.time.LocalDate
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Client(
    var id: Long? = null,
    var basketId: Long? = null,
    var cityId: Long? = null,
    var activateStatus: Boolean? = null,
    var birthday: LocalDate? = null,
    var dateCreated: LocalDateTime? = null,
    var educationStatus: EducationModel? = null,
    var email: String? = null,
    var employment: EmploymentModel? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var orderQuantity: Long? = null,
    var password: String? = null,
    var phoneNumber: String? = null,
    var role: ClientRoleModel? = null,
    var telegramUsername: String? = null,
    var username: String? = null
) : Serializable {


    override fun toString(): String {
        val sb = StringBuilder("Client (")

        sb.append(id)
        sb.append(", ").append(basketId)
        sb.append(", ").append(cityId)
        sb.append(", ").append(activateStatus)
        sb.append(", ").append(birthday)
        sb.append(", ").append(dateCreated)
        sb.append(", ").append(educationStatus)
        sb.append(", ").append(email)
        sb.append(", ").append(employment)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)
        sb.append(", ").append(orderQuantity)
        sb.append(", ").append(password)
        sb.append(", ").append(phoneNumber)
        sb.append(", ").append(role)
        sb.append(", ").append(telegramUsername)
        sb.append(", ").append(username)

        sb.append(")")
        return sb.toString()
    }
}
