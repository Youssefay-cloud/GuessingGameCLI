package com.youay;
import com.youay.Functionality.GuessingGame;
public class App 
{
    public static void main( String[] args )
    {
        GuessingGame gs = new GuessingGame();
       greetings();
       gs.start();

    }

    // The Greetings and rule of the play
    public static void greetings(){
         System.out.println( "Welcome to the Number Guessing Game!\r\n" + //
                        "I'm thinking of a number between 1 and 100.\r\n" + //
                        "You have 5 chances to guess the correct number.\r\n" + //
                        "" );

        
        System.out.println("Please select the difficulty level:\r\n" + //
                        "1. Easy (10 chances)\r\n" + //
                        "2. Medium (5 chances)\r\n" + //
                        "3. Hard (3 chances)\r\n" + //
                        "");
    }
    
}
