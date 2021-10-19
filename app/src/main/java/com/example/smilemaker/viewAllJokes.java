package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viewAllJokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewalljokes);
    }

    public void homepage(View view) {
        Intent intent1 = new Intent(getBaseContext(),homepage.class);
        startActivity(intent1);
    }
}