package com.narminas.databinding.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.narminas.databinding.Demo;
import com.narminas.databinding.activities.MainActivity;
import com.narminas.databinding.adapers.MoviesAdapter;
import com.narminas.databinding.models.Movie;

import java.util.List;

public class MoviesListViewModel extends BaseObservable {

    List<Movie> movies;
    RecyclerView recyclerView;
    MoviesAdapter adapter;
    LinearLayoutManager layoutManager;

    @Bindable
    public LinearLayoutManager getLayoutManager() {
        return layoutManager;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
        adapter.setMovies(this.movies);
    }

    public MoviesListViewModel(MainActivity activity) {
        recyclerView = activity.dataBinding.moviesRecycler;
        movies = Demo.getMovies();
        adapter = new MoviesAdapter(movies, activity);
        layoutManager = new LinearLayoutManager(activity);
        recyclerView.setAdapter(adapter);
    }
}
