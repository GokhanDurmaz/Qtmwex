package com.qtmwex.demo.data.song

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by gokhan on 12/18/20.
 */
@Database(entities = [SongData::class], version = 1, exportSchema = false)
abstract class SongDatabase: RoomDatabase() {

    abstract fun getSongDao(): SongDao
}
