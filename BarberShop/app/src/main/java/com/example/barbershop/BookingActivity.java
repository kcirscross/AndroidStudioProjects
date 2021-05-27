package com.example.barbershop;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BookingActivity extends AppCompatActivity {

    Calendar rightNow = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_booking);
        addMenu();

        for(int i=1; i<10; i++){
            rightNow.add(Calendar.HOUR, +1);
            Toast.makeText(this, ""+rightNow.get(Calendar.HOUR), Toast.LENGTH_SHORT).show();
        }

        ListView listView;
        //ArrayList<Booking> arrayList;
        //BookingAdapter adapter;
//        listView = findViewById(R.id.listviewbooking);
//        arrayList = new ArrayList<>();
//        arrayList.add(new Booking("9:00", "Fri 30 Aug"));
//        adapter = new BookingAdapter(getApplicationContext(), arrayList);
//        listView.setAdapter(adapter);



    }

    void addMenu(){
        BottomNavigationView menu = (BottomNavigationView) findViewById(R.id.bottom_menu);
        menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return true;

                    case R.id.booking:
                        Intent intent1 = new Intent(getApplicationContext(), BookingActivity.class);
                        startActivity(intent1);
                        return true;
                }
                return true;
            }
        });
    }
}