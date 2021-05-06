package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu, menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();

    }
    public void InitView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CustomListView> arrayList = new ArrayList<>();
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));
        arrayList.add(new CustomListView("1", "1", "1", "1", "1", "1", "1"));

        CustomAdapter customAdapter = new CustomAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(customAdapter);
    }
}