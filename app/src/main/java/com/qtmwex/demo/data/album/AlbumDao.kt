package com.qtmwex.demo.data.album

import androidx.room.*

/**
 * Created by gokhan on 12/18/20.
 */
@Dao
interface AlbumDao {

    @Query("SELECT * FROM Albums")
    fun getAlbums(): AlbumData

    @Insert
    fun insert(albumData: AlbumData)

    @Update
    fun update(albumData: AlbumData)

    @Delete
    fun delete(albumData: AlbumData)
}
