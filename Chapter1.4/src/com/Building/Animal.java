package com.Building;

public class Animal {

	private int age = 12;// is available only in the class
	public static String name = "test name"; // is available everywhere

	int weight; // default is available only in the same package
	// available in the same package and derived classes under certain
	// circumstances

	protected double height = 5.2;

	protected static int id = 1;

	protected boolean test;

	public void run() {

		
		
	}
	
	int getAge(){
		
		return age; // getter for private variable age
	}
	
	void setAge(int Sage){
		
	 this.age = Sage;// this number is going to be set at this age
		
		
	}
}
