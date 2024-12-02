/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq


import com.fs.domain.jooq.tables.Address
import com.fs.domain.jooq.tables.Basket
import com.fs.domain.jooq.tables.City
import com.fs.domain.jooq.tables.Client
import com.fs.domain.jooq.tables.ClientsRefreshTokens
import com.fs.domain.jooq.tables.Company
import com.fs.domain.jooq.tables.CompanyPartner
import com.fs.domain.jooq.tables.CompanyProfession
import com.fs.domain.jooq.tables.Country
import com.fs.domain.jooq.tables.Databasechangeloglock
import com.fs.domain.jooq.tables.Event
import com.fs.domain.jooq.tables.EventCategories
import com.fs.domain.jooq.tables.InternshipType
import com.fs.domain.jooq.tables.Office
import com.fs.domain.jooq.tables.Order
import com.fs.domain.jooq.tables.Partner
import com.fs.domain.jooq.tables.Profession
import com.fs.domain.jooq.tables.Review

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
     * The table <code>public.clients_refresh_tokens</code>.
     */
    val CLIENTS_REFRESH_TOKENS: ClientsRefreshTokens get() = ClientsRefreshTokens.CLIENTS_REFRESH_TOKENS

    /**
     * The table <code>public.company</code>.
     */
    val COMPANY: Company get() = Company.COMPANY

    /**
     * The table <code>public.company_partner</code>.
     */
    val COMPANY_PARTNER: CompanyPartner get() = CompanyPartner.COMPANY_PARTNER

    /**
     * The table <code>public.company_profession</code>.
     */
    val COMPANY_PROFESSION: CompanyProfession get() = CompanyProfession.COMPANY_PROFESSION

    /**
     * The table <code>public.country</code>.
     */
    val COUNTRY: Country get() = Country.COUNTRY

    /**
     * The table <code>public.databasechangeloglock</code>.
     */
    val DATABASECHANGELOGLOCK: Databasechangeloglock get() = Databasechangeloglock.DATABASECHANGELOGLOCK

    /**
     * The table <code>public.event</code>.
     */
    val EVENT: Event get() = Event.EVENT

    /**
     * The table <code>public.event_categories</code>.
     */
    val EVENT_CATEGORIES: EventCategories get() = EventCategories.EVENT_CATEGORIES

    /**
     * The table <code>public.internship_type</code>.
     */
    val INTERNSHIP_TYPE: InternshipType get() = InternshipType.INTERNSHIP_TYPE

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
     * The table <code>public.profession</code>.
     */
    val PROFESSION: Profession get() = Profession.PROFESSION

    /**
     * The table <code>public.review</code>.
     */
    val REVIEW: Review get() = Review.REVIEW

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Address.ADDRESS,
        Basket.BASKET,
        City.CITY,
        Client.CLIENT,
        ClientsRefreshTokens.CLIENTS_REFRESH_TOKENS,
        Company.COMPANY,
        CompanyPartner.COMPANY_PARTNER,
        CompanyProfession.COMPANY_PROFESSION,
        Country.COUNTRY,
        Databasechangeloglock.DATABASECHANGELOGLOCK,
        Event.EVENT,
        EventCategories.EVENT_CATEGORIES,
        InternshipType.INTERNSHIP_TYPE,
        Office.OFFICE,
        Order.ORDER,
        Partner.PARTNER,
        Profession.PROFESSION,
        Review.REVIEW
    )
}
