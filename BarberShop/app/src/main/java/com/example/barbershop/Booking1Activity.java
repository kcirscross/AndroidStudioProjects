package com.example.barbershop;

import android.app.AppComponentFactory;
import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Booking1Activity extends AppCompatActivity {
    private RecyclerView revBooking1;
    private Booking1Adapter mbooking1Adapter;
   @Override
    protected void onCreate (Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_booking1);

       revBooking1 = findViewById(R.id.list1);
       mbooking1Adapter = new Booking1Adapter(this);

       GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
       revBooking1.setLayoutManager(gridLayoutManager);

       mbooking1Adapter.setData(getListBooking1());
   }
   private List<Booking1> getListBooking1(){
    List<Booking1> list = new ArrayList<>();
    list.add(new Booking1("Fri 30 Aug"));
    list.add(new Booking1("Fri 30 Aug"));
    list.add(new Booking1("Set 31 Aug"));
    list.add(new Booking1("Sun 1 Sep"));
    list.add(new Booking1("Mon 2 Sep"));
    list.add(new Booking1("Tue 3 Sep"));
    list.add(new Booking1("Wed 4 Sep"));
    return list;
   }
}
