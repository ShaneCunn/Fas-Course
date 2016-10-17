package com.android;

public class Sixteen {

	public static void main(String args[]) {

		System.out.println("test4");

		int numb = 7;

		int mod = numb % 2;

		System.out.println("the modulus for this number is : " + mod);

		int[] arrayTest = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		for (int b : arrayTest) {

			System.out.println("test loop: " + b);

		}

		for (int i = 0; i < arrayTest.length; i++) {

			int mod1 = arrayTest[i];
			if (mod1 % 2 == 0) {

				System.out.println(i + " this number is even");

			} else
				System.out.println(i + " this number is uneven");
		}

	}

}
