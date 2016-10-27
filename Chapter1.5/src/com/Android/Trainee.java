package com.Android;

public class Trainee {

	int age;
	String pps;

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

	static void statmethod() {

	}
	
	void ordMethod(){
		
		
	}

}
