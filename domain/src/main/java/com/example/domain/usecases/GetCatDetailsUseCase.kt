package com.example.domain.usecases

import com.example.common.helper.Either
import com.example.common.usecases.BaseUseCase
import com.example.domain.domainModels.catdetail.CatDetailsDomain
import kotlinx.coroutines.flow.Flow

class GetCatDetailsUseCase : BaseUseCase<String, Flow<CatDetailsDomain>>() {
    override suspend fun run(params: String): Either<Exception, Flow<CatDetailsDomain>> {
        TODO("Not yet implemented")
    }
}