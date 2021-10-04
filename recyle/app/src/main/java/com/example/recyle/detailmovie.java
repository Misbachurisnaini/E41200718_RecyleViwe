package com.example.recyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detailmovie extends AppCompatActivity {

    TextView textViewTitle, textViewRating, textViewGenre, textViewRelaseDate, textViewDirector, textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmovie);

        textViewTitle = findViewById(R.id.tvTitle);
        textViewRating = findViewById(R.id.tvRating);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewRelaseDate = findViewById(R.id.tvRelaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

        Movies movies = getIntent().getParcelableExtra("MOVIES");
        textViewTitle.setText(movies.getTitle());
        textViewRating.setText(String.valueOf(movies.getRating()));
        textViewGenre.setText(movies.getGenre());
        textViewRelaseDate.setText(movies.getRelasedate());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());
    }
}