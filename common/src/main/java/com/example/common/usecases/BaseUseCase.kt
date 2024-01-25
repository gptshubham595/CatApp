package com.example.common.usecases

import com.example.common.helper.Either
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

abstract class BaseUseCase<in Params, out Type> where Type : Any? {
    abstract suspend fun run(params: Params): Either<Exception, Type>

    operator fun invoke(
        scope: CoroutineScope,
        params: Params,
        onSuccess: (Type) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val job = scope.async { run(params) }
        scope.launch {
            job.await().either(onFailure, onSuccess)
        }
            // may or may-not optimal
            .invokeOnCompletion {
                job.cancel()
            }
    }
}