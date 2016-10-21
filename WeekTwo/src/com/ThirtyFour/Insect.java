package com.ThirtyFour;

public class Insect  implements Movement{

	@Override
	public void walk() {
		System.out.println("insect: walk");

		
	}

	@Override
	public void swim() {
		System.out.println("insect: swim");
		
	}

	@Override
	public void fly() {
		System.out.println("insect: fly");
		
	}

	@Override
	public void run() {
		System.out.println("insect: run");
		
	}

}
