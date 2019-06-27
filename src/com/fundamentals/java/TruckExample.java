package com.fundamentals.java;

public class TruckExample {
    public TruckExample(String wheels, String window, String boxBed, String color) {
        this.wheels = wheels;
        this.window = window;
        this.boxBed = boxBed;
        this.color = color;
    }

    public TruckExample () {
        System.out.println("Default Truck constructor");
    }

    private String wheels;
    private String window;
    private String boxBed;
    private String color;

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getBoxBed() {
        return boxBed;
    }

    public void setBoxBed(String boxBed) {
        this.boxBed = boxBed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void driving(){
        System.out.println("Beep, beep get out of the way");
    }

}
