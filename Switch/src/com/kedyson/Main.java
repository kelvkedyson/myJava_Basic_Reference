package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here

    int switchValue = 4;
    switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Value was not 1 or 2");
            break;
    }

    String month = "JANUARY";
    switch(month.toLowerCase()){
        case "january":
            System.out.println("This is January");
            break;
        default:
            System.out.println("It is not January");
            break;
    }
    }
}
