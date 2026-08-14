package com.example.resqtrack;

public class Worker {

    String Name,Zone;

    public Worker(String Name,String Zone){
        this.Name=Name;
        this.Zone=Zone;
    }
    public String getWorkerName(){
        return Name;
    }

    public String getWorkerZone(){
        return Zone;
    }

}