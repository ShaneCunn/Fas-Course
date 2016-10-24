package com.ThirtyEight;

public class Animal {

	int age;

	String name;

	static int groupid;

	// initialiser , they are used for giving values to instance variable or
	// running code before a constructor
	// Static init alway comes before an ordinary init

	{
		// Ordinary initialiser
	

		age = 4;
		name = "sally";

		System.out.println(" initiailiser called!");

	}

	static {	{// Static initialiser  is laways called first


		groupid = 0;

		System.out.println(" static initiailiser called!");

	}

	Animal() {

		System.out.println("animal construtor called!");

	}
}
