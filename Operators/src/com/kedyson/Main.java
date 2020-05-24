package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int result = 1 + 2;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;
        result = result-1;
        System.out.println("result = "+result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("This is not an Alien");
        }

        int topScore = 10;
        if(topScore == 100){
            System.out.println("You have scored the highest score ever");
        }
        else if(topScore < 100){
            System.out.println("Oops! You have not reached the highest score");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true:false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        double a = 20d, b = 80d;
        double _result = (a + b) * 25d;
        double remainder = result % 40;

        if(remainder <= 20){
            System.out.println("Total was over Limit");
        }

    }
}
