package com.example.manytomany.Relationship;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.Song;

import java.util.List;


public class PlaylistWithSong {
    @Embedded
    public Playlist playlist;

    @Relation(
            parentColumn = "playlistID",
            entityColumn = "songID",
            associateBy = @Junction(PlaylistSongCrossRef.class)
    )
    public List<Song> song;

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "PlaylistWithSong{" +
                "playlist=" + playlist +
                ", song=" + song +
                '}';
    }
}
