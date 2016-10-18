package com.practice;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		
		
		
		
		ArrayList<String> listTest = new ArrayList<String>();
		
		
		listTest.add(" green bottles of beer on the wall");
		listTest.add(" and if ");
		listTest.add(" green bottle should accidently fall, ");
		listTest.add("They'll be ");
		listTest.add(" green bottle hanging on the wall");
		listTest.add("no bottles of beer on the wall");




		
			

		System.out.println("is it working?");
		
		System.out.println(listTest.get(0));
		System.out.println(listTest.get(1));
		System.out.println(listTest.get(2));
		System.out.println(listTest.get(3));
		System.out.println(listTest.get(4));
		System.out.println(listTest.get(5));
		
		System.out.println("\n part 2");
		
		//enhanced for loop to go through the arraylist
		
		for (String b : listTest){
			
			System.out.println(b);
			
			
		}
		
		
		
		
	}

}
