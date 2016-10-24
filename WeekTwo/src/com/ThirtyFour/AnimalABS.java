package com.ThirtyFour;

abstract class AnimalABS {

	int weight, age;

	abstract void eat();

	abstract void drink();
	
	//any class that have a abstract method , will have be marked as abstract. but it can also concrete methods in it.
	
	// you can implement as many interfaces as you want

}

class Dog extends AnimalABS {

	@Override
	void eat() {
		// TODO Auto-generated method stub

		System.out.println("i am dog , i eat");

	}

	@Override
	void drink() {
		// TODO Auto-generated method stub

	}

}