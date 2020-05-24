package com.kedyson;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter array length..");
        int arrayLength = scanner.nextInt();

        int[] myIntegers = getIntegers(arrayLength);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is : " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] myValues = new int[number];
        for(int i = 0; i < myValues.length; i++){
            myValues[i] = scanner.nextInt();
        }
        return myValues;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
