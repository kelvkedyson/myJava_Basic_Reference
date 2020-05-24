package com.kedyson;

class Car{
    private String name;
    private int numberOfCylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int numberOfCylinders) {
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car--> startEngine()";
    }

    public String accelerate(){
        return "Car--> accelerate()";
    }

    public String brake(){
        return "Car--> brake()";
    }
    public String getName() {
        return name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi--> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi--> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi--> brake()";
    }
}

class Murano extends Car{
    public Murano(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Murano--> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Murano--> accelerate()";
    }

    @Override
    public String brake() {
        return "Murano--> brake()";
    }
}

class Holden extends Car{
    public Holden(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " --> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " --> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Hilux", 8);

        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println("");

        Mitsubishi mitsubishi = new Mitsubishi("Wish",6);

        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.startEngine());
        System.out.println("");

        Murano murano = new Murano("Passo",4);

        System.out.println(murano.accelerate());
        System.out.println(murano.brake());
        System.out.println(murano.startEngine());
        System.out.println("");

        Holden holden = new Holden("Land Cruiser",12);

        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden.startEngine());
    }
}
