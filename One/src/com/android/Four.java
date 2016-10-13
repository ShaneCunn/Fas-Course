package com.android;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String loc, Sex;
		// boolean sex = false;

		boolean runTest = false;

		double[] value = { 500, 1000, 2000, 750, 1250, 3000 };

		double[] valueBelow25 = { 900, 1500, 2500, 1750, 2250, 4000 };

		while (!runTest) {

			System.out.println("################################\nSimple policy Calculator\n");

			Scanner input = new Scanner(System.in);
			System.out.println("enter  male or female here : ");
			Sex = input.next();

			System.out.println("enter location here : ");
			loc = input.next();
			System.out.println("enter age here : ");

			int age = input.nextInt();

			if (age >= 25) {
				if (Sex.equals("female")) {
					if (loc.equals("galway")) {

						System.out.println("policy = " + value[1]);

					} else if (loc.equals("dublin")) {

						System.out.println("policy = " + value[2]);

					} else {
						System.out.println("policy = " + value[3]);

					}
				} else if (Sex.equals("male")) {

					if (loc.equals("galway")) {

						System.out.println("policy = " + value[4]);

					} else if (loc.equals("dublin")) {

						System.out.println("policy = " + value[5]);

					} else {
						System.out.println("policy = " + value[6]);

					}
				} else if (age < 25) {

					if (Sex.equals("female")) {
						if (loc.equals("galway")) {

							System.out.println("policy = " + valueBelow25[1]);

						} else if (loc.equals("dublin")) {

							System.out.println("policy = " + valueBelow25[2]);

						} else {
							System.out.println("policy = " + valueBelow25[3]);

						}
					} else if (Sex.equals("male")) {

						if (loc.equals("galway")) {

							System.out.println("policy = " + valueBelow25[4]);

						} else if (loc.equals("dublin")) {

							System.out.println("policy = " + valueBelow25[5]);

						} else {
							System.out.println("policy = " + valueBelow25[6]);

						}

					}
				}

			}

		}
	}
}
