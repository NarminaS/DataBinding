package com.narminas.databinding.utils;

import android.content.Context;
import android.widget.Toast;

import com.narminas.databinding.models.Movie;

public class Handler {

    private Context context;
    public Handler (Context context) {
        this.context = context;
    }

    public void onClickMovie(Movie movie) {
        Toast.makeText(context, movie.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
