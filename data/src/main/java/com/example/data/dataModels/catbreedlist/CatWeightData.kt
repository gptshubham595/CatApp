package com.example.data.dataModels.catbreedlist


import com.google.gson.annotations.SerializedName

data class CatWeightData(
    @SerializedName("imperial")
    val imperial: String,
    @SerializedName("metric")
    val metric: String
)