package com.practice;

/*
 * an abstract class cannot be instantiated  ie created ,  a abstract method can only in an abstract class,
 *  if ONE method in class is abstract then the whole class is abstract,
 *   however a abstract class can have concrete methods  
 * 
 * 
 * */
public abstract class Animal {

	int age;

	// a variable of any type, cannot be abstract !!!

	// abstract String name ; //cannot be done

	/*
	 * an abstract method has to be defined with the keyboard ABSTRACT and its
	 * has no body(no curly bracket{})
	 * 
	 * 
	 * 
	 */
	abstract void happy();

	void mad() {

		System.out.println("i'm an mad animal");

	}
}
