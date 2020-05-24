package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.5, "White");
        double price; // = hamburger.itemizeHamburger();
        hamburger.addHumbergerAditional1("Tomato", 0.27);
        hamburger.addHumbergerAditional2("Lettuce", 0.75);
        hamburger.addHumbergerAditional3("Tomato", 0.25);
        hamburger.addHumbergerAditional4("Chees", 1.12);
//        price = hamburger.itemizeHamburger();
        System.out.println("Total Burger Price is : " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bagon", 5.67);
        healthyBurger.addHumbergerAditional1("Egg", 5.43);
//        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthyAdditional1("Lentils", 3.41);
        System.out.println("Total Burger Price is : " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
