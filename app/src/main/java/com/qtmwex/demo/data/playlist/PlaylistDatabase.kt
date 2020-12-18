package com.qtmwex.demo.data.playlist

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by gokhan on 12/18/20.
 */
@Database(entities = [PlaylistData::class], version = 1, exportSchema = false)
abstract class PlaylistDatabase: RoomDatabase() {

    abstract fun getPlaylistDao(): PlaylistDao
}
