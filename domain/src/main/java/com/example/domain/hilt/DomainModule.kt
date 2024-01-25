package com.example.domain.hilt

import com.example.domain.usecases.GetCatBreedListUseCase
import com.example.domain.usecases.GetCatDetailsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    @Singleton
    fun providesGetCatBreedListUseCase(): GetCatBreedListUseCase {
        return GetCatBreedListUseCase()
    }

    @Provides
    @Singleton
    fun providesGetCatDetailsUseCase(): GetCatDetailsUseCase {
        return GetCatDetailsUseCase()
    }
}