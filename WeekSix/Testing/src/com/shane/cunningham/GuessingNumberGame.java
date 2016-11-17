package com.shane.cunningham;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by shane on 15/11/2016.
 */
class GuessingNumberGame {


    static void guessing() {
        int tries = 7; // creates a variable to use for guess attempts
        System.out.println("Random number guessing game\nYou have " + tries + " attempts to guess the secret number");

        Scanner keyboard = new Scanner(System.in); // creates an ew scanner object to take data from keyboard
        Random rand = new Random(); // creates a new random

        int randNum = rand.nextInt(10) + 1; // set the variable to a new between 1 and 10
        //  System.out.println("random number is : " + randNum);  // test print out

        System.out.print("Enter number: ");


        int guess = keyboard.nextInt(); // take in data from the keyboard and set it to a variable

        System.out.println("your guess is " + guess);
        boolean test = false; // create boolean flag for the while loop


        while (!test) {  // while not false
            tries--; // decrease the tries variable by one each loop

            System.out.println("attempts left: " + tries);
            if (tries <= 0) {// if the tries is less or equal to o, then change the flag and exit the loop
                System.out.println("You lost, too many guesses\n" + "The secret number was: " + randNum);
                test = true;
            } else if (randNum < guess) { // if randnum is less than guess then do this

                System.out.println("your number is higher");
                System.out.println("Please try again: ");

                guess = keyboard.nextInt();
            } else if (randNum > guess) {// if randnum is  higher than guess then do this

                System.out.println("your number is lower");
                System.out.println("Please try again: ");
                guess = keyboard.nextInt();
            } else { // else do this , ie the right number was guessed

                System.out.println("Congratulations you won");
                test = true;
            }

        }

    }


}
