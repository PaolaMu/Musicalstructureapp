package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {

    //Artist Name

    private String artistName;

    //Musical genres

    private String genre;

    public Artist(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
    }

    protected Artist(Parcel in) {
        artistName = in.readString();
        genre = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(artistName);
        dest.writeString(genre);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }
}
