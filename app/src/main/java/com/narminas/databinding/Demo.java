package com.narminas.databinding;

import com.narminas.databinding.models.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    private static final String[] PHOTOS = {
            "https://cdn2.thecatapi.com/images/bh7.jpg",
            "https://cdn2.thecatapi.com/images/IMRHljD4f.jpg",
            "https://cdn2.thecatapi.com/images/a9n.jpg",
            "https://cdn2.thecatapi.com/images/ap1.jpg",
            "https://cdn2.thecatapi.com/images/98i.jpg"
    };



    public static ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        for (String photo : PHOTOS) {
            Movie movie = new Movie(true, photo, Arrays.asList(PHOTOS).indexOf(photo), "Description...", "Photo " + ((Arrays.asList(PHOTOS).indexOf(photo)) + 1));
            movies.add(movie);
        }
        return movies;
    }

}
