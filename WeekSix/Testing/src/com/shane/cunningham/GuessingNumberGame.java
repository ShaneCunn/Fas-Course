package com.shane.cunningham;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by shane on 15/11/2016.
 */
public class GuessingNumberGame {


    public static void guessing() {

        System.out.println("Random number guessing game ");

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(10) + 1;
        System.out.println("random number is : " + randNum);

        System.out.println("enter number ");


        int guess = keyboard.nextInt();
        System.out.println("random number is : " + randNum);
        System.out.println("your guess is " + guess);
        boolean test = false;
        while (!test) {
            if (randNum > guess) {
                System.out.println("your number is lower");
                System.out.println("Please try again: ");
                guess = keyboard.nextInt();
            } else if (randNum < guess) {

                System.out.println("your number is higher");
                System.out.println("Please try again: ");

                guess = keyboard.nextInt();
            } else {

                System.out.println("you won");
                test = true;
    }
        }
    }


    int add;
    public int add(int add){

        this.add = add;

        return add;
    }
}
