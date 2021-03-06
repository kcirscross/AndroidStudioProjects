package com.example.barbershop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    ArrayList<ProfileMenu> profile_menu_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        GoogleSignInAccount lastAccount = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        ImageView photo = findViewById(R.id.photo);
        TextView display_name = findViewById(R.id.display_name);
        display_name.setText(lastAccount.getDisplayName());
        Picasso.get().load(""+lastAccount.getPhotoUrl()).into(photo);

        ListView listView = findViewById(R.id.profile_list_menu);
        profile_menu_list.add(new ProfileMenu("Lịch sử đặt chỗ"));
        ProfileMenuAdapter profileMenuAdapter = new ProfileMenuAdapter(profile_menu_list);
        listView.setAdapter(profileMenuAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProfileMenu profileMenu = (ProfileMenu) profileMenuAdapter.getItem(position);
                switch (profileMenu.menu){
                    case "Lịch sử đặt chỗ":
                        Intent intentHistory = new Intent(getApplicationContext(),HistoryBookingActivity.class);
                        startActivity(intentHistory);
                };
            }
        });
    }

}
