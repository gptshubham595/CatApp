package com.example.data.hilt

import android.content.Context
import androidx.room.Room
import com.example.common.APIConstants
import com.example.data.datasource.api.CatApiService
import com.example.data.datasource.cache.roomDB.dao.CatBreedListDao
import com.example.data.datasource.cache.roomDB.CatDatabase
import com.example.data.datasource.cache.roomDB.dao.CatDetailsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideCatDatabase(@ApplicationContext context: Context): CatDatabase {
        return Room.databaseBuilder(
            context,
            CatDatabase::class.java,
            "cat_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideCatBreedListDao(catDatabase: CatDatabase): CatBreedListDao {
        return catDatabase.getCatBreedListDao()
    }

    @Provides
    @Singleton
    fun provideCatDetailsDao(catDatabase: CatDatabase): CatDetailsDao {
        return catDatabase.getCatDetailsDao()
    }

    @Provides
    @Singleton
    fun provideCatApiService(): CatApiService {
        return Retrofit.Builder()
            .baseUrl(APIConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CatApiService::class.java)
    }
}