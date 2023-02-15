package com.example.manytomany.Model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Playlist {

   @PrimaryKey
   int playlistID;


   @ColumnInfo
    String playlistName;

   @ColumnInfo
   int userCreatorId;

    public Playlist(int playlistID, String playlistName, int userCreatorId) {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.userCreatorId = userCreatorId;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistID=" + playlistID +
                ", playlistName='" + playlistName + '\'' +
                ", userCreatorId=" + userCreatorId +
                '}';
    }

    public int getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(int playlistID) {
        this.playlistID = playlistID;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public int getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(int userCreatorId) {
        this.userCreatorId = userCreatorId;
    }
}

