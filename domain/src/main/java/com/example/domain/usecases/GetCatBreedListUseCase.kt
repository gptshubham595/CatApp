package com.example.domain.usecases

import com.example.common.helper.Either
import com.example.common.usecases.BaseUseCase
import com.example.domain.domainModels.catbreedlist.CatBreedListItemDomain
import kotlinx.coroutines.flow.Flow

class GetCatBreedListUseCase : BaseUseCase<Pair<Int, Int>, Flow<List<CatBreedListItemDomain>>>() {
    override suspend fun run(params: Pair<Int, Int>): Either<Exception, Flow<List<CatBreedListItemDomain>>> {
        TODO("Not yet implemented")
    }
}