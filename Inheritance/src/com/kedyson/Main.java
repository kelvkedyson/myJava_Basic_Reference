package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 1, 50);
//        System.out.println(animal.getName());

        Dog dog = new Dog("Pappie", 1, 40, 2, 1, 4, 20, "Long silky");
//        System.out.println(dog.getBody());
        dog.eat();
        dog.walk();
//        dog.run();

        Fish fish = new Fish("Tilapia", 1,1,2,2,6);
        fish.move(35);
    }
}
