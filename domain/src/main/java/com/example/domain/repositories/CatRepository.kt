package com.example.domain.repositories

import com.example.domain.domainModels.catbreedlist.CatBreedListItemDomain
import com.example.domain.domainModels.catdetail.CatDetailsDomain
import kotlinx.coroutines.flow.Flow

interface CatRepository {

    fun getCatBreedList(
        limit: Int,
        page: Int
    ): Flow<List<CatBreedListItemDomain>>

    fun getCatDetails(
        breedId: String
    ): Flow<CatDetailsDomain>
}