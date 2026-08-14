package com.example.resqtrack;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlertsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WorkerAdapter adapter;
    ArrayList<Worker> dangerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        recyclerView = findViewById(R.id.alertRecyclerView);

        dangerList = new ArrayList<>();

        // 🔥 Filter danger workers (for now dummy logic)
        for(Worker w : DataHolder.workerList){
            // For now: assume Zone C = danger
            if(w.getWorkerZone().equalsIgnoreCase("Zone C")){
                dangerList.add(w);
            }
        }

        adapter = new WorkerAdapter(dangerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}