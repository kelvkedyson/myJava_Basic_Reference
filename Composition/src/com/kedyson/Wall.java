package com.kedyson;

public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection(){
        System.out.println(this.direction);
        return this.direction;
    }
}
