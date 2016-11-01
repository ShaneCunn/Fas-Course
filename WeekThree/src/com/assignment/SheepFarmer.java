package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class SheepFarmer extends Farmer {
	int totalWeight = 0;
	Scanner keyboard = new Scanner(System.in);

	int numberofsheep() {

		System.out.println("enter the price for lamp: ");

		double lampPrice = keyboard.nextDouble();
		System.out.println("enter the number of sheeps:");

		int numberofFarmers = keyboard.nextInt();

		System.out.println("enter the number of rams:");

		int rams = keyboard.nextInt();
		if (rams < 2) {
			System.out.print("please  re-enter the amount of rams , it must be greater than 2\n2");

		} else {

			/*
			 * do {
			 * System.out.print("enter the amount of rams , greate than 2!!!");
			 * rams = keyboard.nextInt();
			 * 
			 * System.out.print("\n"); } while (rams < 2);
			 */

			for (int i = 0; i < numberofFarmers; i++) {
				int sheepWeight = (int) (Math.random() * 200), sheepID = (int) (Math.random() * 10000);

				System.out.println("the sheep id is: " + sheepID + ", the sheep weight in KG is: " + sheepWeight);

				ArrayList<Integer> total = new ArrayList<Integer>();

				total.add(sheepWeight);

				for (int d : total)

					totalWeight += d;

			}

			System.out.println("The total weight of the herd is: " + totalWeight);

			System.out.println("The total value of the herd is €" + (totalWeight * lampPrice));

			System.out.println("the total rams are : " + rams);

		}
		return numberofFarmers;

	}

}
