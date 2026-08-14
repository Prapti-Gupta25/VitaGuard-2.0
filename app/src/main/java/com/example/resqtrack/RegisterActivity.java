package com.example.resqtrack;

import static com.example.resqtrack.DataHolder.registeredPassword;

import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText name, emailReg, passwordReg;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        emailReg = findViewById(R.id.emailReg);
        passwordReg = findViewById(R.id.passwordReg);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(v -> {

            String lname = name.getText().toString();

            DataHolder.leaderName = lname;


            String email = emailReg.getText().toString();
            String password = passwordReg.getText().toString();

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Enter all details",Toast.LENGTH_SHORT).show();
            } else {

                // 🔥 SAVE USER DATA
                DataHolder.registeredEmail = email;
                registeredPassword = password;

                Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show();

                finish(); // go back to login
            }
        });

    }
}