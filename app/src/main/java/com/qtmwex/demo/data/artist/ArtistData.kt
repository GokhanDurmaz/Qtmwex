package com.qtmwex.demo.data.artist

import androidx.room.Entity

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Artists")
data class ArtistData(
    val id: Int,
    val name: String,
    val albumCount: Int,
    val songCount: Int
)