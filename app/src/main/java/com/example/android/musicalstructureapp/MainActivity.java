package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.list);
        Database db = new Database();
        final ArrayList<Song> songs = db.getSongs();
        SongAdapter adapter = new SongAdapter(this, R.layout.item_song, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song clickSong = songs.get(position);
                Intent songIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                songIntent.putExtra("song", clickSong);
                startActivity(songIntent);

            }
        });
    }
}