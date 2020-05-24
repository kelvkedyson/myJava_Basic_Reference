package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, (double) i)));
        }
        System.out.println();
        System.out.println("Here comes another for loop");
        for(int a = 8; a >= 2; a--){
            System.out.println("10,000 at " + a + "% interest = " + String.format("%.2f",calculateInterest(10000, (double) a)));
        }

        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a Prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
