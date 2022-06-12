package com.geektech.hw3_persons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ReceiverCallNotAllowedException;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        PersonAdapter adapter = new PersonAdapter(persons);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        persons = new ArrayList<>();
        persons.add("Hulk");
        persons.add("SpiderMan");
        persons.add("SuperMan");
        persons.add("Capitan america");
        persons.add("Berserk");
        persons.add("Magic");
        persons.add("Warrior");
        persons.add("Super girl");
        persons.add("Batmen");
        persons.add("Red Hulk");
        persons.add("Doctor Strange");
        persons.add("Mysterio");
        persons.add("Gamora");
        persons.add("iron Man");
        persons.add("Mantis");
        persons.add("Rocket");
        persons.add("Thor");
        persons.add("Nebula");
        persons.add("Thanos");
        persons.add("Warrior");
    }
}