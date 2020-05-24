package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highSscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your finalscore was: " +highSscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highSscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your finalscore was now: " +highSscore);

       int highScorePosition = calculateHighScorePosition(1000);
       displayHighScorePosition("Kelvin", highScorePosition);

       highScorePosition = calculateHighScorePosition(900);
       displayHighScorePosition("Kedyson", highScorePosition);

       highScorePosition = calculateHighScorePosition(400);
       displayHighScorePosition("Faith", highScorePosition);

       highScorePosition = calculateHighScorePosition(50);
       displayHighScorePosition("Zacharia", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println("Dear "+playerName+ " , you have managed to get into position " +playerPosition);
    }
    public static int calculateHighScorePosition(int playerScore){
       if (playerScore >= 1000){
           return 1;
       }else if(playerScore >= 500 && playerScore < 1000){
           return 2;
       }else if(playerScore >= 100 && playerScore < 500){
           return 3;
       }
       else{
           return 4;
       }
    }
}
