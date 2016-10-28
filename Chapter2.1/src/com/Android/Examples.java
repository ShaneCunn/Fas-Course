package com.Android;

import java.math.BigDecimal;

public class Examples {

	static void ex2() {

		int bnum = 0b100;

		System.out.println("the binary number is:" + bnum);

		int bnum2 = 0b01010100100010111;

		System.out.println("the second binary number is:" + bnum2);

		// ob is identifer that tell java that it is binary number

		// _ _ _ _ _ under_score are ignored for any numbers, this is new to
		// java 8
		int bnum3 = 100_000_000;
		System.out.println("the third number is:" + bnum3);

		/*
		 * octal number begin with 0, they are displayed by default in Decimal
		 * (100 will display as 64)
		 * 
		 * 
		 * 
		 * 0 in front of a int is a octal number
		 */

		int octNum = 0100;

		System.out.println("the octnumber 1 number is:" + octNum);

		int octNum2 = 077754321;

		System.out.println("the octnumber 2 number is:" + octNum2);

		/*
		 * 
		 * 
		 * HEX NUMBER use 0x , they are displayed by in deicaml (10 will display
		 * as 16)
		 * 
		 * 
		 */

		int hexNum = 0x10;

		System.out.println("the HEX number is:" + hexNum);

		int hexNum2 = 0x9BcD4Fcf;

		System.out.println("the HEX number is:" + hexNum2);

		int sum = hexNum + hexNum2 + octNum + bnum;

		System.out.println("the sum is:" + sum);

		// int somenum =

		System.out.println(Integer.toString(sum, 2));

		int octnum3 = 0_25; // this is allowed

		/*
		 * octnum3= _22; can't start with a underscore or finish either with a
		 * literal value
		 */

		/*
		 * int newbiNum = 0x_2323;
		 * 
		 * you can't do it before the number, but can in the number afterwards
		 * 
		 */

		int newbiNum = 0x2_323; // you can in the numbers afterwards

		System.out.println(" new underscore number: " + newbiNum);

		// int testnum = Integer.parseInt("1234");

		// System.out.println("parse num1 :" + testnum);

		/*
		 * 
		 * these are called parsers and convert text to numbers or booleans, but
		 * not Characters
		 */

		int binVal = 0b100001011;

		System.out.println("binval = :" + binVal);

		BigDecimal test = new BigDecimal(3.2131321312442131212413413412);

		System.out.println("bigdecimal = " + test);

		float fnum = 45.67f;
		double dnum = 45.767;
		float fnum2 = (float) dnum;

		double dnum2 = (double) fnum;

		double dnum3 = 3.54D;

		/*
		 * Rules:
		 * 
		 * you can't use floating point literal as decimal place , and you can't
		 * at the end of the number either
		 * 
		 * 
		 */

		char charTest = 't';

		System.out.println("char output " + charTest);
		System.out.println("char output " + charTest);

		System.out.println("char output " + charTest);
		char c4 = '\u058D';

		System.out.println("unicode " + c4 + " test");

		/*
		 * you can cast, but you shouldn't
		 * 
		 * 
		 * 
		 */

		int _test_;// you can have a underscore anywhere
		int £$€; // currency symbols anywhere
		/*
		 * invalid identifiers //variable can't start with number.
		 * 
		 * int 7um;
		 * 
		 * 
		 * no dashes allowed , anywhere
		 * 
		 */

		// you can define and initialise them as many variable as the same type
		// ,
		// as you like , on the same line

		int num = 23, num2 = 45;

	}

}
