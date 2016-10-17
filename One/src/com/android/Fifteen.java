package com.android;

public class Fifteen {
	public static void main(String args[]) {

		System.out.println("test1");

		int[] arrayTest = { 22, 33, 44, 55, 66, 77 };

		for (int i = 0; i < arrayTest.length; i++) {

			System.out.println("the numbers are : " + arrayTest[i]);

		}
		// enhanced for loop is for arraylist and arrays

		for (int b : arrayTest) {
			System.out.println("enhanced for loop test: " + b);
		}

		// create an array of size 7 and doubles

		double[] arrayDoubles = { 11.2, 22.444, 33.555, 44.6666664, 55.67445, 66.8768, 77.6536536 };
		// easier to use enhanced for loop
		for (double j : arrayDoubles) {

			System.out.println("the doubles are : " + j + ",");

		}
		
		
		
		
		

	}
}
