package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }
    public void log (View view){
        Intent intent = new Intent(getBaseContext(),MainActivity.class);
        startActivity(intent);
    }

    public void addingjoke(View view) {
        Intent intent1 = new Intent(getBaseContext(),addjoke.class);
        startActivity(intent1);
    }

    public void morejokes(View view) {
        Intent intent2 = new Intent(getBaseContext(),viewAllJokes.class);
        startActivity(intent2);
    }
}