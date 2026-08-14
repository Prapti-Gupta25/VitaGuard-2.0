package com.example.resqtrack;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Workers_ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WorkerAdapter adapter;
    ArrayList<Worker> workerList;

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_list);

        Toast.makeText(this, "Worker's Screen opened", Toast.LENGTH_SHORT).show();
        recyclerView = findViewById(R.id.recyclerViewWorkers);

        workerList = DataHolder.workerList;

        if(workerList == null){
            workerList = new ArrayList<>();
        }
        adapter = new WorkerAdapter(workerList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    @SuppressLint("NotifyDataSetChanged")
    protected void onResume(){
        super.onResume();
        if(adapter!=null){
        adapter.notifyDataSetChanged();}
    }

}