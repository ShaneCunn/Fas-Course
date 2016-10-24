package com.ThirtyFour;

public class Warrior implements behaviour {

	private int age;
	private String name;

	@Override
	public void happy() {
		// TODO Auto-generated method stub

		System.out.println("i'm happy warrior warrior");

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
	public void frusated() {
		// TODO Auto-generated method stub

		System.out.println("my happiest is:" + num + "my name is:" + name);

	}

}

class Wizard implements behaviour, Movement {
	int age;
	private String name;

	@Override
	public void walk() {
		// TODO Auto-generated method stub

		System.out.println("Wizard:  walks");

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Wizard: swims");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

		System.out.println("Wizard: flies");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Wizard: runs");

	}

	@Override
	public void happy() {
		System.out.println("Wizard: happy");

	}

	@Override
	public void angry() {
		System.out.println("Wizard: angry");

	}

	@Override
	public void sad() {
		System.out.println("Wizard:sad ");

	}

	@Override
	public void scared() {
		System.out.println("Wizard: is scared");

	}

	@Override
	public void frusated() {
		System.out.println("wizard is:" + num + "my name is:" + name);

	}

}