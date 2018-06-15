package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        final Song song = getIntent().getParcelableExtra("song");

        TextView songNameTv = findViewById(R.id.song_name);
        songNameTv.setText(song.getSongName());
        TextView artistNameTv = findViewById(R.id.artist_name);
        artistNameTv.setText(song.getArtist().getArtistName());
        TextView albumNameTv = findViewById(R.id.album_name);
        albumNameTv.setText(song.getAlbum().getAlbumName());
        ImageView songIv = findViewById(R.id.image);
        Picasso.get().load(song.getImage()).into(songIv);
        ImageButton playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(Intent.ACTION_VIEW);
                playIntent.setData(Uri.parse(song.getYoutubeLink()));
                startActivity(playIntent);
            }
        });

    }
}
