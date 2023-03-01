package com.fs.client.service

import com.fs.client.ru.converter.ModelConverter
import com.fs.domain.jooq.tables.pojos.Review
import com.fs.service.ru.ReviewModel
import org.springframework.stereotype.Service

@Service
class ReviewModelConverter : ModelConverter<Review, ReviewModel> {
    override fun toModel(rawObject: Review): ReviewModel {
        return ReviewModel(
            id = rawObject.id,
            companyId = rawObject.companyId,
            username = rawObject.username,
            rate = rawObject.rate,
            dateCreated = rawObject.dateCreated,
            description = rawObject.description
        )
    }

    override fun fromModel(modelObject: ReviewModel): Review {
        return Review(
            modelObject.id,
            modelObject.companyId,
            modelObject.dateCreated,
            modelObject.description,
            modelObject.rate,
            modelObject.username

        )
    }
}