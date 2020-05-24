package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Kedyson";
//        player.health = 21;
//        player.weapon = "Sword";
//
//        System.out.println(player.healthRemaining());
//        player.loseHealth(15);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Kelvin", 50, "Sword");
        System.out.println("Initial Health is: " + enhancedPlayer.getHealth());
    }
}
