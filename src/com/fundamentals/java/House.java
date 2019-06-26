package com.fundamentals.java;
/*
This is our first class that we created ourselves.
*/
public class House {

    private String roofType;
    private int windowSize;
    private String foundation;
    private String doorColor;

    public House() {
        System.out.println("This is the default contstructor");
    }
    // Overloaded constructor (House + doorOpenClose
    public House(String doorColor) {
        this(doorColor,24,"concrete","shingle");
        System.out.println("The Door Color is " + doorColor);
    }

    public House(String doorColor, int windowSize, String foundation, String roofType){
        this.doorColor = doorColor;
        this.windowSize = windowSize;
        this.foundation = foundation;
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



}
