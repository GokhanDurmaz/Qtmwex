package com.qtmwex.demo.data.artist

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Artists")
data class ArtistData(
    @PrimaryKey(autoGenerate = true) val Id: Int,
    val name: String,
    val albumCount: Int,
    val songCount: Int
)
