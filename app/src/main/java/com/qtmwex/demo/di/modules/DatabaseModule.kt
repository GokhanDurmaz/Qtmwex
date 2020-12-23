package com.qtmwex.demo.di.modules

import androidx.room.Room
import com.qtmwex.demo.App
import com.qtmwex.demo.data.album.AlbumDatabase
import com.qtmwex.demo.data.artist.ArtistDatabase
import com.qtmwex.demo.data.playlist.PlaylistDatabase
import com.qtmwex.demo.data.song.SongDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gokhan on 12/23/20.
 */
@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideAlbumDatabase(app: App) = Room
        .databaseBuilder(app, AlbumDatabase::class.java, "albumDatabase.Db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideAlbumDao(albumDatabase: AlbumDatabase) = albumDatabase.getAlbumDao()

    @Provides
    @Singleton
    fun provideArtistDatabase(app: App) = Room
        .databaseBuilder(app, ArtistDatabase::class.java, "artistDatabase.Db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideArtistDao(artistDatabase: ArtistDatabase) = artistDatabase.getArtistDao()

    @Provides
    @Singleton
    fun providePlaylistDatabase(app: App) = Room
        .databaseBuilder(app, PlaylistDatabase::class.java, "playlistDatabase.Db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun providePlaylistDao(playlistDatabase: PlaylistDatabase) = playlistDatabase.getPlaylistDao()

    @Provides
    @Singleton
    fun provideSongDatabase(app: App) = Room
        .databaseBuilder(app, SongDatabase::class.java, "songDatabase.Db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideSongDao(songDatabase: SongDatabase) = songDatabase.getSongDao()
}
