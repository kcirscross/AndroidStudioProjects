package com.example.barbershop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Booking2Activity extends AppCompatActivity {
    RecyclerView revBooking2;
    Booking2Adapter booking2Adapter;
    ArrayList<Booking2> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking1);

        revBooking2 = findViewById(R.id.list2);

        list = new ArrayList<>();

        list.add(new Booking2("08:30 AM"));
        list.add(new Booking2("08:30 AM"));
        list.add(new Booking2("08:30 AM"));
        list.add(new Booking2("08:30 AM"));
        list.add(new Booking2("08:30 AM"));
        list.add(new Booking2("08:30 AM"));


        booking2Adapter = new Booking2Adapter(getApplicationContext(), list);
        revBooking2.setAdapter(booking2Adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        revBooking2.setLayoutManager(gridLayoutManager);

    }
}
