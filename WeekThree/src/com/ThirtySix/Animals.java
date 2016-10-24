package com.ThirtySix;

public class Animals {

	int age = 10;
	String name = "timmy";

}

class Dog extends Animals {

}

class Cat extends Animals {

}

class Siamese extends Cat {

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
}
