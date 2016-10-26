package com.Android;
/*
 * an interface is a purely abstract class
 * 
 */

public interface Behaviour {

	/*
	 * an class impletements a interface, this class then has to override the
	 * all the methods of the interface
	 * 
	 * 
	 */

	void jealous();

	void anger();

	void joy();

	/*
	 * with java 8 you can provide default implementation for methods
	 * 
	 * 
	 * 
	 */

	default void nervous() {

		System.out.println("i am nervous");
	}

}
