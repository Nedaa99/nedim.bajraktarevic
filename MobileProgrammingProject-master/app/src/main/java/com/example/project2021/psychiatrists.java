package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class psychiatrists extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychiatrists);

        listView = findViewById(R.id.psychiatristsListView);

        ArrayList<Doctor> arrayList = new ArrayList<>();

        arrayList.add(new Doctor(R.drawable.ps2, "Craig Mattocks", "Craig has over 18 years experience working as a registered Psychologist in both public and private settings. His broad experience working with children, adolescents, and adults has equipped him with the skills to support clients with a range of diagnoses and needs, including, but not limited to anxiety, depression and adjustment issues."));
        arrayList.add(new Doctor(R.drawable.ps3, "David Else", "David was born and raised in Western Australia where he completed an Honours degree in Psychology at the University of Western Australia in Perth in 1996. He moved to Qld to complete a Masters in Sport and Exercise Psychology through the USQ and worked in elite swimming during the lead up to the Sydney Olympics"));
        arrayList.add(new Doctor(R.drawable.ps1, "Karen Reid", "Working from a client centred approach with evidence based treatments, Jennifer uses a range of focused psychological strategies; Cognitive Behavioural Therapy (CBT), Acceptance and Commitment Therapy (ACT), Eye Movement Desensitisation and Reprocessing (EMDR), Solution Focused Therapy, Neuropsychotherapy, Psycho-education and other creative modes of practice."));

        // custom adapter
        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);
    }

    public void makeAppoinment (View view) {
        startActivity(new Intent(this, MakeAppointment.class));
    }
}