package com.fundamentals.java;

public class SUV extends TruckExample {

    private String removableSeat;

    public SUV(){
        System.out.println("Default SUV constructor");
    }

    public SUV(String removableSeat) {
        this.removableSeat = removableSeat;
    }

    public void rearBackupBeeper() {
        System.out.println("beeps when backing up");
    }
    public void rearBackupBeeper(String message){
        System.out.println(message);
    }

    //Getters and Setters
    public String getRemovableSeat() {
        return removableSeat;
    }

    public void setRemovableSeat(String removableSeat) {
        this.removableSeat = removableSeat;
    }

    @Override
    public void driving(){
        System.out.println("Please drive friendly");
    }
}

