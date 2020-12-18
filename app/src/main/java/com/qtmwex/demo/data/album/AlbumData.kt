package com.qtmwex.demo.data.album

import androidx.room.Entity

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Albums")
data class AlbumData(
    val id: Long,
    val title: String,
    val count: Int,
    val year: Int,
    val artistId: Int
)