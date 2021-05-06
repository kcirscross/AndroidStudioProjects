package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    TextView nameProfile;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nameProfile = (TextView) findViewById(R.id.name_profile);
        Intent intent = getIntent();
        String name = intent.getStringExtra(LoginActivity.NAME);
        nameProfile.setText(name);
    }
}
