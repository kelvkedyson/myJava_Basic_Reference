package com.kedyson;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscle(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        System.out.println("THe fish moves by swimming at a speed of : " + speed);
        moveMuscle();
        moveBackFin();
//        super.move(speed);
    }

    @Override
    public void move(int speed) {
        swim(speed);
//        super.move(speed);
    }
}
