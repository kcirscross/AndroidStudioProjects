package com.example.barbershop;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Booking1Activity extends AppCompatActivity {
    RecyclerView revBooking1;
    RecyclerView revBooking2;
    Booking1Adapter booking1Adapter;
    ArrayList<Booking1> list;
    ArrayList<Booking1> list1;
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


        revBooking2 = findViewById(R.id.list2);

        list1 = new ArrayList<>();

        list1.add(new Booking1("Fri 30 Aug"));
        list1.add(new Booking1("Fri 30 Aug"));
        list1.add(new Booking1("Set 31 Aug"));
        list1.add(new Booking1("Sun 1 Sep"));
        list1.add(new Booking1("Mon 2 Sep"));
        list1.add(new Booking1("Tue 3 Sep"));
        list1.add(new Booking1("Wed 4 Sep"));

        booking1Adapter = new Booking1Adapter(getApplicationContext(), list1);
        revBooking2.setAdapter(booking1Adapter);
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 4);
        revBooking2.setLayoutManager(gridLayoutManager1);

    }

}
