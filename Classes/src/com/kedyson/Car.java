package com.kedyson;

// the keyword public is an access modifier which in unrestricted, any other class can use the public class even outside the package
// the keyword private means that no other classes can access that class
// the keyword protected means that only classes within the same package can access a respective protected class
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("vanguard") || validModel.equals("harrier")){
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
