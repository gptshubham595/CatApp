package com.example.common

object APIConstants {

    const val BASE_URL = "https://api.thecatapi.com/v1/"

    //breeds?limit=2&page=0
    const val BREED_LIST_URL = "breeds"

    // 'images/0XYvRd7oD.jpg’
    const val BREED_IMAGE_URL = "images/{image_id}"

    // https://api.thecatapi.com/v1/breeds/abys
    const val BREED_DETAILS_URL = "breeds/{breed_id}"

}