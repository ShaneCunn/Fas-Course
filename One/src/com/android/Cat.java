package com.android;

public class Cat {

	String breed, name;

	int age;

	double weight;

	double bmi(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println("the bmi is: ");

		return sum;
	}

	double divide(double first, double second) {
		System.out.println("division called");
		return first / second;
	}

	// no return type is declared void

	void cal(int num, int num2) {

		int total = num + num2 * num;

		System.out.println("the total in cal is: " + total);

	}

}
