package com.ThirtySix;

public class Examples {

	static void ex1() {

		Donkey ned = new Donkey();

		ned.passByValue(10, 10);

		Donkey ted = new Donkey();

		int num = 5;

		double dNum = 12.4;

		ted.passByValue(num, dNum);

		System.out.println("values of the num is: " + num + "and dnum is: " + dNum);

		// when you pass a primitive value to a method you are doing a thing
		// called pass by value

		// pass by Reference

	}

	static void ex2() {

		Donkey ned = new Donkey();

		Dog spot = new Dog();

		System.out.println("Name of the dog is : " + spot.name + "\nAge of dog is :" + spot.age);
		// we are calling a method that changes the name and age of the dogs

		ned.passByRefDog(spot);

		System.out.println(" age of the dog is :" + spot.age);
		spot.age = 3;
		spot.name = "kevin";
		System.out.println(" name of the dog is :" + spot.name);

		// passing in our dog spots to the second pass by reference method

		ned.PassByRef2(spot);
		
		
		
		// after we pass our dog
		
		System.out.println(spot.name + " and age is " + spot.age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
