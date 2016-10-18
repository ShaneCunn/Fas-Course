package com.Fas2;

public class Person {
	
	
	double weight, height;
	
	String name;
	
	void display(){
		
		
		System.out.println(" weight is " + weight + " the hieght is: " + height + " the name is: " + name);
	} 
	
	
	void bmi(){
		double bmi = height / weight;
		
		if (bmi > 15) 
			System.out.println("bmi is bad");
		else System.out.println(" bmi is grand");
		
		
		
		
		
		
	}

}
