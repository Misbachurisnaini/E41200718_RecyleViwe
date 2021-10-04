package com.example.recyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);

        objMovies.add(new Movies("The Suicide Squad", "Action, Adventure, Comedy", "James Gun", 7.3,
                "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
                "6 Agustus"));
        objMovies.add(new Movies("Money Heist", "Kriminal, Thriller", "Álex Pina", 8.2, "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain.",
                "3 September"));
        objMovies.add(new Movies("The Simpsons", "Animation, Comedy", "James L. BrooksMatt GroeningSam Simon", 8.6, "The satiric adventures of a working-class family in the misfit city of Springfield.", "" +
                "10 Oktober"));
        objMovies.add(new Movies("Silent", "Animation, Short, Adventure", "Limbert FabianBrandon Oldenburg", 6.3, "Two street performers dream of bringing their 'Picture and Sound Show'to life. When they discover a magical contraption inside an old theatre, they embark on a cinematic adventure of sight and sound, traveling through movie history to find the audience they always wanted.",
                "2014"));
        objMovies.add(new Movies("Doraemon Stand By Me 2", "Animation, Comedy, Drama", "Ryuichi YagiTakashi Yamazaki", 7.9,
                "One day Nobita Nobi found a old stuffed bear which his grandmother gave it to him. Nobita decided to go back in time to meet his grandmother. Grandma accepts Nobita's belief that he is a young child who has suddenly arrived. Nobita' s grandmother said \"I want to see your bride once.\" And from this one sentence of grandma Doraemon and Nobita's big blasphemy begins. Nobita and Doraemon were trying to show their grandmother a marriage ceremony, but Adult Nobita escaped on the day of his marriage ceremony. Adult Gian and Suneo looking for Nobita. Shizuka who keeps waiting with confidence. Nobita and Doraemon take the time to fulfill the wishes of grandma, to meet the wishes of her family, friends and Shizuka Minamoto, who she likes very much.",
                "2020"));
        objMovies.add(new Movies("Stranger Things", "Drama, Fantasy, Horror", "Matt DufferRoss Duffer", 8.7, "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.",
                "2016"));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}