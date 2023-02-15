package com.example.manytomany.MyDao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.Song;
import com.example.manytomany.Model.User;
import com.example.manytomany.Relationship.PlaylistSongCrossRef;
import com.example.manytomany.Relationship.PlaylistWithSong;
import com.example.manytomany.Relationship.SongWithPlaylist;
import com.example.manytomany.Relationship.UserWithPlaylistsAndSongs;

import java.util.List;


@Dao
public interface MyDao {


    @Insert
    void insertUser(User user);

    @Insert
    void insertPlaylist(Playlist playlist);

    @Insert
    void insertSong(Song song);


    @Insert
    void insertCrossRef(PlaylistSongCrossRef playlistSongCrossRef);


    @Transaction
    @Query("SELECT * FROM Playlist")
    List<PlaylistWithSong> getPlaylistWithSong();



    @Transaction
    @Query("SELECT * FROM Song")
    List<SongWithPlaylist> getSongWithPlaylist();



    @Query("SELECT * FROM Playlist")
    List<Playlist> getPlaylist();



    @Query("SELECT * FROM Song")
    List<Song> getSong();


    @Transaction
    @Query("SELECT * FROM User")
    public List<UserWithPlaylistsAndSongs> getUsersWithPlaylistsAndSongs();

}
