package com.example.manytomany.Relationship;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.User;

import java.util.List;

public class UserWithPlaylistsAndSongs {

    @Embedded
    public User user;


    @Relation(
            entity = Playlist.class,
            parentColumn = "userid",
            entityColumn = "userCreatorId"
    )
    public List<PlaylistWithSong> playlistWithSongs;

    public UserWithPlaylistsAndSongs(User user, List<PlaylistWithSong> playlistWithSongs) {
        this.user = user;
        this.playlistWithSongs = playlistWithSongs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PlaylistWithSong> getPlaylistWithSongs() {
        return playlistWithSongs;
    }

    public void setPlaylistWithSongs(List<PlaylistWithSong> playlistWithSongs) {
        this.playlistWithSongs = playlistWithSongs;
    }

    @Override
    public String toString() {
        return "UserWithPlaylistsAndSongs{" +
                "user=" + user +
                ", playlistWithSongs=" + playlistWithSongs +
                '}';
    }
}
