package com.example.gunungdiindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Profil");
        }
    }
}
