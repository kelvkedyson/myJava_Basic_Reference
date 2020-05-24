package com.kedyson;

import java.util.*;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    private static int[] getIntegers(int number){
        int[] integers = new int[number];
        System.out.println("Enter " + number + ", integers values");
        for(int i = 0; i < integers.length; i++){
            integers[i] = scanner.nextInt();

        }
        return integers;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " , value : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[]array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
