package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = '\u00A9'; //char has a width of 16
        System.out.println(myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //String is a sequence of characters
        String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", this is more";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("the sum is: = " +lastString);
    }
}
