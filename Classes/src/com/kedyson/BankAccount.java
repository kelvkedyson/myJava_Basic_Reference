package com.kedyson;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
// constructor can be used to initialize instance variables as how setter methods does
//    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

    //setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //additional methods to deposit and withdraw funds
    public void depositFund(double depositAmount){
        this.balance += depositAmount;
        System.out.println("New Balance : " + String.format("%.2f",this.balance));
    }
    public void withdrawFund(double withdrawAmount){
       if(withdrawAmount >= this.balance){
           System.out.println("Insufficient Fund");
       }
       else{
           this.balance -= withdrawAmount;
           System.out.println("Amount Withdrawn : " + withdrawAmount);
           System.out.println("Balance : " + String.format("%.2f",this.balance));
       }
    }
}

