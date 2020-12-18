package com.qtmwex.demo.data.playlist

import androidx.room.Database

/**
 * Created by gokhan on 12/18/20.
 */
@Database(entities = [PlaylistData::class], version = 1, exportSchema = false)
abstract class PlaylistDatabase {

    abstract fun getPlaylistDao(): PlaylistDao
}
