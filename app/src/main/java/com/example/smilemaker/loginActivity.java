package com.example.smilemaker;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }
    public void signup (View view){
        Intent intent = new Intent(getBaseContext(),loginActivity.class);
        startActivity(intent);
    }
}

