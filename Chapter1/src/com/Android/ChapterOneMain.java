package com.Android;

import com.Animal.Mammal.Monkey;

public class ChapterOneMain {

	public static void main(String args[]) {

		System.out.println("test out 1");

		System.out.println("Random numbers between 1 and 100 are,");
		for (int i = 0; i < 5; i++)
			System.out.println("Random Number [" + (i + 1) + "] : " + (int) (Math.random() * 100));
		/* when it is inside a string it treat it as part of a string */

		System.out.println(" Timmy /*  name*/");

		String name = " shane";

		System.out.println(name);

		System.out.println();
		Monkey fred = new Monkey();
		
		fred.angry();

	}

}
