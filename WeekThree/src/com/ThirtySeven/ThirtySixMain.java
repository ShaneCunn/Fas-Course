package com.ThirtySeven;

public class ThirtySixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayNums = { 1, 2, 3, 4, 5, 6 };

		System.out.println("the numbers are : " + arrayNums[0]);
		System.out.println("the numbers are : " + arrayNums[1]);
		System.out.println("the numbers are : " + arrayNums[2]);
		System.out.println("the numbers are : " + arrayNums[3]);
		
		System.out.println("outside the array : ");
// this will generate a out of bound exception
		
		//a try block is a object , it 
		
		try {
			System.out.println("the numbers are : " + arrayNums[7]);
		} catch (Exception e) {
			
			System.out.println("\nNumber is outside the array \n");

			
			
		}
		for (int b : arrayNums) {

			System.out.println("the numbers are : " + b);
		}
	}

}
