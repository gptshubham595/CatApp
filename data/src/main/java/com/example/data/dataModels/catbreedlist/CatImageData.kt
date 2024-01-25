package com.example.data.dataModels.catbreedlist


import com.google.gson.annotations.SerializedName

data class CatImageData(
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)