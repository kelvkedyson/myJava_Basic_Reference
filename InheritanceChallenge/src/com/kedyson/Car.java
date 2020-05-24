package com.kedyson;

public class Car extends Vehicle{

    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int doors, int gears, int wheels, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }



    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Gear changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " at a direction of " + direction);
    }
}
