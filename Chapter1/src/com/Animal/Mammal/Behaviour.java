package com.Animal.Mammal;

public interface Behaviour {

	void happy();

	/*
	 * you can set the default implementation for a method in java8 in an
	 * interface this means that a a class impletemeting this interface does not
	 * have to override the angry() method
	 */
	void sad();

	/*
	 * default in a interface , allow to give a a default implementation to a
	 * method
	 * 
	 */

	default void angry() {

		System.out.println("angry called");
	}

	static void statTest() {

		System.out.println("statTest called");

	}

}

interface mood {

}

interface interfaceTest3 {

}

class House {

}

class Building {

}
