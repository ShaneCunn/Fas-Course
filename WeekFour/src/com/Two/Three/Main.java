package com.Two.Three;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog spot = new Dog();
		Dog lassie = spot;

		/*
		 * same dog is referred to by two different names
		 * 
		 */
		System.out.println(spot);
		System.out.println(lassie);

		// lassie is now a new Dog()
		lassie = new Dog();

		/*
		 * 
		 * this prints out the address, because this is what is stored in an
		 * object reference variable
		 * 
		 */

		System.out.println(lassie);

		int num = 345;

		System.out.println(num);

		int num2 = 345;
		/* to compare primitive variable , use a the equilanve ie == */
		System.out.println(num == num2);

		lassie.weight = 2000;
		lassie = spot;

		System.out.println("spot is: " + spot);
		int num3 = 100;
		System.out.println("num3 is :  " + num3);

		// printing out after method call
		PassMe.changeValue(spot, num2);

		System.out.println("num3 is :  " + num3);

		System.out.println(" spot age is now : " + spot.age);

		System.out.println("spot is now " + spot);

		// after method call

		System.out.println(" num3 is" + num3);

		System.out.println(spot.weight);
		lassie.weight = 2000;
		System.out.println(lassie.weight);

		/*
		 * primitive variable can have an infinite number of literal, booleans
		 * can only have two , char can have 65k approx
		 * 
		 * 
		 * 
		 */

		int number = 12345;
		double dnum2 = 7.89;
		boolean myBool = true;

		/*
		 * 
		 * only one type of literal value for an object and its null
		 * 
		 */

		spot = null;

		/*
		 * if an object can on longer be referred too, it is liable to garage
		 * collection i
		 * 
		 * 
		 * f an object dog benji referred too, can no longer be accessed , so
		 * this is liable for garage collection
		 */

		Dog benji = new Dog();

		/*
		 * the orginal
		 * 
		 * 
		 * 
		 */

		num = 45;
		num = 67;

		/*
		 * 
		 * you can't assign artimetric operators to objects
		 */

		num++;
		++num;

		num += num;
		num *= num;

		// spot++;
		
		
		

	}

}
