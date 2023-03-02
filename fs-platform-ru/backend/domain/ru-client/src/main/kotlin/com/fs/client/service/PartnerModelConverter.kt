package com.fs.client.service

import com.fs.client.ru.PartnerModel
import com.fs.client.ru.converter.ModelConverter
import com.fs.domain.jooq.tables.pojos.Partner
import org.springframework.stereotype.Service

@Service
class PartnerModelConverter : ModelConverter<Partner, PartnerModel> {
    override fun toModel(rawObject: Partner): PartnerModel {
        return PartnerModel(
            id = rawObject.id!!,
            clientId = rawObject.clientId!!
        )
    }

    override fun fromModel(modelObject: PartnerModel): Partner {
        return Partner(
            modelObject.id,
            modelObject.clientId
        )
    }
}