package com.example.project2021;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DoctorAdapter extends ArrayAdapter<Doctor> {

    private Context mcontext;
    private int mResource;


    public DoctorAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Doctor> objects) {
        super(context, resource, objects);

        this.mcontext = context;
        this.mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      //  return super.getView(position, convertView, parent);

        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewOpis = convertView.findViewById(R.id.textViewOpis);

        imageView.setImageResource(getItem(position).getImage());
        textViewName.setText(getItem(position).getName());
        textViewOpis.setText(getItem(position).getOpis());

        return convertView;
    }
}
