package com.john.javaandandroidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.john.datastorage.Storage;
import com.john.displaylibrary.DisplayActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view) {

        Intent intent = new Intent(this, DisplayActivity.class);
        Storage jokeSource = new Storage();
        String joke = jokeSource.getJoke();
        intent.putExtra(DisplayActivity.JOKE_KEY, joke);
        startActivity(intent);
    }
}
