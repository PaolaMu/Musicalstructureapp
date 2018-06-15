package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable {

    //Album details

    private String albumName;

    //Album release

    private String release;

    public Album(String albumName, String release) {
        this.albumName = albumName;
        this.release = release;
    }

    protected Album(Parcel in) {
        albumName = in.readString();
        release = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(albumName);
        dest.writeString(release);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public String getAlbumName() {
        return albumName;
    }

    public String getRelease() {
        return release;
    }
}
