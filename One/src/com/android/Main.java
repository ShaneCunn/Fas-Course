package com.android;

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test out");

		ArrayList<Integer> testList = new ArrayList<>(5);

		testList.add(43);
		testList.add(133);
		testList.add(4);
		testList.add(56);
		testList.add(86597765);

		for (Integer number : testList) {

			System.out.println("Number = " + number);
		}

		ArrayList<String> stringList = new ArrayList<>(4);

		stringList.add("shane ");
		stringList.add("was ");
		stringList.add("in ");
		stringList.add("Mervue");

		for (String stringOutput : stringList) {

			System.out.println("String output is: " + stringOutput);

		}

		byte bnum = 31; // go from -+128

		short snum = 4500;

		long lnum = 455523;

		long lnum2 = (long) 3243423;
		double dnum = 45.34342;
		float fnum = 6.4445424f;

		boolean testBool = false;

		char testChar = '@';

		char myChar = 65;

		System.out.println(myChar);

		String testString = "Hello shane C 2";

		System.out.println(testString);

	}

}
