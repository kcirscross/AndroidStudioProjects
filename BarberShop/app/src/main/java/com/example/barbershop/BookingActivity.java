package com.example.barbershop;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        InitView();
    }
    public void InitView(){
        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.booking_recyclerview);
        recyclerview.setHasFixedSize(true);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(layoutmanager);
        ArrayList<Booking> booking = new ArrayList<>();
        booking.add(new Booking("1", ""));
        booking.add(new Booking("1", ""));
        booking.add(new Booking("1", ""));
        booking.add(new Booking("1", ""));
        booking.add(new Booking("1", ""));
        BookingAdapter bookingAdapter = new BookingAdapter(booking, getApplicationContext());
        recyclerview.setAdapter(bookingAdapter);
    }
}
