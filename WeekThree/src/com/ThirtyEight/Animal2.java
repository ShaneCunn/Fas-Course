package com.ThirtyEight;

public class Animal2 {

	int age;

	String name;

	static int groupid;

	// initialiser , they are used for giving values to instance variable or
	// running code before a constructor
	// Static init always comes before an ordinary init

	{
		// Ordinary initialiser

		age = 4;
		name = "sally";

		System.out.println(" initiailiser called!");

	}

	static { // Static initialiser is always called first

		groupid = 0;

		System.out.println(" static initiailiser called!");

	}

	static {

		System.out.println(" second initiailiser called");
	}

	Animal2() {

		System.out.println("animal construtor called!");
		
		groupid+=1;
		
		System.out.println("group id number is : " + groupid);

		

	}
}
