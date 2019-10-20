package com.example.rajeevquiz2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Rajeev extends AppCompatActivity {
    RecyclerView rv ;
    List<String> myList ;
    ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajeev);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rv = (RecyclerView)findViewById(R.id.recyclerView2) ;
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        myList = new ArrayList<String>();
        myList.add("Machine Learning");
        myList.add("Computer Networks");
        myList.add("MySql");
        myList.add("Mathematics");
        myList.add("Problem Solving");
        myList.add("Big Data");
        myList.add("Data Structures");
        myList.add("Compiler Design");
        myList.add("Internet Of Things");
        myList.add("Cloud Computing");
        myList.add("Operating Sytems");
        myList.add("Raptor");

        adapter = new ItemAdapter(this, myList);
        rv.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
