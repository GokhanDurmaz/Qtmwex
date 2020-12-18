package com.qtmwex.demo.data.song

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Songs")
data class SongData(
    @PrimaryKey(autoGenerate = true) val Id: Long,
    val name: String,
    val title: String,
    val duration: Int,
    val trackId: Int,
    val albumId: Long,
    val artistId: Long
)
