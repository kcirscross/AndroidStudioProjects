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
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
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
    ArrayList<Booking1> list = new ArrayList<>();
    ArrayList<Booking1> list1 = new ArrayList<>();
    String days, hours;
    DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking1);
        addDaysList();
        addHoursList();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Schedule").child("05-06-2021").child("19:00").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if(snapshot.getChildrenCount() == 2){
                    Toast.makeText(Booking1Activity.this, "hahaa", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
        GoogleSignInAccount lastAccount = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        Button confirm = findViewById(R.id.confirm_button);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScheduleInformation si = new ScheduleInformation(lastAccount.getEmail(), lastAccount.getDisplayName());
                mDatabase.child("Schedule").child(days).child(hours).child(mDatabase.push().getKey()).setValue(si);
            }
        });



    }

    public void addDaysList(){
        SimpleDateFormat daysFormat = new SimpleDateFormat("dd-MM-yyyy");
        for(int i = 0; i < 8; i++){
            Calendar days = Calendar.getInstance();
            days.add(Calendar.DAY_OF_MONTH, i);
            list.add(new Booking1(""+daysFormat.format(days.getTime())));
        }
        revBooking1 = findViewById(R.id.list1);
        booking1Adapter = new Booking1Adapter(getApplicationContext(), list, this);
        revBooking1.setAdapter(booking1Adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        revBooking1.setLayoutManager(gridLayoutManager);
    }
    public void addHoursList(){
        Calendar time = Calendar.getInstance();
        time.set(Calendar.HOUR_OF_DAY, 9);
        time.set(Calendar.MINUTE, 30);
        SimpleDateFormat hoursFormat = new SimpleDateFormat("HH:mm");

        for(int i = 0; i <= 19; i++){
            time.add(Calendar.MINUTE, 30);
            list1.add(new Booking1(""+hoursFormat.format(time.getTime())));
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
        days = booking1.getDay();
        LinearLayout layout_list2 = findViewById(R.id.layout_list2);
        layout_list2.setVisibility(View.VISIBLE);
    }

    @Override
    public void onItemClick2(int position) {
        Booking1 booking2 = list1.get(position);
        Toast.makeText(this, ""+booking2.getDay(), Toast.LENGTH_SHORT).show();
        hours = booking2.getDay();
    }
}
