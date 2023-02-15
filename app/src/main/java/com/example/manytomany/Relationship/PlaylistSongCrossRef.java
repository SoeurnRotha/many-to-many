package com.example.manytomany.Relationship;


import androidx.room.Entity;

@Entity(primaryKeys = {"playlistID", "songID"})
public class PlaylistSongCrossRef {

    int playlistID;
    int songID;

    public PlaylistSongCrossRef(int playlistID, int songID) {
        this.playlistID = playlistID;
        this.songID = songID;
    }

    public int getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(int playlistID) {
        this.playlistID = playlistID;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    @Override
    public String toString() {
        return "PlaylistSongCrossRef{" +
                "playlistID=" + playlistID +
                ", songID=" + songID +
                '}';
    }
}
