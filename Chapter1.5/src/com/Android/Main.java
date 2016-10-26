package com.Android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog spot = new Dog();

		spot.happy();

		Ape freddy = new Ape();

		freddy.anger();// overridden

		freddy.joy();// overridden

		freddy.jealous();// overridden

		freddy.nervous();

	}

}
