package com.TwentyThree;

public class Swan {

	String name = "fred";
	Double weight = 3.4;
	Double height = 10.14324;
	int age = 10;

	Swan(int sAge, double sWeight, double sHeight, String sName) {

		name = sName;
		weight = sWeight;
		height = sHeight;
		age = sAge;

		System.out.println("\nswan constructor called");

	}

}
