package com.ThirtyThree;

class Examples {

	static void Strings() {

		// string is an object, which is an actually an array of Char's (chars)

		Dog spot = new Dog();

		Dog fred = new Dog();

		System.out.println(spot.equals(fred));

		String str = "Hello";
		String str2 = "Hello";
		// this will print out true as it is equal
		System.out.println(str.equals(str2));

		String test3 = "        test out put string          ";

		System.out.println(test3);

		System.out.println("in uppercase" + test3.trim() + test3.toUpperCase());

		String smaller = test3.trim();

		System.out.println("concate : " + smaller.concat(str2));

		System.out.println("concate : " + smaller.codePointCount(7, smaller.length()));

		// System.out.println("concate : " + smaller.replace(targe,
		// replacement));

	}

	static void stringBuilder() {

		StringBuilder sb = new StringBuilder("Hello there");

		StringBuilder test = sb;
		System.out.println("before   " + sb);
		test.append(10);
		test.append("top");
		test.append("!");
		test.append(true);
		test.append(2.99);
		System.out.println("after   " + test);

	}

	private class Cat {

		int age;
		String name; 

	}

}
