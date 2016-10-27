package com.Android;

/*when you have a final class , 
 * you cannot inherit from it*/
public final class Person {

	/*
	 * can't extent it from a final class, so this will not compile
	 */

	final int age = 34;
	/*
	 * this variable cannot change , once given a value
	 */
	final double height = 67.23;

	final double weight;

	/*
	 * you can't create person, without using this constructor so will you have
	 * to give it a value to the final double weight
	 * 
	 */

	Person(int weight) {
		this.weight = weight;
	}

}

class Irish {
	/*
	 * you can't override a final method
	 * 
	 * 
	 */
	final void talk() {

		System.out.println("irish talking");

	}

	void talk(int num) {

		System.out.println("this is an overlaoded method, it can be overload, ");
	}

}

class Galway extends Irish {
	/*
	 * you can't override a final class void talk(){
	 * 
	 * 
	 * }
	 */

	/// BUT you can overload it.................

}













