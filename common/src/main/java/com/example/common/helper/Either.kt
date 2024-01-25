package com.example.common.helper

sealed class Either<out L, out R> where L : Exception {
    fun either(funL: (L) -> Unit, funR: (R) -> Unit) {
        when (this) {
            is Success -> funR(data)
            is Error -> funL(exception)
        }
    }

    data class Success<out R>(val data: R) : Either<Nothing, R>()
    data class Error<out L : Exception>(val exception: L) : Either<L, Nothing>()
}