package com.example.firstapplication.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Anime  implements Parcelable {
    private String name, description, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    //Parceable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(photo);
    }

    public Anime(){

    }

    protected Anime(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Anime> CREATOR = new Parcelable.Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

}
