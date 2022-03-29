package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ophtamologists extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophtamologists);

        listView = findViewById(R.id.ophtamologistsListView);

        ArrayList<Doctor> arrayList = new ArrayList<>();

        arrayList.add(new Doctor(R.drawable.oft3, "Pankaj Kumar", "Small incision cataract surgery – phacoemulsification including difficult cases Glaucoma diagnosis and management Glaucoma."));
        arrayList.add(new Doctor(R.drawable.oft1, "Meg Das", "Diabetic Eye Disease and Lasers Macular Degeneration Retinal Vascular disorders"));
        arrayList.add(new Doctor(R.drawable.oft2, "Alan Mully", "Adult strabismus and double vision. Strabismus surgery including adjustable suture surgery."));

        // custom adapter
        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);
    }

    public void makeAppoinment (View view) {
        startActivity(new Intent(this, MakeAppointment.class));
    }
}