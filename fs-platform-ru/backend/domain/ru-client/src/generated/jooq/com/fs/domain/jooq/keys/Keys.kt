/*
 * This file is generated by jOOQ.
 */
package com.fs.domain.jooq.keys


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
import com.fs.domain.jooq.tables.records.AddressRecord
import com.fs.domain.jooq.tables.records.BasketRecord
import com.fs.domain.jooq.tables.records.CityRecord
import com.fs.domain.jooq.tables.records.ClientRecord
import com.fs.domain.jooq.tables.records.CompaniesPositionsRecord
import com.fs.domain.jooq.tables.records.CompanyPartnerRecord
import com.fs.domain.jooq.tables.records.CompanyRecord
import com.fs.domain.jooq.tables.records.CountryRecord
import com.fs.domain.jooq.tables.records.OfficeRecord
import com.fs.domain.jooq.tables.records.OrderRecord
import com.fs.domain.jooq.tables.records.PartnerRecord
import com.fs.domain.jooq.tables.records.PositionRecord
import com.fs.domain.jooq.tables.records.ReviewRecord
import com.fs.domain.jooq.tables.records.ServiceRecord

import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val ADDRESS_PKEY: UniqueKey<AddressRecord> = Internal.createUniqueKey(Address.ADDRESS, DSL.name("address_pkey"), arrayOf(Address.ADDRESS.ID), true)
val BASKET_PKEY: UniqueKey<BasketRecord> = Internal.createUniqueKey(Basket.BASKET, DSL.name("basket_pkey"), arrayOf(Basket.BASKET.ID), true)
val CITY_PKEY: UniqueKey<CityRecord> = Internal.createUniqueKey(City.CITY, DSL.name("city_pkey"), arrayOf(City.CITY.ID), true)
val CLIENT_PKEY: UniqueKey<ClientRecord> = Internal.createUniqueKey(Client.CLIENT, DSL.name("client_pkey"), arrayOf(Client.CLIENT.ID), true)
val COMPANY_PKEY: UniqueKey<CompanyRecord> = Internal.createUniqueKey(Company.COMPANY, DSL.name("company_pkey"), arrayOf(Company.COMPANY.ID), true)
val COMPANY_PARTNER_PKEY: UniqueKey<CompanyPartnerRecord> = Internal.createUniqueKey(CompanyPartner.COMPANY_PARTNER, DSL.name("company_partner_pkey"), arrayOf(CompanyPartner.COMPANY_PARTNER.COMPANY_ID, CompanyPartner.COMPANY_PARTNER.PARTNER_ID), true)
val COUNTRY_PKEY: UniqueKey<CountryRecord> = Internal.createUniqueKey(Country.COUNTRY, DSL.name("country_pkey"), arrayOf(Country.COUNTRY.CODE), true)
val OFFICE_PKEY: UniqueKey<OfficeRecord> = Internal.createUniqueKey(Office.OFFICE, DSL.name("office_pkey"), arrayOf(Office.OFFICE.ID), true)
val ORDER_PKEY: UniqueKey<OrderRecord> = Internal.createUniqueKey(Order.ORDER, DSL.name("order_pkey"), arrayOf(Order.ORDER.ID), true)
val PARTNER_PKEY: UniqueKey<PartnerRecord> = Internal.createUniqueKey(Partner.PARTNER, DSL.name("partner_pkey"), arrayOf(Partner.PARTNER.ID), true)
val POSITION_PKEY: UniqueKey<PositionRecord> = Internal.createUniqueKey(Position.POSITION, DSL.name("position_pkey"), arrayOf(Position.POSITION.ID), true)
val REVIEW_PKEY: UniqueKey<ReviewRecord> = Internal.createUniqueKey(Review.REVIEW, DSL.name("review_pkey"), arrayOf(Review.REVIEW.ID), true)
val SERVICE_PKEY: UniqueKey<ServiceRecord> = Internal.createUniqueKey(Service.SERVICE, DSL.name("service_pkey"), arrayOf(Service.SERVICE.ID), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val ADDRESS__ADDRESS_CITY_ID_FKEY: ForeignKey<AddressRecord, CityRecord> = Internal.createForeignKey(Address.ADDRESS, DSL.name("address_city_id_fkey"), arrayOf(Address.ADDRESS.CITY_ID), com.fs.domain.jooq.keys.CITY_PKEY, arrayOf(City.CITY.ID), true)
val CITY__CITY_COUNTRY_CODE_FKEY: ForeignKey<CityRecord, CountryRecord> = Internal.createForeignKey(City.CITY, DSL.name("city_country_code_fkey"), arrayOf(City.CITY.COUNTRY_CODE), com.fs.domain.jooq.keys.COUNTRY_PKEY, arrayOf(Country.COUNTRY.CODE), true)
val CLIENT__CLIENT_BASKET_ID_FKEY: ForeignKey<ClientRecord, BasketRecord> = Internal.createForeignKey(Client.CLIENT, DSL.name("client_basket_id_fkey"), arrayOf(Client.CLIENT.BASKET_ID), com.fs.domain.jooq.keys.BASKET_PKEY, arrayOf(Basket.BASKET.ID), true)
val CLIENT__CLIENT_CITY_ID_FKEY: ForeignKey<ClientRecord, CityRecord> = Internal.createForeignKey(Client.CLIENT, DSL.name("client_city_id_fkey"), arrayOf(Client.CLIENT.CITY_ID), com.fs.domain.jooq.keys.CITY_PKEY, arrayOf(City.CITY.ID), true)
val COMPANIES_POSITIONS__COMPANIES_POSITIONS_COMPANY_ID_FKEY: ForeignKey<CompaniesPositionsRecord, CompanyRecord> = Internal.createForeignKey(CompaniesPositions.COMPANIES_POSITIONS, DSL.name("companies_positions_company_id_fkey"), arrayOf(CompaniesPositions.COMPANIES_POSITIONS.COMPANY_ID), com.fs.domain.jooq.keys.COMPANY_PKEY, arrayOf(Company.COMPANY.ID), true)
val COMPANIES_POSITIONS__COMPANIES_POSITIONS_POSITION_ID_FKEY: ForeignKey<CompaniesPositionsRecord, PositionRecord> = Internal.createForeignKey(CompaniesPositions.COMPANIES_POSITIONS, DSL.name("companies_positions_position_id_fkey"), arrayOf(CompaniesPositions.COMPANIES_POSITIONS.POSITION_ID), com.fs.domain.jooq.keys.POSITION_PKEY, arrayOf(Position.POSITION.ID), true)
val COMPANY_PARTNER__COMPANY_PARTNER_COMPANY_ID_FKEY: ForeignKey<CompanyPartnerRecord, CompanyRecord> = Internal.createForeignKey(CompanyPartner.COMPANY_PARTNER, DSL.name("company_partner_company_id_fkey"), arrayOf(CompanyPartner.COMPANY_PARTNER.COMPANY_ID), com.fs.domain.jooq.keys.COMPANY_PKEY, arrayOf(Company.COMPANY.ID), true)
val COMPANY_PARTNER__COMPANY_PARTNER_PARTNER_ID_FKEY: ForeignKey<CompanyPartnerRecord, PartnerRecord> = Internal.createForeignKey(CompanyPartner.COMPANY_PARTNER, DSL.name("company_partner_partner_id_fkey"), arrayOf(CompanyPartner.COMPANY_PARTNER.PARTNER_ID), com.fs.domain.jooq.keys.PARTNER_PKEY, arrayOf(Partner.PARTNER.ID), true)
val OFFICE__OFFICE_ADDRESS_ID_FKEY: ForeignKey<OfficeRecord, AddressRecord> = Internal.createForeignKey(Office.OFFICE, DSL.name("office_address_id_fkey"), arrayOf(Office.OFFICE.ADDRESS_ID), com.fs.domain.jooq.keys.ADDRESS_PKEY, arrayOf(Address.ADDRESS.ID), true)
val OFFICE__OFFICE_COMPANY_ID_FKEY: ForeignKey<OfficeRecord, CompanyRecord> = Internal.createForeignKey(Office.OFFICE, DSL.name("office_company_id_fkey"), arrayOf(Office.OFFICE.COMPANY_ID), com.fs.domain.jooq.keys.COMPANY_PKEY, arrayOf(Company.COMPANY.ID), true)
val ORDER__ORDER_BASKET_ID_FKEY: ForeignKey<OrderRecord, BasketRecord> = Internal.createForeignKey(Order.ORDER, DSL.name("order_basket_id_fkey"), arrayOf(Order.ORDER.BASKET_ID), com.fs.domain.jooq.keys.BASKET_PKEY, arrayOf(Basket.BASKET.ID), true)
val ORDER__ORDER_COMPANY_OFFICE_ID_FKEY: ForeignKey<OrderRecord, OfficeRecord> = Internal.createForeignKey(Order.ORDER, DSL.name("order_company_office_id_fkey"), arrayOf(Order.ORDER.COMPANY_OFFICE_ID), com.fs.domain.jooq.keys.OFFICE_PKEY, arrayOf(Office.OFFICE.ID), true)
val ORDER__ORDER_POSITION_ID_FKEY: ForeignKey<OrderRecord, PositionRecord> = Internal.createForeignKey(Order.ORDER, DSL.name("order_position_id_fkey"), arrayOf(Order.ORDER.POSITION_ID), com.fs.domain.jooq.keys.POSITION_PKEY, arrayOf(Position.POSITION.ID), true)
val ORDER__ORDER_SERVICE_ID_FKEY: ForeignKey<OrderRecord, ServiceRecord> = Internal.createForeignKey(Order.ORDER, DSL.name("order_service_id_fkey"), arrayOf(Order.ORDER.SERVICE_ID), com.fs.domain.jooq.keys.SERVICE_PKEY, arrayOf(Service.SERVICE.ID), true)
val PARTNER__PARTNER_CLIENT_ID_FKEY: ForeignKey<PartnerRecord, ClientRecord> = Internal.createForeignKey(Partner.PARTNER, DSL.name("partner_client_id_fkey"), arrayOf(Partner.PARTNER.CLIENT_ID), com.fs.domain.jooq.keys.CLIENT_PKEY, arrayOf(Client.CLIENT.ID), true)
val REVIEW__REVIEW_CLIENT_ID_FKEY: ForeignKey<ReviewRecord, ClientRecord> = Internal.createForeignKey(Review.REVIEW, DSL.name("review_client_id_fkey"), arrayOf(Review.REVIEW.CLIENT_ID), com.fs.domain.jooq.keys.CLIENT_PKEY, arrayOf(Client.CLIENT.ID), true)
val REVIEW__REVIEW_COMPANY_ID_FKEY: ForeignKey<ReviewRecord, CompanyRecord> = Internal.createForeignKey(Review.REVIEW, DSL.name("review_company_id_fkey"), arrayOf(Review.REVIEW.COMPANY_ID), com.fs.domain.jooq.keys.COMPANY_PKEY, arrayOf(Company.COMPANY.ID), true)
