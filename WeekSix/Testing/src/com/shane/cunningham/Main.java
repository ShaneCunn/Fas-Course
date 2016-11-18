package com.shane.cunningham;

import java.util.Scanner;

/**
 * Created by shane on 15/11/2016.
 */
public class Main {

    public static void main (String args []){


        //GuessingNumberGame.guessing();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter size of star pattern, make sure it a odd number:");


        int size = keyboard.nextInt();

        if (size % 2 == 0) {

            System.out.println("you entered a even number \nPlease enter a odd number: ");
            size = keyboard.nextInt();
        }
        Star.starTest(size);

    }
}
