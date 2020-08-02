package com.narminas.databinding.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.narminas.databinding.BR;

public class Movie  extends BaseObservable {
    public boolean isWatched;
    public String image;
    public String description;
    public String title;

    @Bindable
    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
        notifyPropertyChanged(BR.watched);
    }

    @Bindable
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyPropertyChanged(BR.description);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public Movie(boolean isWatched, String image, int i, String description, String title) {
        this.isWatched = isWatched;
        this.image = image;
        this.description = description;
        this.title = title;
    }
}
