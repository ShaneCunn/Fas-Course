package com.shane.cunningham.assignment2;



import java.util.Scanner;

/**
 * Created by shane on 20/11/2016.
 */
public class main2 {
    public static void main(String args []){

        //GuessingNumberGame.guessing();

        Scanner keyboard = new Scanner(System.in); // creates a new scanner object called keyboard to take input from the keyboard

        System.out.println("Enter size of star pattern, make sure it a odd number:");


        int size = keyboard.nextInt(); // take in a int from the keyboard

        if (size % 2 == 0) { // check to see if it is a even number

            System.out.println("you entered a even number \nPlease enter a odd number: ");
            size = keyboard.nextInt(); // reset the int size variable
        }
        Star.StarGenerator(size); // calls the Star generator  method and pass the size variable to it
    }
}
