package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// an integer has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " +myTotal);

    //a byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte myNewByteValue = (byte) (myByteMinValue/2); //this is called type casting
        System.out.println("myNewByteValue = " +myNewByteValue);

    //short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        short myNewShortValue = (short) (myShortMinValue/2);
        System.out.println("myNewShortValue = " +myNewShortValue);

    //long has a width of 64
        long myLongValue = 100L;
    }
}
