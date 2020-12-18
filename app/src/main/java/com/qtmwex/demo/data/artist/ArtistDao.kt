package com.qtmwex.demo.data.artist

import androidx.room.*

/**
 * Created by gokhan on 12/18/20.
 */
@Dao
interface ArtistDao {

    @Query("SELECT * FROM Artists")
    fun getArtists(): ArtistData

    @Insert
    fun insert(artistData: ArtistData)

    @Update
    fun update(artistData: ArtistData)

    @Delete
    fun delete(artistData: ArtistData)
}
