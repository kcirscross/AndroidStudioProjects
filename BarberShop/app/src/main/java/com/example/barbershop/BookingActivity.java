package com.example.barbershop;

import android.os.Bundle;

import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        ListView listView;
        ArrayList<Booking> arrayList;
        BookingAdapter adapter;
        listView = findViewById(R.id.listviewbooking);
        arrayList = new ArrayList<>();
        arrayList.add(new Booking("9:00", "Fri 30 Aug"));
        adapter = new BookingAdapter(getApplicationContext(), R.layout.layout_booking, arrayList);
        listView.setAdapter(adapter);
    }
}