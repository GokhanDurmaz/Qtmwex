package com.qtmwex.demo.data.artist

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by gokhan on 12/18/20.
 */
@Database(entities = [ArtistData::class], version = 1, exportSchema = false)
abstract class ArtistDatabase: RoomDatabase() {

    abstract fun getArtistDao(): ArtistDao
}
