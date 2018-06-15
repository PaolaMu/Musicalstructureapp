package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    //Songs details

    private String songName;

    //Song link

    private String youtubeLink;

    private Album album;

    private Artist artist;

    private String imageLink;

    public Song(String songName, String youtubeLink, String image, Album album, Artist artist) {
        this.songName = songName;
        this.youtubeLink = youtubeLink;
        this.album = album;
        this.artist = artist;
        this.imageLink = image;
    }
    //Get the Name of the song


    protected Song(Parcel in) {
        songName = in.readString();
        youtubeLink = in.readString();
        album = in.readParcelable(Album.class.getClassLoader());
        artist = in.readParcelable(Artist.class.getClassLoader());
        imageLink = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(songName);
        dest.writeString(youtubeLink);
        dest.writeParcelable(album, flags);
        dest.writeParcelable(artist, flags);
        dest.writeString(imageLink);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    public String getSongName() {
        return songName;
    }

    //Get the Link from youtube

    public String getYoutubeLink() {
        return youtubeLink;
    }

    //Get the Album details

    public Album getAlbum() {
        return album;
    }

    //Get the Artist details

    public Artist getArtist() {
        return artist;
    }

    //Get the Image file

    public String getImage() {
        return imageLink;
    }
}








