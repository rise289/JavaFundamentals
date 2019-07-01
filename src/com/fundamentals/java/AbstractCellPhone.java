package com.fundamentals.java;

/*
This class demonstrates an Abstract Class.
Focuses on objects and variable.
 */

public abstract class AbstractCellPhone implements MyFirstInterface {
    private int volume;
    private int[]numberKeys;
    private int sendKey;
    private String screen;

    public AbstractCellPhone(int vol, int[] nKeys, int sKey, String scr){
        this.volume = vol;
        this.numberKeys = nKeys;
        this.sendKey = sKey;
        this.screen = scr;
    }// end Constructor



    public abstract void receiveCall();

    public abstract void sendCall();

    public abstract void endCall();



    public int getVolume() {
        return volume;
    }

    public int[] getNumberkeys() {
        return numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;

    }

    public int[] getNumberKeys() {
        return numberKeys;
    }
}// end class
