package com.practice;

import java.util.Scanner;

public class EnumExample {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(
				System.in);/*
							 * creates a new scanner object to take in values
							 * from system in ie keyboard input
							 */
		System.out.println("**********Simple Enum Calculator**********\n");

		System.out.println("Please input the first number:");

		double firstNum = keyboard.nextDouble(); // listens for the next double
		System.out.println("Please input the Second number:");
		double SecondNum = keyboard.nextDouble();

		System.out.println("Selected operators, select:\nPLUS  to add\nDIVIDE to divide\nMULTI to multi\n"
				+ "MINUS to subtract\n0 to close calculator");

		try

		{
			/*
			 * operations take in the value from the scanner in, it then
			 * transform it to UPPERCASE, it then passes the 2 variables to
			 * Switch method , it thens does a calculation and returns the
			 * result
			 */

			System.out.println(
					"The Result is: " + Operations.valueOf(keyboard.next().toUpperCase()).Cal(firstNum, SecondNum));

		}

		catch (IllegalArgumentException m)

		{
			System.out.println("  Error: " + m);

		}

		keyboard.close(); // closes thes keyboards object ie scanner(system.in)

	}

	public enum Operations {

		PLUS, DIVIDE, MINUS, MULTI; // creates 4 enum objects

		double Cal(double firstNum, double SecondNum) { // takes in 2 variable
														// and send them to the
														// switch statement
			switch (this) {
			case PLUS:
				return firstNum + SecondNum;

			case DIVIDE:
				return firstNum / SecondNum;
			case MINUS:
				return firstNum - SecondNum;
			case MULTI:
				return firstNum * SecondNum;
			default:

				throw new AssertionError("unknown case number" + this);
				/*
				 * throws an error if you do a spelling mistake
				 */

			}
		}
	}
}
