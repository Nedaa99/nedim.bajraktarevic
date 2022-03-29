package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class dentists extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentists);

        listView = findViewById(R.id.dentistsListView);

        ArrayList<Doctor> arrayList = new ArrayList<>();

        arrayList.add(new Doctor(R.drawable.dentist1, "Ross Mansell", "One of the leader doctors in \n orthodontics"));
        arrayList.add(new Doctor(R.drawable.dentist2, "Markus Mccull", "Several specializations \n ahead"));
        arrayList.add(new Doctor(R.drawable.dentists3, "Montel Dejesus", "Board Certified by the International Board of Dentists"));
        arrayList.add(new Doctor(R.drawable.dentist4, "Isabel Jenkins", "Dr. Nicole Matthews is a general dentist that enjoys offering a variety of dental services to every age group. She is from the New Haven area and a graduate of Washington High School."));


        // custom adapter

        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);

    }

    public void makeAppoinment (View view) {
        startActivity(new Intent(this, MakeAppointment.class));
    }
}