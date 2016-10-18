package com.Fas2;

public class Person2 {

	// instance variables
	int age;
	String name;
	double weight, height;

	void printMe() {

		System.out.println("your name is : " + name + "\nyour age is: " + age + "\nyour weight is:" + weight
				+ "\nyour height is: " + height);
	}

	void printAll(int[] myArray) {

		for (int b : myArray) {

			System.out.println(b);
		}

		int sum = 0;
		for (int c : myArray) {

			sum += c;
		}

		System.out.println("the sum is : " + sum);

		int sum2 = 0;
		for (int i = 0; i < myArray.length; i++) {

			sum2 += myArray[i];
		}

		System.out.println("normal forloop addition :" + sum2);
	}

}
