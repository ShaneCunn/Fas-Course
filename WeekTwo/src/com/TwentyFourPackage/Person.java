package com.TwentyFourPackage;

public class Person {
	
	int age = 5;
	String  name= "spot";
	Double weight = 7.0;
	
	
	
	
	Person(int age, String name,double weight){
		
		this.age =age;
		this.name = name;
		this.weight = weight;
		
		System.out.println("this is the person class constructor");
		
		System.out.println("the age is: "+ age+ "\njthe name is :"+ name+"\nthe weight is:"+ weight);

		
		
		
	}

}
