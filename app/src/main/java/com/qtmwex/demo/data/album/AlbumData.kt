package com.qtmwex.demo.data.album

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Albums")
data class AlbumData(
    @PrimaryKey(autoGenerate = true) val Id: Long,
    val title: String,
    val count: Int,
    val year: Int,
    val artistId: Int
)
