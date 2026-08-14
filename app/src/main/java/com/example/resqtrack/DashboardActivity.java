package com.example.resqtrack;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button addWorkerBtn, viewWorkersBtn, alertsBtn;
    TextView leaderNameText,totalWorkersText,safeCountText,dangerCountText; // ✅ declare properly

    @SuppressLint({"MissingInflatedId", "SetTextI18n", "NewApi"})
    @Override
    protected void onResume(){
        super.onResume();
        updateStats();
    }

    @SuppressLint("SetTextI18n")
    private void updateStats() {
        int total = DataHolder.workerList.size();
        int safe = 0;
        int danger = 0;

        for(Worker w : DataHolder.workerList){
            if(w.getWorkerZone().equalsIgnoreCase("Zone C")){
                danger++;
            } else {
                safe++;
            }
        }

        totalWorkersText.setText("Total Workers: " + total);
        safeCountText.setText("Safe: " + safe);
        dangerCountText.setText("Danger: " + danger);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        addWorkerBtn = findViewById(R.id.addWorkerBtn);
        viewWorkersBtn = findViewById(R.id.viewWorkersBtn);
        alertsBtn=findViewById(R.id.alertsBtn);
        leaderNameText = findViewById(R.id.leaderNameText);
        totalWorkersText = findViewById(R.id.totalWorkersText);
        safeCountText = findViewById(R.id.safeCountText);
        dangerCountText = findViewById(R.id.dangerCountText);// ✅ correct id


        if(DataHolder.leaderName.isEmpty()){
            leaderNameText.setText("Leader: Unknown");
        } else {
            leaderNameText.setText("Leader: " + DataHolder.leaderName);
        }

        // Go to Add Worker Screen
        addWorkerBtn.setOnClickListener(v -> startActivity(new Intent(this, Add_WorkerActivity.class)));

        // Go to Worker List Screen
        viewWorkersBtn.setOnClickListener(v -> startActivity(new Intent(this, Workers_ListActivity.class)));

        alertsBtn.setOnClickListener(v -> startActivity(new Intent(this,AlertsActivity.class)));
    }
};