package com.narminas.databinding.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.narminas.databinding.R;
import com.narminas.databinding.databinding.ActivityMainBinding;
import com.narminas.databinding.viewmodels.MoviesListViewModel;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        dataBinding.setViewModel(new MoviesListViewModel(this));
    }
}
