package com.ThirtySix;

public class Examples {
	
	
	static void ex3(){
		Animals andy = new Animals();
		
		Dog spot = new Dog();
		
		Cat tibbles = new Cat();
		
		Siamese sally = new Siamese();
		
		/*
		 * when passing an object to a method, you can also pass in a subclass
		 * of the object for example, any method that takes an animal
		 * can also 
		 * 
		 */
		
		
		Donkey ned = new Donkey();
		ned.PassSubClass(andy);
		
		
		
		
		
		
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
		// we can change the instance variable of an object ie weight, name and
		// age, but not not what the actual dog refers to

		System.out.println(spot.name + " and age is " + spot.age);

	}

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

}
