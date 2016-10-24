package com.twentyfive;

class Dog {

	private int age = 5;
	private String name = "spot";
	private Double weight = 7.0;

	Dog(String name, double weight) {

		this.age = 12;
		this.name = name;
		this.weight = weight;

		System.out.println("dog constructor called with Arguments passed to it\n");
		
		
		System.out.println("dog age "+ 12 + "\ndog name ="+ name+ "\ndog weight = "+ weight);


	}

	Dog() {

		System.out.println("dog constructor called with no arguments passed to it");

	}
}
