package com.example.data.datasource.cache.roomDB.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.dataModels.catbreedlist.CatBreedListItemData

@Dao
interface CatBreedListDao {

    // list of breed

    @Query("Select * from cat_breed_list_table limit :limit offset :page*100")
    suspend fun fetchAllCatBreedList(limit: Int, page: Int): List<CatBreedListItemData>

    @Insert(entity = CatBreedListItemData::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllCatBreedList(catBreedList: List<CatBreedListItemData>)
}