package com.practice;

import java.util.Scanner;

public class Fib {
	
	
	
	 public static void main(String args[]) {
	        // prints out a statement
	        System.out.println("This program outputs the first N\nnumbers in the Fibonacci Sequence");
	        System.out.print("Enter N: ");
	        // declare and create a new scanner
	        Scanner keyboard = new Scanner(System.in);
	        // create the fiboNum variable and take in input from system
	        int fiboNum = keyboard.nextInt();

		/*
		 * while fiboNum is greater or equal to 1, other it prompts the user to
		 * enter to enter a higher number than 1
		 */
	while(fiboNum <=1){

	    System.out.println("Please enter a number higher than 1:");
	    fiboNum = keyboard.nextInt();
	        }
	        System.out.println("The first " + fiboNum + " numbers Fibonacci \nSequence are as follows: ");
	        System.out.print("0 1 ");
	        int firstNum = 0;
	        int secondNum = 1;
	        // for  int  = 1 and k less than fiboNum, then add +1 to k
	        for (int k = 1; k < fiboNum; k++) {

	            //add  together 2 variable to get higherNumber
	            int higherNumber = firstNum + secondNum;
	            // print out higherNumber and a space
	            System.out.print(higherNumber + " ");
	            firstNum = secondNum;
	            secondNum = higherNumber;
	        }
	        keyboard.close();
	    }

}
