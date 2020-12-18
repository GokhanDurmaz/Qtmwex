package com.qtmwex.demo.data.song

import androidx.room.*

/**
 * Created by gokhan on 12/18/20.
 */
@Dao
interface SongDao {

    @Query("SELECT * FROM Songs")
    fun getSongs(): SongData

    @Insert
    fun insert(songData: SongData)

    @Update
    fun update(songData: SongData)

    @Delete
    fun delete(songData: SongData)
}
