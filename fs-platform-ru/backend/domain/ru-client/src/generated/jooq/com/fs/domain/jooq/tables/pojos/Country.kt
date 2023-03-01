/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.tables.pojos


import com.fs.client.ru.enums.CountryNameModel
import com.fs.client.ru.enums.CurrencyModel

import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Country(
    var code: Long? = null,
    var currency: CurrencyModel? = null,
    var name: CountryNameModel? = null
) : Serializable {


    override fun toString(): String {
        val sb = StringBuilder("Country (")

        sb.append(code)
        sb.append(", ").append(currency)
        sb.append(", ").append(name)

        sb.append(")")
        return sb.toString()
    }
}
