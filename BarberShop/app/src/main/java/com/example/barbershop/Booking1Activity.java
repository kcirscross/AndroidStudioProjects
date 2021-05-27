package com.example.barbershop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Booking1Activity extends AppCompatActivity {
    RecyclerView revBooking1;
    Booking1Adapter booking1Adapter;
    ArrayList<Booking1> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking1);

        revBooking1 = findViewById(R.id.list1);

        list = new ArrayList<>();

        list.add(new Booking1("Fri 30 Aug"));
        list.add(new Booking1("Fri 30 Aug"));
        list.add(new Booking1("Set 31 Aug"));
        list.add(new Booking1("Sun 1 Sep"));
        list.add(new Booking1("Mon 2 Sep"));
        list.add(new Booking1("Tue 3 Sep"));
        list.add(new Booking1("Wed 4 Sep"));

        booking1Adapter = new Booking1Adapter(getApplicationContext(), list);
        revBooking1.setAdapter(booking1Adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        revBooking1.setLayoutManager(gridLayoutManager);

    }
}
