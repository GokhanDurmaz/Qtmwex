package com.qtmwex.demo.data.playlist

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Playlists")
data class PlaylistData(
    @PrimaryKey(autoGenerate = true) val Id: Int,
    val name: String,
    val songCount: Int
)
