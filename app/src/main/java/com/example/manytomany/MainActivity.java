package com.example.manytomany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.manytomany.Model.Playlist;
import com.example.manytomany.Model.Song;
import com.example.manytomany.Model.User;
import com.example.manytomany.Mydatabase.MyDatabase;
import com.example.manytomany.Relationship.PlaylistSongCrossRef;
import com.example.manytomany.Relationship.PlaylistWithSong;
import com.example.manytomany.Relationship.SongWithPlaylist;
import com.example.manytomany.Relationship.UserWithPlaylistsAndSongs;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Database Access";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1001, "Rohta"));
//        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1002, "Chea"));
//        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1003, "Kiki"));
//        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1004, "Sinn Sisamouth"));
//
//
//
//
//        MyDatabase.getInstance(this).myDao().insertSong(new Song(1001, "កំពតកំពូលចិត្", "Sinn Sisamouth" ));
//        MyDatabase.getInstance(this).myDao().insertSong(new Song(1002, "កំពត❤ទីនោះមានអត្ថន័យចំពោះខ្ញុំណាស់\n" +
//                "នឹកគ្រប់ពេល", "Sinn Sisamouth" ));
//        MyDatabase.getInstance(this).myDao().insertSong(new Song(1003, "J+o", "Vanda" ));
//        MyDatabase.getInstance(this).myDao().insertSong(new Song(1004, "Hot boy", "Vanda" ));
//
////
//        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1001, 1001));
//        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1002, 1002));
//        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1001, 1002));

//
//        List<PlaylistWithSong> playlistWithSongs = MyDatabase.getInstance(this).myDao().getPlaylistWithSong();
//        List<SongWithPlaylist> songWithPlaylists = MyDatabase.getInstance(this).myDao().getSongWithPlaylist();

//        Log.d(TAG, ""+ playlistWithSongs.toString());
//        Log.d(TAG, ""+ songWithPlaylists.toString());

















        //insert user

        MyDatabase.getInstance(this).myDao().insertUser(new User(1,"Rotha", 18));
        MyDatabase.getInstance(this).myDao().insertUser(new User(2,"Chea", 50));
        MyDatabase.getInstance(this).myDao().insertUser(new User(3,"Rith", 80));
        MyDatabase.getInstance(this).myDao().insertUser(new User(4,"Lyhour", 50));


        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1001,"Song vanda", 1));
        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1002,"Song Book", 1));

        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1003,"Song The Weeknd", 2));
        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1004,"Song Khmer", 2));

        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1005,"Song Usa", 3));
        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1006,"Song india", 3));

        MyDatabase.getInstance(this).myDao().insertPlaylist(new Playlist(1007,"Song Russia", 4));



        MyDatabase.getInstance(this).myDao().insertSong(new Song(1, "Blinding Lights (Official Video)", "The Weeknd"));
        MyDatabase.getInstance(this).myDao().insertSong(new Song(2, " The Hills (Official Video)", "The Weeknd"));
        MyDatabase.getInstance(this).myDao().insertSong(new Song(3, "The Supremes, ‘Baby Love’", "Holland-Dozier-Holland"));
        MyDatabase.getInstance(this).myDao().insertSong(new Song(4, "Townes Van Zandt, ‘Pancho and Lefty’", "TOWNES VAN ZANDT"));



        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1001,1));
        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1002,2));
        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1003,3));
        MyDatabase.getInstance(this).myDao().insertCrossRef(new PlaylistSongCrossRef(1004,4));



        List<UserWithPlaylistsAndSongs> userWithPlaylistsAndSongs = MyDatabase.getInstance(this).myDao().getUsersWithPlaylistsAndSongs();
        List<PlaylistWithSong> playlistWithSongs = MyDatabase.getInstance(this).myDao().getPlaylistWithSong();
        List<SongWithPlaylist> songWithPlaylists = MyDatabase.getInstance(this).myDao().getSongWithPlaylist();




        Log.d(TAG, ""+ userWithPlaylistsAndSongs.toString());
        Log.d(TAG, ""+ playlistWithSongs.toString());
        Log.d(TAG, ""+ songWithPlaylists.toString());
    }



}