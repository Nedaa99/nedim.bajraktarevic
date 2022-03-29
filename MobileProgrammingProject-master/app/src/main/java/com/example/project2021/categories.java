package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class categories extends AppCompatActivity {

    Button dentists, ophtamologists, cardiologists, psychologist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        dentists = findViewById(R.id.dentist);
        ophtamologists = findViewById(R.id.ophthalmologist);
        cardiologists = findViewById(R.id.cardiologist);
        psychologist = findViewById(R.id.psychologist);

        dentists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.project2021.categories.this, com.example.project2021.dentists.class));
            }
        });

        ophtamologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.project2021.categories.this, com.example.project2021.ophtamologists.class));
            }
        });

        cardiologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.project2021.categories.this, com.example.project2021.cardiologists.class));
            }
        });

        psychologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.project2021.categories.this, com.example.project2021.psychiatrists.class));
            }
        });

    }



}