package com.example.resqtrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorkerAdapter extends RecyclerView.Adapter<WorkerAdapter.ViewHolder> {

    List<Worker> workerList;

    public WorkerAdapter(List<Worker> workerList) {
        this.workerList = workerList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_worker,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@org.jspecify.annotations.NonNull ViewHolder holder, int position) {

        Worker worker = workerList.get(position);

        holder.name.setText(worker.getWorkerName());
        holder.zone.setText(worker.getWorkerZone());
    }

    @Override
    public int getItemCount() {
        return workerList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, zone;

        public ViewHolder(@org.jspecify.annotations.NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.workerNameText);
            zone = itemView.findViewById(R.id.workerZoneText);
        }
    }
}