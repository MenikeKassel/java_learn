package com.homework11;

public class Frock {

    private static int currentNum = 100000;
    int serialNumber;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {

        this.serialNumber = getNextNum();
    }
}
