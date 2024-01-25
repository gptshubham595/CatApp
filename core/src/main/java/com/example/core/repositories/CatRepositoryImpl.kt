package com.example.core.repositories

import com.example.core.transformer.toDomain
import com.example.data.datasource.api.CatApiService
import com.example.data.datasource.cache.roomDB.CatDatabase
import com.example.domain.domainModels.catbreedlist.CatBreedListItemDomain
import com.example.domain.domainModels.catdetail.CatDetailsDomain
import com.example.domain.repositories.CatRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val catApi: CatApiService,
    private val catDB: CatDatabase
) : CatRepository {
    override fun getCatBreedList(limit: Int, page: Int): Flow<List<CatBreedListItemDomain>> = flow {
        val list = catDB.getCatBreedListDao().fetchAllCatBreedList(limit, page)
        if (list.isNotEmpty()) {
            emit(list.toDomain { it.toDomain() })
        } else {
            catApi.getCatBreedList(limit, page).let { response ->
                response.body()?.let { catBreedList ->
                    catDB.getCatBreedListDao().insertAllCatBreedList(catBreedList)
                    emit(catBreedList.toDomain { it.toDomain() })
                }
            }
        }
    }

    override fun getCatDetails(breedId: String): Flow<CatDetailsDomain> = flow {
        val cacheResult = catDB.getCatDetailsDao().fetchCatDetails(breedId)
        if (cacheResult == null) {
            catApi.getCatDetails(breedId).let { response ->
                response.body()?.let { catDetails ->
                    catDB.getCatDetailsDao().insertCatDetails(catDetails)
                    emit(catDetails.toDomain())
                }
            }
        } else {
            emit(cacheResult.toDomain())
        }
    }
}
