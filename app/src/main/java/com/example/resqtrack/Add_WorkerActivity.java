package com.example.resqtrack;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Add_WorkerActivity extends AppCompatActivity {

    EditText workerName, workerZone;
    Button saveWorkerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_worker);

        workerName = findViewById(R.id.workerName);
        workerZone = findViewById(R.id.workerZone);
        saveWorkerBtn = findViewById(R.id.saveWorkerBtn);

        saveWorkerBtn.setOnClickListener(v -> {

            String name = workerName.getText().toString();
            String zone = workerZone.getText().toString();

            if(name.isEmpty() || zone.isEmpty()){
                Toast.makeText(this,"Enter all details",Toast.LENGTH_SHORT).show();
            } else {

                // 🔥 SAVE DATA
                DataHolder.workerList.add(new Worker(name, zone));

                Toast.makeText(this,"Worker Added",Toast.LENGTH_SHORT).show();

                finish();// go back
            }
        });
    }
}