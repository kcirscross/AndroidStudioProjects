package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    RecyclerView recyclerView;
    String s1[], s2[];
    //    int images[] ={R.drawable.animal1,R.drawable.animal2,R.drawable.animal3,R.drawable.animal4,
//    R.drawable.animal5,R.drawable.animal6,R.drawable.animal7,R.drawable.animal8};
    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        s1 = getResources().getStringArray(R.array.pet_animal);
        s2 = getResources().getStringArray(R.array.animal);
        String s3[] = getResources().getStringArray(R.array.stt_animal);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}