package com.TwentyFourPackage;

public abstract class TwentyFourMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person shane = new Person(12, "padraic", 155.34);
		
		
		
		Dog pippa = new Dog(4, "pippa", 14.3232);
		
		
		Dog fred = new Dog(7, "fred", 0.12);

		
		fred.eat();
		
		
		fred.eat(1223123.123);
		
		int[] myArray ={12, 3, 4, 5, 6};
		String[] Sarray = {"test", "test2", "test3"};
		double[] Darray = {23.4, 45.4 , 56, 67};
		
		Maths testMath = new Maths();
		
		testMath.printMe(myArray);
		
		testMath.printMe(Sarray);
		
		testMath.printMe(Darray);



	}

}
