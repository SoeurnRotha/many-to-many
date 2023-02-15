package com.example.manytomany.Model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Song {
    @PrimaryKey
    public int songID;

    @ColumnInfo
    public String songName;
    @ColumnInfo
    public String artist;

    public Song(int songID, String songName, String artist) {
        this.songID = songID;
        this.songName = songName;
        this.artist = artist;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songID=" + songID +
                ", songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
