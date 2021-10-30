package com.example.smilemaker;


import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    TextView createusername;
    TextView regpassword;
    TextView reggender;
    TextView regemail;
    TextView textView14;
    EditText ET1;
    EditText ET2;
    EditText editTextTextEmailAddress;
    Button register;
    Button button6;
    RadioGroup radio;
    RadioButton radioButtonfemale;
    RadioButton radioButtonmale;

    usermodal um = usermodal.getSingleton();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        createusername =findViewById(R.id.createusername);
        regpassword = findViewById(R.id.regpassword);
        reggender = findViewById(R.id.reggender);
        regemail = findViewById(R.id.regemail);
        textView14 = findViewById(R.id.textView14);
        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        register = findViewById(R.id.register);
        button6 = findViewById(R.id.button6);
        radio = findViewById(R.id.radio);
        radioButtonfemale = findViewById(R.id.radioButtonfemale);
        radioButtonmale = findViewById(R.id.radioButtonmale);

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
        String userName = ET1.getText().toString();
        String password = ET2.getText().toString();

        int selectedId = radio.getCheckedRadioButtonId();

        RadioButton selected = (RadioButton) findViewById(selectedId);

        String gender = selected.getText().toString();

        String email = editTextTextEmailAddress.getText().toString();

        um.allUsers.add(new usermodal.user(userName, password, email, gender));

        Intent intent2 = new Intent(getBaseContext(),homepage.class);
        startActivity(intent2);
    }

}

