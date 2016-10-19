package com.twentyfive;

public class Dog {

	int age = 5;
	String name = "spot";
	Double weight = 7.0;

	Dog(int age, String name, double weight) {

		this.age = age;
		this.name = name;
		this.weight = weight;

		System.out.println("dog constructor called with Arguments passed to it\n");
		
		
		System.out.println("dog age "+ age+ "\ndog name ="+ name+ "\ndog weight = "+ weight);


	}

	Dog() {

		System.out.println("dog constructor called with no arguments passed to it");

	}
}
