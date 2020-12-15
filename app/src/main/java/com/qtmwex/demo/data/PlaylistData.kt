package com.qtmwex.demo.data

import androidx.room.Entity

/**
 * Created by gokhan on 12/15/20.
 */
@Entity(tableName = "Playlists")
data class PlaylistData(val id: Int, val name: String, val songCount: Int)