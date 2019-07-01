package com.fundamentals.java;
/*
This is our first class that we created ourselves.
*/


public class House implements MyFirstInterface {

    private String roofType;
    private int windowSize;
    private String foundation;
    private String doorColor;

    public House() {
        System.out.println("This is the default constructor");
    }
    // Overloaded constructor (House + doorOpenClose
    public House(String doorColor) {
        this(doorColor,24,"concrete","shingle");
        System.out.println("The Door Color is " + doorColor);
    }

    public House(String doorColor, int windowSize, String foundation, String roofType){
        this.setDoorColor(doorColor);
        this.setWindowSize(windowSize);
        this.setFoundation(foundation);
        this.roofType = roofType;
    }

    public void setRooftype(String roofType) {
        this.roofType = roofType;
    }

    public String getRooftype() {
        return roofType;
    }

    //Our first method (function)
    public void doorOpenClose(){
        System.out.println("Open my door");
    }

    public void doorOpenClose(String message){
        System.out.println(message);
    }



    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    @Override
    public void endCall(){

    }
}
