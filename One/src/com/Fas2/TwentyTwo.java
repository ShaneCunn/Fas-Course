package com.Fas2;

public class TwentyTwo {

	public static void main(String args[]) {

		System.out.println("test output1");

		Maths myMaths = new Maths();

		int sum = myMaths.addMe(12, 10);
		System.out.println("the sum is: " + sum);

		double total = myMaths.multi(12, 10);

		System.out.println("the total is: " + total);
		
		
		double total1 = myMaths.divide(12, 10);

		System.out.println("the total is: " + total1);
		
		
		
		Person2 shane = new Person2();
		
		
		shane.age = 12;
		shane.height = 1.55;
		shane.weight = 155;
		shane.name = "shane";
		
		shane.printMe();
		
		
		int[] arrayNum = {12 ,13, 1,41, 15 ,16 ,17, 18};
		
		
		
		shane.printAll(arrayNum);
		
	}
}
