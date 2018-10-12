package com.example.android.student;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding the studentlist Adapter with recyclerview
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        final StudentListAdapter studentListAdapter = new StudentListAdapter(this);
        recyclerView.setAdapter(studentListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fab = (FloatingActionButton)findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EditorActivity.class);
                startActivity(intent);
            }
        });
    }

}
