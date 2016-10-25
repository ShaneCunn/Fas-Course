package com.Android;

//import com.Building.*;

public class Main {

	/*
	 * there are 4 types of access modifiers Private = most restrictive and
	 * available only to the class
	 * 
	 * default, package level access only, no keyword
	 * 
	 * 
	 * protected , package plus available to derived classes only
	 * 
	 * public, available everywhere
	 * 
	 */

	public static void main(String args[]) {

		// this is exam objective 6.4
		System.out.println(" this is exam objective 6.4");

		// Animal fred = new Animal();

		// System.out.println(fred.name);// you can only the name

		System.out.println(com.Building.Animal.name);

		/*
		 * a derived class in a separate package can't access protected members
		 * if its base class using reference variables;
		 * 
		 * 
		 * in this cases an animal variable  
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
