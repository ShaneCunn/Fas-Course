package com.android;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog2 spot2 = new Dog2();

		spot2.name = "john";
		System.out.println("spot name is: " + spot2.name);

		// call the method by name of the object and followed by a dot .
		spot2.run();

		Person shane1 = new Person();
		int speed = 5;
		shane1.run(speed);

		Cat fred = new Cat();

		fred.name = "dibble";
		fred.weight = 14;
		System.out.println("the name of the cat is:" + fred.name + "\nThe weight is:" + fred.weight);

		int num1 = 14;
		int num2 = 45;
		int total = (int) fred.bmi(num1, num2);
		
		System.out.println(total);
		double first = 12.5;
		double second = 10.4;
		double totalDivid = fred.divide(first, second);
		
		System.out.println(totalDivid);
		
		

	}

}
