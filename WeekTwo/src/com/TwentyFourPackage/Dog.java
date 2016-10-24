package com.TwentyFourPackage;

class Dog {

	
	private int age = 5;
	private String  name= "spot";
	private Double weight = 7.0;
	
	
	Dog(int age, String name, double weight){
		
		
		this.age = age;
		this.name = name;
		this.weight= weight;
		
		System.out.println("\nthis is the dog class constructor");
		
		System.out.println("\nthe age is: "+ age+ "\njthe name is : "+ name+"\nthe weight is: "+ weight);
	}
	//this is a simple method that doesn't take in anything
	
	void eat(){
		
		System.out.println("this is a simple void method, dosen't do anything");
		
		
	}
	
	
	
	
	void eat(double weight){
		
		
		this.weight = weight;
		
		System.out.println("the weight is: "+ weight);
	}
	
	
	
	
	
	
	
	
}
