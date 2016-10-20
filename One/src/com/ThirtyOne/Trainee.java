package com.ThirtyOne;

public class Trainee {
	// each trainee has it instance variables , each trainee has it own age,name
	// and pps variables

	String name;
	int PPS, age;

	static int coursecode = 56;
	
	// you do not have use instance variable

	public Trainee(String name, int PPS, int age) {
		super();
		this.name = name;
		PPS = PPS;
		this.age = age;

		System.out.println("name: " + name + "\nPPS: " + PPS + "\nAGe: " + age + "\n\n");
	}
	
	
	static void SignIn(){
		
		System.out.println("you are all signed in");
	}

}
