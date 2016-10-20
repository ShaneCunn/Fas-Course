package com.ThirtyFour;

public class Warrior implements behaviour {

	@Override
	public void happy() {
		// TODO Auto-generated method stub

		System.out.println("i'm happy warrior");

	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		System.out.println("i'm angry warrior");

	}

	@Override
	public void sad() {
		// TODO Auto-generated method stub
		System.out.println("i'm sad warrior");

	}

	@Override
	public void scared() {
		// TODO Auto-generated method stub
		System.out.println("i'm sr" + "cared warrior");

	}

	@Override
	public void frusated(double num, String name) {
		// TODO Auto-generated method stub

		System.out.println("my happiest is:" + num + "my name is:" + name);

	}

}
