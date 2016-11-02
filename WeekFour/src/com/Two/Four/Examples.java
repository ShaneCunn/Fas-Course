package com.Two.Four;

public class Examples {

	static void assignmentOper() {

		int a = 12, b = 3;

		a -= b; // same as a= a-b;
		System.out.println("a is " + a + " b is =" + b);

		b *= a;// same as b= b*a;
		System.out.println("a is " + a + " b is =" + b);

		a += b; // same as a= a+b;

		System.out.println("a is " + a + " b is =" + b);

		/*
		 * you can't declare different variable types on the one line,
		 * 
		 * // double dnum 56.7, dnum2 = 3423.4, int num = 45;
		 * 
		 * 
		 */

		int c = 56;

		/*
		 * read from right to left, a is the smae as b as the same as c
		 * 
		 * 
		 */

		a = b = c;

		boolean myboole = true;
		boolean myboolean2 = false;

		/*
		 * 
		 * cannot do the following myboole += myboolean;
		 * 
		 * 
		 * check to see if they are the same.
		 */

		long lNum = 1234567890123456789L; // 64 bit number

		/*
		 * a int can fit inside a long , as it is a 32 bit number
		 * 
		 */

		int smallnum = 67;

		lNum = smallnum; // fits inside a long variable

		/*
		 * we can cast from bigger number to smaller but you can get
		 * unpredictable results
		 */

		smallnum = (int) smallnum;

		System.out.println("small numbe is: " + smallnum);
		/*
		 * 
		 * */

	}

	static void ArithmeticOperators() {

		/*
		 * the arithmetic operators are : +,-,/,*
		 * 
		 * and modulus %
		 * 
		 * i++ post increment operator --i post decrement operator
		 * 
		 * ++i pre increment operator --i pre decrement operator
		 */

		int a = 8, b = 7;

		a = 3;
		b = 4;

		a = 4;
		b = 100;

		// always have to be separated by semi colon

		System.out.println("val of a is: " + a);

		System.out.println("val of b is: " + b);

		System.out.println(a % b);

		++a; // ai s now 5
		System.out.println(" ++a is now : " + a);

		++a;// a is now 6

		System.out.println(" a is now : " + a);

		// print out first and it then increment the number
		System.out.println(" a is now : " + (a++));

		// a++;

		System.out.println(" a is now : " + a);

		a = 10;
		b = 100;

		int num = a + b++;// it adds a and b first and it then increment b after

		System.out.println(" num is now : " + num);

		System.out.println("b is : " + b);

		b = 100;

		num = a + ++b;

		System.out.println(" num is now : " + num);

		/*
		 * this is the same as (num = 10+(100+1) =111
		 * 
		 */

		num = ++a + ++b;

		System.out.println(" num is now : " + num);
		
		a = 10; b= 100;
		
		num = ++a - b++;
		
		System.out.println(" num is now : " + num);
		
		a = 10; b= 100;

		
		num = ++a + b++ + b;

		System.out.println(" num is now : " + num);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		

	}
}
