package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class cardiologists extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiologists);

        listView = findViewById(R.id.cardiologistListView);

        ArrayList<Doctor> arrayList = new ArrayList<>();

        arrayList.add(new Doctor(R.drawable.cardio1, "Emyr Fenton", "Board Certified by the American Board of Internal Medicine in Internal Medicine, Cardiovascular Disease and Interventional Cardiology"));
        arrayList.add(new Doctor(R.drawable.cardio22, "Harper Pollard", "Board Certified by the American Board of Internal Medicine in Cardiovascular Disease and Internal Medicine"));
        arrayList.add(new Doctor(R.drawable.cardio3, "Alisa Hewitt", "Specializing in the diagnosis and treatment of cardiovascular disease"));

        // custom adapter

        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);

    }

    public void makeAppoinment (View view) {
        startActivity(new Intent(this, MakeAppointment.class));
    }
}