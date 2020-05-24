package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5; //width of integer is 32
        float myFloatValue = 5f; //width of float is 32
        double myDoubleValue = 5d; //width of double is 64

        System.out.println("myIntValue = " +myIntValue);
        System.out.println("myFloatValue = " +myFloatValue);
        System.out.println("myIntValue = " +myDoubleValue);

        double numberOfPounds = 200d;
        double numberOfKilograms = (numberOfPounds * 0.45359237d);
        System.out.println(numberOfPounds+"  pounds equals to " +numberOfKilograms+" kilograms");
        double pi = 3.144_323_43d;
        System.out.println(pi);
    }
}
