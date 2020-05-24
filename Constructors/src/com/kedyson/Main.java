package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());

        System.out.println("");

        VipCustomer vipCustomer1 = new VipCustomer("Kelvin", 10.00, "kelvin@gmail.com");
        System.out.println("Name : " + vipCustomer1.getName());
        System.out.println("Credit Limit : " + vipCustomer1.getCreditLimit());
        System.out.println("Email : " + vipCustomer1.getEmailAddress());

        System.out.println("");

        VipCustomer vipCustomer2 = new VipCustomer("Kedyson", 20.00);
        System.out.println("Name = " + vipCustomer2.getName());
        System.out.println("Credit Limit = " + vipCustomer2.getCreditLimit());
        System.out.println("Email = " + vipCustomer2.getEmailAddress());
    }
}
