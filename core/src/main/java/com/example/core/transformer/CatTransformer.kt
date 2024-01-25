package com.example.core.transformer

import com.example.data.dataModels.catbreedlist.CatBreedListItemData
import com.example.data.dataModels.catbreedlist.CatImageData
import com.example.data.dataModels.catbreedlist.CatWeightData
import com.example.data.dataModels.catdetail.CatDetailsData
import com.example.domain.domainModels.catbreedlist.CatBreedListItemDomain
import com.example.domain.domainModels.catbreedlist.CatImageDomain
import com.example.domain.domainModels.catbreedlist.CatWeightDomain
import com.example.domain.domainModels.catdetail.CatDetailsDomain


inline fun <reified T, reified R> List<T>.toDomain(converter: (T) -> R): List<R> {
    return this.map {
        converter(it)
    }
}

//val listBreed = listOf<CatBreedListItemData>()
//val domain = listBreed.toDomain{it.toDomain()}

fun CatBreedListItemData.toDomain(): CatBreedListItemDomain {
    return CatBreedListItemDomain(
        breedId = breedId,
        name = name,
        temperament = temperament,
        lifeSpan = lifeSpan,
        altNames = altNames,
        wikipediaUrl = wikipediaUrl,
        origin = origin,
        weight = weight.toDomain(),
        experimental = experimental,
        hairless = hairless,
        natural = natural,
        rare = rare,
        rex = rex,
        suppressedTail = suppressedTail,
        shortLegs = shortLegs,
        hypoallergenic = hypoallergenic,
        adaptability = adaptability,
        affectionLevel = affectionLevel,
        countryCodes = countryCodes,
        childFriendly = childFriendly,
        dogFriendly = dogFriendly,
        energyLevel = energyLevel,
        grooming = grooming,
        healthIssues = healthIssues,
        intelligence = intelligence,
        sheddingLevel = sheddingLevel,
        socialNeeds = socialNeeds,
        strangerFriendly = strangerFriendly,
        vocalisation = vocalisation,
        vcahospitalsUrl = vcahospitalsUrl,
        vetstreetUrl = vetstreetUrl,
        lap = lap,
        indoor = indoor,
        image = image.toDomain(),
        description = description,
        cfaUrl = cfaUrl,
        countryCode = countryCode,
        referenceImageId = referenceImageId
    )
}

fun CatDetailsData.toDomain(): CatDetailsDomain {
    return CatDetailsDomain(
        breedId = breedId,
        name = name,
        temperament = temperament,
        lifeSpan = lifeSpan,
        altNames = altNames,
        wikipediaUrl = wikipediaUrl,
        origin = origin,
        weight = weight.toDomain(),
        experimental = experimental,
        hairless = hairless,
        natural = natural,
        rare = rare,
        rex = rex,
        suppressedTail = suppressedTail,
        shortLegs = shortLegs,
        hypoallergenic = hypoallergenic,
        adaptability = adaptability,
        affectionLevel = affectionLevel,
        countryCodes = countryCodes,
        childFriendly = childFriendly,
        dogFriendly = dogFriendly,
        energyLevel = energyLevel,
        grooming = grooming,
        healthIssues = healthIssues,
        intelligence = intelligence,
        sheddingLevel = sheddingLevel,
        socialNeeds = socialNeeds,
        strangerFriendly = strangerFriendly,
        vocalisation = vocalisation,
        vcahospitalsUrl = vcahospitalsUrl,
        vetstreetUrl = vetstreetUrl,
        lap = lap,
        indoor = indoor,
        description = description,
        cfaUrl = cfaUrl,
        countryCode = countryCode,
        referenceImageId = referenceImageId
    )
}

fun CatWeightData.toDomain(): CatWeightDomain {
    return CatWeightDomain(
        imperial = imperial,
        metric = metric
    )
}

fun CatImageData.toDomain(): CatImageDomain {
    return CatImageDomain(
        height = height,
        id = id,
        url = url,
        width = width
    )
}