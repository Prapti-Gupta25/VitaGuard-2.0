package com.example.resqtrack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button loginBtn;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);
        registerLink = findViewById(R.id.registerLink);

        loginBtn.setOnClickListener(v -> {

            String userEmail = email.getText().toString();
            String userPassword = password.getText().toString();

            if(userEmail.isEmpty() || userPassword.isEmpty()){
                Toast.makeText(this,"Please enter email and password",Toast.LENGTH_SHORT).show();
            }

            // 🔥 CHECK REGISTERED USER
            else if(userEmail.equals(DataHolder.registeredEmail) &&
                    userPassword.equals(DataHolder.registeredPassword)){

                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
            }

            else{
                Toast.makeText(this,"Email not registered. Please create account first.",Toast.LENGTH_LONG).show();
            }
        });

        registerLink.setOnClickListener(v -> {

            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);

        });

    }
}