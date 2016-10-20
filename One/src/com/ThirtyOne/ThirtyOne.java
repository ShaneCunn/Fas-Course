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

		Trainee test = new Trainee("test", 651, 232312);

		saraah = test;

		// it called derefeerncing

	}

	static void ex2() {

		int age = 1123;
		String name = "test";

		String gender = "false";
		double weight = 12;
	//	boolean sex = false;
		//Cat fred = new Cat(age, name, gender, weight);
	}

	class Cat {
		int age;
		String name, gender;
		double weight;
		boolean sex;

		public Cat(int age, String name, String gender, double weight) {
			super();
			this.age = age;
			this.name = name;
			this.gender = gender;
			this.weight = weight;

			if (sex == true)
				gender = "Female";
			else
				gender = "Male";

		}

	}

}
