package com.example.data.datasource.cache.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.datasource.cache.roomDB.dao.CatBreedListDao
import com.example.data.datasource.cache.roomDB.dao.CatDetailsDao


@Database(entities = [CatBreedListDao::class, CatDetailsDao::class], version = 1)
abstract class CatDatabase : RoomDatabase() {
    abstract fun getCatBreedListDao(): CatBreedListDao
    abstract fun getCatDetailsDao(): CatDetailsDao
}