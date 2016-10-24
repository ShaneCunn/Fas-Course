package com.ThirtySix;

public class Animals {

	int age = 10;
	String name = "timmy";

	void run() {

		System.out.println("animal running");
	}

}

class Dog extends Animals {

	void run() {

		System.out.println("dog running");
	}

}

class Cat extends Animals {
	void run() {

		System.out.println("cat running");
	}

}

class Siamese extends Cat {

	void run() {

		System.out.println("Siamese running");
	}

}

class Donkey {

	void passByValue(int num, double dNum) {
		num *= 100;

		dNum += 100;
		System.out.println(" the new  values num are : " + num + " and Dnum is: " + dNum);
	}

	void passByRefDog(Dog spot) {

		spot.age = spot.age + 10;

		spot.name = "lassie";

		System.out.println("New age of: " + spot.age + "\nnew name is: " + spot.name);

	}

	void PassByRef2(Dog spot) {

		spot = new Dog();

		spot.age = 91001201;
		spot.name = "bob";
		System.out.println("inside method name is " + spot.age + "\nnew name is: " + spot.name);

	}

	/*
	 * this can take any animal when you you have a superclass para, you can
	 * pass in any subclass for example here we have a animal, so we can pass in
	 * a dog, cat, siamese, then the run method will be called for either , a
	 * dog, cat, and siamese depending on animal was sent to this method	 * 
	 * *
	 */

	void PassSubClass(Animals andy) {

		andy.run();// polymorphic

	}

}
