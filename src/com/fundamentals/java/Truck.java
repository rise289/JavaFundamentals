package com.fundamentals.java;

public class Truck {
    private String wheelType;
    private String windowType;
    private String bodyColor;
    private int boxbedSize;

    public Truck() {
        System.out.println("This is the default contstructor for the Truck class.");
    }

    // Overloaded constructor (Truck + moveDrive)
    public Truck(String wheelType){
        this("spinners","lightGrayTint","black", 48);
        System.out.println("The type of wheels are " + wheelType);
    }

    public Truck(int boxbedSize) {
        this("spinners", "lightGrayTint", "black", 48);
        System.out.println("The type of wheels are " + wheelType);
    }

    public Truck(String wheelType, String windowType, String bodyColor, int boxbedSize){
        this.wheelType = wheelType;
        this.windowType = windowType;
        this.boxbedSize = boxbedSize;
        this.bodyColor = bodyColor;
    }

    public void moveDrive(){
        System.out.println("Beep, beep, get out of my way");
    }

    public void setwheelType(String wheelType) {
            this.wheelType = wheelType;
    }

    public void setwindowType(String windowType) {
        this.windowType = windowType;
    }

    public void setbodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setboxbedSize(int boxbedSize) {
        this.wheelType = wheelType;
    }


    public String getwheelType(){
        return wheelType;
    }

    public String getwindowType(){
        return windowType;
    }

    public String getbodyColor(){
        return bodyColor;
    }

    public int getboxbedSize(){
        return boxbedSize;
    }









}
