package com.android;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Seventeen {

	public static void main(String args[]) {

		System.out.println("test5");

		int num = 568756;

		int num2 = 10003324;

		if (num > num2) {

			System.out.println(num + " is bigger than " + num2);
		} else {

			System.out.println(num2 + " is bigger than " + num);

		}

		// ternary operators
		// create a variable caller bigger
		// which is going to be the bigger of the two numbers

		int bigger = num > num2 ? num : num2;

		System.out.println(" this number is bigger " + bigger);

		int age = 16;

		String adm;

		adm = age > 18 ? "addmitted" : "not addmitted";

		System.out.println(adm);

		boolean sex = false;

		double price;

		price = sex == true ? 10.00 : 15.50;
		
		System.out.println("the price is:" + price);

	}

}
