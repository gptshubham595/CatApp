package com.example.data.datasource.cache.roomDB.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.dataModels.catdetail.CatDetailsData

@Dao
interface CatDetailsDao {
    // cat details
    @Query("Select * from cat_details_table where breedId = :breedId")
    suspend fun fetchCatDetails(breedId: String): CatDetailsData

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCatDetails(catDetails: CatDetailsData)

}