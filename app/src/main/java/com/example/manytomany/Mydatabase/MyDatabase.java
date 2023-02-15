package com.example.manytomany.Mydatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.Song;
import com.example.manytomany.Model.User;
import com.example.manytomany.MyDao.MyDao;
import com.example.manytomany.Relationship.PlaylistSongCrossRef;

@Database(entities = {Playlist.class, Song.class, PlaylistSongCrossRef.class, User.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract  MyDao myDao();


    private static volatile MyDatabase INSTRANCE;

    public static MyDatabase getInstance(Context context){
        if(INSTRANCE == null){
            INSTRANCE = Room.databaseBuilder(context, MyDatabase.class, "DATABASE")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration().build();
        }
        return INSTRANCE;
    }


}
