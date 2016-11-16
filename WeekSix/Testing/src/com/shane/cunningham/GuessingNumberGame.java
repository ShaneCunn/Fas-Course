package com.shane.cunningham;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by shane on 15/11/2016.
 */
class GuessingNumberGame {


    static void guessing() {
        int tries = 7;
        System.out.println("Random number guessing game\nYou have " + tries + " attempts to guess the secret number");

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(10) + 1;
        System.out.println("random number is : " + randNum);

        System.out.println("enter number ");


        int guess = keyboard.nextInt();
        System.out.println("random number is : " + randNum);
        System.out.println("your guess is " + guess);
        boolean test = false;


        while (!(test)) {
            tries--;

            System.out.println("attempts left: " + tries);
            if (tries <= 0) {
                System.out.println("You lost, too many guesses\n" + "The secret number was: " + randNum);
                test = true;
            } else if (randNum < guess) {

                System.out.println("your number is higher");
                System.out.println("Please try again: ");

                guess = keyboard.nextInt();
            } else if (randNum > guess) {
                System.out.println("your number is lower");
                System.out.println("Please try again: ");
                guess = keyboard.nextInt();
            } else {

                System.out.println("Congratulations you won");
                test = true;
            }

        }

    }


}
