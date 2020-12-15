package com.qtmwex.demo.data

import androidx.room.Entity

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Songs")
data class SongData(
    val id: Long,
    val name: String,
    val title: String,
    val duration: Int,
    val trackId: Int,
    val albumId: Long,
    val artistId: Long
)