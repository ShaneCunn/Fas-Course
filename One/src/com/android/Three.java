package com.android;

import java.util.Scanner;

class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;

		System.out.println("the age is less or greater than : " + (age > 18));

		Scanner keyboard = new Scanner(System.in);

		System.out.print("enter your age here:");

		age = keyboard.nextInt();
		if (age < 18) {

			System.out.println(" no entry fecker");

		} else {
			System.out.println("hope you enjoy the film.");

			// start of if statements
			System.out.println("enter name here : ");
			
			
			String name = "";
			Scanner input = new Scanner(System.in);

			name = input.next();

            switch (name) {
                case "mary":

                    System.out.println(name + " goes into the vip area");

                    break;
                case "pat":

                    System.out.println(name + " goes into the general area");

                    break;
                case "john":

                    System.out.println(name + " goes into the drunks areas.");
                    break;
                default:

                    System.out.println(name + " is barred from the club");

                    break;
            }

		}

	}

}
