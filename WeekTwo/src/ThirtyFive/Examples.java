package ThirtyFive;

import java.util.ArrayList;

public class Examples {

	// ArrayLists

	static void ex1() {
		// creates an array of size 4
		int[] numArray = new int[4];

		int[] numArray2 = { 2, 3, 4, 5 };

		numArray[1] = 678;

		// array are not dynamic, you cannot change the size of an array

		// array list at the simplest dynamic arrays , it size can change, you
		// can add more elements

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("test1");
		strList.add("test2");

		strList.add("test3");

		strList.add("test4");

		for (String b : strList) {

			System.out.println(b);
		}

		ArrayList<Dog> dogList = new ArrayList<Dog>();

		dogList.add(22, "rex");

	}

	static void ex2() {

		// wrapper class , we use BYTE, SHORT, INTEGER, DOUBLE, FLOAT, LONG,
		// BOOLEAN, CHARACTER

		// wrapper are classes that wrap around simple datatype in a object

		Integer num = new Integer(34);

		Double Dnum = new Double(12.4);

		Boolean Btest = new Boolean(false);

		Character TestChar = new Character('t');

		int num51 = 4;
		double dnum2 = 2.4;
		boolean bool2 = false;

		char mychar2 = 'y';

		// wrapper classes numbers - integers, double, floats etc are inherited
		// from the numbers class.
		
		
		
		ArrayList<Number> numlist2 = new ArrayList<Number>();
		
		
		numlist2.add(Dnum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
