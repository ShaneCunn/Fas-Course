package com.Android;

public class Trainee {

	int age = 34;
	String pps = "3426534k";

	/*
	 * this is a static variable , also called a class variable , the correct
	 * way to access this variable is too use a class name and then the variable
	 * name
	 * 
	 * a static variable is shared all members of the class, so every trainee
	 * will have the same course code so if you change the course code, it will
	 * change everywhere
	 */

	static int courseCode = 12;

	static int test = courseCode;
	static String courseaddress = "galway";

	static void statmethod() {

		/*
		 * you can't access instance variable , only static
		 * 
		 * 
		 * System.out.println("age is " + age + "pss num is: " + pps +
		 * "course code is:" + courseCode + "course addres is: " +
		 * courseaddress);
		 */

	}

	void ordMethod() {

		System.out.println("age is " + age + "pss num is: " + pps + "course code is:" + courseCode
				+ "course addres is: " + courseaddress);
	}

}
