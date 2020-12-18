package com.qtmwex.demo.data.playlist

import androidx.room.*

/**
 * Created by gokhan on 12/18/20.
 */
@Dao
interface PlaylistDao {

    @Query("SELECT * FROM Playlists")
    fun getPlaylists(): PlaylistData

    @Insert
    fun insert(playlistData: PlaylistData)

    @Update
    fun update(playlistData: PlaylistData)

    @Delete
    fun delete(playlistData: PlaylistData)
}
