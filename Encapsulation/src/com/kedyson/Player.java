package com.kedyson;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health-= damage;
        if(this.health <= 10){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining to the respective player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
