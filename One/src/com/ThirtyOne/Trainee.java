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

	static void SignIn() {

		System.out.println("you are all signed in");
	}

	// for ordinary methods you can access both static members( methods and
	// variables)

	static void Test() {
		// System.out.println("name: " + name + "\nPPS: " + PPS + "\nAGe: " +
		// age + "\n\n");
		SignIn();

		// you can't access a non static member inside a static method, this
		// gives an error

		/*
		 * Only the class gets static. But if the static keyword is removed from
		 * class B , it cannot be accessed directly without making an instance
		 * of A . But we cannot have static members inside a non-static inner
		 * class. Outer classes cannot be static, but nested/inner classes can
		 * be.
		 */ }

}
