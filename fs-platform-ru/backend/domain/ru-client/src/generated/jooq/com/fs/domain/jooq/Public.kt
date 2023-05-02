/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq


import com.fs.domain.jooq.tables.Address
import com.fs.domain.jooq.tables.Basket
import com.fs.domain.jooq.tables.City
import com.fs.domain.jooq.tables.Client
import com.fs.domain.jooq.tables.CompaniesPositions
import com.fs.domain.jooq.tables.Company
import com.fs.domain.jooq.tables.CompanyPartner
import com.fs.domain.jooq.tables.Country
import com.fs.domain.jooq.tables.Office
import com.fs.domain.jooq.tables.Order
import com.fs.domain.jooq.tables.Partner
import com.fs.domain.jooq.tables.Position
import com.fs.domain.jooq.tables.Review
import com.fs.domain.jooq.tables.Service

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC: Public = Public()
    }

    /**
     * The table <code>public.address</code>.
     */
    val ADDRESS: Address get() = Address.ADDRESS

    /**
     * The table <code>public.basket</code>.
     */
    val BASKET: Basket get() = Basket.BASKET

    /**
     * The table <code>public.city</code>.
     */
    val CITY: City get() = City.CITY

    /**
     * The table <code>public.client</code>.
     */
    val CLIENT: Client get() = Client.CLIENT

    /**
     * The table <code>public.companies_positions</code>.
     */
    val COMPANIES_POSITIONS: CompaniesPositions get() = CompaniesPositions.COMPANIES_POSITIONS

    /**
     * The table <code>public.company</code>.
     */
    val COMPANY: Company get() = Company.COMPANY

    /**
     * The table <code>public.company_partner</code>.
     */
    val COMPANY_PARTNER: CompanyPartner get() = CompanyPartner.COMPANY_PARTNER

    /**
     * The table <code>public.country</code>.
     */
    val COUNTRY: Country get() = Country.COUNTRY

    /**
     * The table <code>public.office</code>.
     */
    val OFFICE: Office get() = Office.OFFICE

    /**
     * The table <code>public.order</code>.
     */
    val ORDER: Order get() = Order.ORDER

    /**
     * The table <code>public.partner</code>.
     */
    val PARTNER: Partner get() = Partner.PARTNER

    /**
     * The table <code>public.position</code>.
     */
    val POSITION: Position get() = Position.POSITION

    /**
     * The table <code>public.review</code>.
     */
    val REVIEW: Review get() = Review.REVIEW

    /**
     * The table <code>public.service</code>.
     */
    val SERVICE: Service get() = Service.SERVICE

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Address.ADDRESS,
        Basket.BASKET,
        City.CITY,
        Client.CLIENT,
        CompaniesPositions.COMPANIES_POSITIONS,
        Company.COMPANY,
        CompanyPartner.COMPANY_PARTNER,
        Country.COUNTRY,
        Office.OFFICE,
        Order.ORDER,
        Partner.PARTNER,
        Position.POSITION,
        Review.REVIEW,
        Service.SERVICE
    )
}
