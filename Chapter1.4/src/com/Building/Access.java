package com.Building;

public class Access {

	static void getAnimal() {
		Animal fred = new Animal();

		fred.weight = 12;

		System.out.println(fred.name);
		System.out.println(fred.height);

		/*
		 * animal is in the same package so we can access the protected variable
		 * via an animal object
		 * 
		 * unlike in the dog class which is a derived class but not in the same
		 * package
		 */

		System.out.println(fred.weight);

		System.out.println(fred.test);

		System.out.println(fred.id);

		System.out.println(fred);

	}

}
