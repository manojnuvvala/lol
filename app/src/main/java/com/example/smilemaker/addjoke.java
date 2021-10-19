package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addjoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userjoke);
    }
    public void cancelID(View view)
    {
        Intent intent = new Intent(getBaseContext(),homepage.class);
        startActivity(intent);
    }
}