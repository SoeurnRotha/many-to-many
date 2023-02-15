package com.example.manytomany.Relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.Song;

import java.util.List;

public class SongWithPlaylist {
    @Embedded
    public Song song;

    @Relation(
            parentColumn = "songID",
            entityColumn = "playlistID",
            associateBy = @Junction(PlaylistSongCrossRef.class)
    )
     public List<Playlist> playlistList;

    public SongWithPlaylist(Song song, List<Playlist> playlistList) {
        this.song = song;
        this.playlistList = playlistList;
    }

    @Override
    public String toString() {
        return "SongWithPlaylist{" +
                "song=" + song +
                ", playlistList=" + playlistList +
                '}';
    }
}
