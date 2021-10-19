package com.example.smilemaker;


import androidx.activity.result.contract.ActivityResultContracts;
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
    public void back(View view){
        Intent intent1 = new Intent(getBaseContext(),MainActivity.class);
        startActivity(intent1);
    }
    public void registred(View view){
        Intent intent2 = new Intent(getBaseContext(),homepage.class);
        startActivity(intent2);
    }

}

