package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(@NonNull Context context, int resource, @NonNull List<Song> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_song, parent, false);
        }

        // Get the {currentSongName} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the item_song.xml layout with the ID song_name
        TextView song_nameTextView = listItemView.findViewById(R.id.song_name);
        // Get the name from the current Song and
        // set this text on the Song TextView
        song_nameTextView.setText(currentSong.getSongName());

        // Find the TextView in the item_song.xml layout with the ID artist_name
        TextView artist_nameTextView = listItemView.findViewById(R.id.artist_name);
        // Get the version name from the current Artist and
        // set this text on the Artist TextView
        Artist artist = currentSong.getArtist();
        artist_nameTextView.setText(artist.getArtistName());

        // Find the TextView in the item_song.xml layout with the ID album_name
        TextView album_nameTextView = listItemView.findViewById(R.id.album_name);
        // Get the name of the current Album object and
        // set this text on the Album TextView
        Album album = currentSong.getAlbum();
        album_nameTextView.setText(album.getAlbumName());

        //Find the ImageView in the item_song.xml layout with the ID image
        ImageView imageImageView = listItemView.findViewById(R.id.image);
        // Get the image from the current image object and
        // set this image on the imageView
        Picasso.get().load(currentSong.getImage()).into(imageImageView);


        // Return the whole list song layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
