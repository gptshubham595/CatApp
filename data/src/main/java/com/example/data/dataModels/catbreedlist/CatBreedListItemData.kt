package com.example.data.dataModels.catbreedlist

import com.example.data.datasource.interfaces.ICatBreedListItemData
import com.google.gson.annotations.SerializedName

data class CatBreedListItemData(
    @SerializedName("adaptability")
    override val adaptability: Int,
    @SerializedName("affection_level")
    override val affectionLevel: Int,
    @SerializedName("alt_names")
    override val altNames: String,
    @SerializedName("cfa_url")
    override val cfaUrl: String,
    @SerializedName("child_friendly")
    override val childFriendly: Int,
    @SerializedName("country_code")
    override val countryCode: String,
    @SerializedName("country_codes")
    override val countryCodes: String,
    @SerializedName("description")
    override val description: String,
    @SerializedName("dog_friendly")
    override val dogFriendly: Int,
    @SerializedName("energy_level")
    override val energyLevel: Int,
    @SerializedName("experimental")
    override val experimental: Int,
    @SerializedName("grooming")
    override val grooming: Int,
    @SerializedName("hairless")
    override val hairless: Int,
    @SerializedName("health_issues")
    override val healthIssues: Int,
    @SerializedName("hypoallergenic")
    override val hypoallergenic: Int,
    @SerializedName("image")
    override val image: CatImageData,
    @SerializedName("indoor")
    override val indoor: Int,
    @SerializedName("intelligence")
    override val intelligence: Int,
    @SerializedName("lap")
    override val lap: Int,
    @SerializedName("life_span")
    override val lifeSpan: String,
    @SerializedName("name")
    override val name: String,
    @SerializedName("natural")
    override val natural: Int,
    @SerializedName("origin")
    override val origin: String,
    @SerializedName("rare")
    override val rare: Int,
    @SerializedName("reference_image_id")
    override val referenceImageId: String,
    @SerializedName("rex")
    override val rex: Int,
    @SerializedName("shedding_level")
    override val sheddingLevel: Int,
    @SerializedName("short_legs")
    override val shortLegs: Int,
    @SerializedName("social_needs")
    override val socialNeeds: Int,
    @SerializedName("stranger_friendly")
    override val strangerFriendly: Int,
    @SerializedName("suppressed_tail")
    override val suppressedTail: Int,
    @SerializedName("temperament")
    override val temperament: String,
    @SerializedName("vcahospitals_url")
    override val vcahospitalsUrl: String,
    @SerializedName("vetstreet_url")
    override val vetstreetUrl: String,
    @SerializedName("vocalisation")
    override val vocalisation: Int,
    @SerializedName("weight")
    override val weight: CatWeightData,
    @SerializedName("wikipedia_url")
    override val wikipediaUrl: String,

    @SerializedName("id")
    override val breedId: String
) : ICatBreedListItemData