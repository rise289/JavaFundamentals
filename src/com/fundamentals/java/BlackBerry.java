package com.fundamentals.java;
/*
This class serves as a child class to AbstractCellPhone
 */

public class BlackBerry extends AbstractCellPhone{

    public BlackBerry(int vol, int[] nKeys, int sKey, String scr){
        super(vol, nKeys, sKey, scr);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    }

    @Override
        public void endCall(){
        System.out.println("Call has ended.");
    }
}
