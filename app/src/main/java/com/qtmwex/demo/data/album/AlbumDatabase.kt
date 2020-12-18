package com.qtmwex.demo.data.album

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by gokhan on 12/18/20.
 */
@Database(entities = [AlbumData::class], version = 1, exportSchema = false)
abstract class AlbumDatabase: RoomDatabase() {

    abstract fun getAlbumDao(): AlbumDao
}
