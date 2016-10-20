package com.ThirtyThree;

public class Examples {

	static void Strings() {

		// string is an object, which is an actually an array of Char's (chars)

		Dog spot = new Dog();

		Dog fred = new Dog();

		System.out.println(spot.equals(fred));

		String str = "Hello";
		String str2 = "Hello";
		// this will print out true as it is equal
		System.out.println(str.equals(str2));

		String test3 = "        test out put string          ";

		System.out.println(test3);

		System.out.println("in uppercase" + test3.trim() + test3.toUpperCase());

	}

}
