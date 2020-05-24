package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while(count != 5){
            System.out.println("Loop "+count);
            count++;
        }

        // or we can write as follows
        int instances = 1;
        while (true){
            if(instances == 6){
                break;
            }
            System.out.println("Loop = " +instances);
            instances++;
        }

        //Below is the do..while loop which execute at least once depending on the specified instructions
        int b = 1;
        do{
            System.out.println("Loop : " +b);
            b++;
        }while(b != 6);

        //printing even number using for loop
        for(int number = 0; number < 15; number++){
            if(isEvenNumber(number)){
                System.out.println(number + " is an Even number");
            }else{
                System.out.println(number + " is not an Even number");
            }
        }

        //printing even number using while loop
        int num = 0;
        int finishNum = 15;
        int evenNumberFound = 0;
        while(num <= finishNum){
            if(!isEvenNumber(num)){
                num++;
                continue;
            }
            evenNumberFound++;
            System.out.println("Even number " +num);
            num++;
        }
        System.out.println(evenNumberFound + " Even Numbers were found");
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
