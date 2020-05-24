package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        Car car2 = new Car();

        BankAccount bankAccount = new BankAccount();
//        System.out.println("Model : " + car.getModel());
        car.setModel("VANGUARD");
        System.out.println("Model : " + car.getModel());
        System.out.println("");

        bankAccount.setAccountNumber("22110039539");
        bankAccount.setBalance(250000.00);
        bankAccount.setCustomerName("Kelvin Kedyson");
        bankAccount.setEmail("kelvinkedysonzacharia@gmail.com");
        bankAccount.setPhoneNumber("0744345000");

        //calling the getters
        System.out.println("ACCOUNT DETAILS");
        System.out.println("Account Number : " + bankAccount.getAccountNumber());
        System.out.println("Phone Number : " +bankAccount.getPhoneNumber());
        System.out.println("Account Name : " + bankAccount.getCustomerName());
        System.out.println("Email : " + bankAccount.getEmail());
        System.out.println("Balance : " + bankAccount.getBalance());
        System.out.println(" ########### ");
        bankAccount.depositFund(50000);
        bankAccount.withdrawFund(300000);
    }
}
