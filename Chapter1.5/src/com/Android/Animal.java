package com.Android;

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

	/* abstract String name ; cannot be done */

	/*
	 * an abstract method has to be defined with the keyboard ABSTRACT and its
	 * has no body(no curly bracket{})
	 */
	abstract void happy();

	void mad() {

		System.out.println("i'm an mad animal");

	}

	/*
	 * can't have a concrete class with out a body void angry()
	 */

	// abstract void angry(){
	// };

	// can't have a abstract method with a body

	void sad() {//

		System.out.println(" i am a sad animal");
	}

}

class Dog extends Animal {

	/*
	 * every inherited abstract method, has to be implemented in this class. we
	 * have one abstract method in the animal class, Happy(), so we have to
	 * Implement it i.e. override it the happy method
	 * 
	 * YOU HAVE TO OVERRIDE IT
	 */
	@Override
	void happy() {
		// TODO Auto-generated method stub

		//

	}

	void sad() {
		
		

	}


}
