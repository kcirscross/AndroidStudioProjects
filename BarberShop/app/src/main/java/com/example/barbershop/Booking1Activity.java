package com.example.barbershop;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Booking1Activity extends AppCompatActivity implements RecyclerViewClickInterface{
    RecyclerView revBooking1;
    RecyclerView revBooking2;
    Booking1Adapter booking1Adapter;
    Booking2Adapter booking2Adapter;
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

        booking1Adapter = new Booking1Adapter(getApplicationContext(), list, this);
        revBooking1.setAdapter(booking1Adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        revBooking1.setLayoutManager(gridLayoutManager);



        list1 = new ArrayList<>();
        Calendar time = Calendar.getInstance();
        time.set(Calendar.HOUR, 9);
        time.set(Calendar.MINUTE, 30);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        for(int i = 1; i <= 15; i++){
            time.add(Calendar.MINUTE, 30);
            list1.add(new Booking1(""+simpleDateFormat.format(time.getTime())));
        }

        revBooking2 = findViewById(R.id.list2);
        booking2Adapter = new Booking2Adapter(getApplicationContext(), list1, this);
        revBooking2.setAdapter(booking2Adapter);
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 4);
        revBooking2.setLayoutManager(gridLayoutManager1);

    }

    @Override
    public void onItemClick(int position) {
        Booking1 booking1 = list.get(position);
        Toast.makeText(this, ""+booking1.getDay(), Toast.LENGTH_SHORT).show();
        LinearLayout layout_list2 = findViewById(R.id.layout_list2);
        layout_list2.setVisibility(View.VISIBLE);
    }

    @Override
    public void onItemClick2(int position) {
        Booking1 booking2 = list1.get(position);
        Toast.makeText(this, ""+booking2.getDay(), Toast.LENGTH_SHORT).show();
    }
}
