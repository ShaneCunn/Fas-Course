package com.assignment;

import java.util.Scanner;

public class Farmer extends Person {

	

	void run() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the number of farmers :");
		
		int numberofFarmers = keyboard.nextInt();
		
		for( int i = 0; i< numberofFarmers; i++){
			int farmerId = (int) (Math.random() * 1000);
			
			System.out.println("farmer id is: " + farmerId);

			
		}
		
		//System.out.println("farmer id is: " + farmerId);
		
		
	}

}
