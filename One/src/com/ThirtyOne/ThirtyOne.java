package com.ThirtyOne;

public class ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee bob = new Trainee("john", 123456, 39);

		Trainee saraah = new Trainee("sarah", 654321, 23);
		// bob age before been override
		System.out.println("bob age is: " + bob.age);
		// overriding bob age variable
		bob.age = 12;

		System.out.println("bob age is: " + bob.age);
		System.out.println("sarah age is: " + saraah.age);

		System.out.println("bob orginal course code is: " + bob.coursecode);
		// bob.coursecode = 34; // you should use the class or static variable
		Trainee.coursecode = 34;

		System.out.println("bob  new course code is: " + Trainee.coursecode);

		System.out.println("bob  new course code is: ");
		// we should access static method by using the following method
		// we put the name of the class followed by the name of the static
		// method
		Trainee.SignIn();

		// you should not access statics in a none static way

		// if you can't access a value, it can garage collection, you can't
		// guarantee it!!!!

		// it tries to free up the memory

	}

}
