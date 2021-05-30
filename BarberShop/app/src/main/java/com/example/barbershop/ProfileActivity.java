package com.example.barbershop;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
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

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        GoogleSignInAccount lastAccount = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        ImageView photo = findViewById(R.id.photo);
        TextView display_name = findViewById(R.id.display_name);
        display_name.setText(lastAccount.getDisplayName());
        Picasso.get().load(""+lastAccount.getPhotoUrl()).into(photo);

    }

}
