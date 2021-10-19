package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signup (View view){
        Intent intent = new Intent(getBaseContext(),loginActivity.class);
        startActivity(intent);
    }

    public void signinid(View view){
        Intent intent1 = new Intent(getBaseContext(),homepage.class);
        startActivity(intent1);
    }

}