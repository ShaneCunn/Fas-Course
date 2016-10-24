package com.ThirtySix;

public class Animals {

	int age;
	String name;

}

class Dog extends Animals {

}

class Cat extends Animals {

}

class Siamese extends Cat {

}

class Donkey{
	
	
	
	void passByValue(int num, double dNum){
		num*=100;
		
		dNum+=100;
		System.out.println(" the new  values num are : " + num + " and Dnum is: " + dNum);
	}
	
}
