package com.kedyson;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Delux", "Sausage & Bagon", 14.53, "White");
        super.addHumbergerAditional1("Chips", 2.75);
        super.addHumbergerAditional2("Drink", 1.81);
    }

    @Override
    public void addHumbergerAditional1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHumbergerAditional2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHumbergerAditional3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHumbergerAditional4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
