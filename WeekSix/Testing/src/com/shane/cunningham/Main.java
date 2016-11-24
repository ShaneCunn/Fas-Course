package com.shane.cunningham;

import java.util.Scanner;

/**
 * Created by shane on 15/11/2016.
 */
public class Main {

    public static void main (String args []){

        Scanner keyboard = new Scanner(System.in); // creates a new scanner object called keyboard to take input from the keyboard

        System.out.println("Enter size of star pattern, please make sure it a odd number:");

        int size = keyboard.nextInt(); // take in a int from the keyboard

        if (size % 2 == 0) { // check to see if it is a even number

            System.out.println("You entered a even number \nPlease enter a odd number: ");
            size = keyboard.nextInt(); // reset the int size variable
        }
        Star.StarGenerator(size); // calls the Star generator method and pass the size variable to it

    }
}
