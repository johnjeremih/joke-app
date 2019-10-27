package com.john.displaylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisplayActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }
}
