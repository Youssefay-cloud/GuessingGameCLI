package com.youay.Functionality;

import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    // random private instance for the whole class
   private Random random ;
   

   public GuessingGame()
   {
        // intializing the instance
        random = new Random();
   }

   public void start(){
    Scanner input = new Scanner(System.in);
    //Getting the user input using the scanner
    String val = input.nextLine();
    // check for the input
    // if ex; easy it will get the easy method 
    switch (val) {
        case "easy":
            easy();
            break;
        case "medium":
            medium();
            break;
        case "hard":
            hard();
        default:
            System.out.println("wrong input one of these (easy,medium,hard)");
            break;
    }

    input.close();
   }

   private void easy(){
        int maxt = 0 ;
        Scanner sc = new Scanner(System.in);
        int randINT = random.nextInt(100);
        System.out.println("Great! You have selected the Easy difficulty level.");
        // the loop that will contuniue the game until the right answer here 10 trials.
        while(maxt < 10){
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            // check for the answers.
            if(randINT == random.nextInt()){
                System.out.println("Congratulation You are right");
                return ;
            }else{
                if(guess < randINT){
                    System.out.println("Incorrect! The number is greater than " + guess);
                }
                if(guess > randINT){
                    System.out.println("Incorrect! The number is less than " + guess);
                }
                if(guess == randINT){
                    System.out.println("You guessed the correct number in " + maxt + "Attempts.");
                    return;
                }
        
        }
            maxt++;
        }
        if(maxt == 10){
            System.out.println("You have no other chance");
            }
    }

   private void medium(){
        int maxt = 0 ;
        Scanner sc = new Scanner(System.in);
        int randINT = random.nextInt(100);
        System.out.println("Great! You have selected the Easy difficulty level.");
        while(maxt < 5){
            int guess = sc.nextInt();
            if(randINT == random.nextInt()){
                System.out.println("Congratulation You are right");
                return ;
            }else{
                if(guess < randINT){
                    System.out.println("Incorrect! The number is greater than " + guess);
                }if(guess > randINT){
                    System.out.println("Incorrect! The number is less than " + guess);
                }if(guess == randINT){
                    System.out.println("You guessed the correct number in " + maxt + "Attempts.");
                    return;
                }
            }
            maxt++;
            
        }
        if(maxt == 5){
            System.out.println("You have no other chance");
        }
        
   }

   private void hard(){
        int maxt = 0 ;
        Scanner sc = new Scanner(System.in);
        int randINT = random.nextInt(100);
        System.out.println("Great! You have selected the Easy difficulty level.");
        while(maxt < 3){
            int guess = sc.nextInt();
            if(randINT == random.nextInt()){
                System.out.println("Congratulation You are right");
                return ;
            }else{
                if(guess < randINT){
                    System.out.println("Incorrect! The number is greater than " + guess);
                }if(guess > randINT){
                    System.out.println("Incorrect! The number is less than " + guess);
                }if(guess == randINT){
                    System.out.println("You guessed the correct number in " + maxt + "Attempts.");
                    return;
                }
            }
            maxt++;
            
        }
        if(maxt == 3){
            System.out.println("You have no other chance");
        }
    }
}
