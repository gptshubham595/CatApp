package com.example.core.hilt

import com.example.core.repositories.CatRepositoryImpl
import com.example.data.datasource.api.CatApiService
import com.example.data.datasource.cache.roomDB.CatDatabase
import com.example.domain.repositories.CatRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {

    @Binds
    abstract fun providesCatRepository(catRepositoryImpl: CatRepositoryImpl): CatRepository

}