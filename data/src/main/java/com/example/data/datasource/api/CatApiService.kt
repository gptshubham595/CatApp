package com.example.data.datasource.api

import com.example.common.APIConstants
import com.example.data.dataModels.catbreedlist.CatBreedListItemData
import com.example.data.dataModels.catdetail.CatDetailsData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatApiService {
    @GET(APIConstants.BREED_LIST_URL)
    suspend fun getCatBreedList(
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): Response<List<CatBreedListItemData>>

    @GET(APIConstants.BREED_DETAILS_URL)
    suspend fun getCatDetails(
        @Path("breed_id") breedId: String
    ): Response<CatDetailsData>

}