package com.android;

import java.util.Date;

public class Dog2 {

	String breed, name;

	int age;
	double weight;

	void run() {

		System.out.println(" i am a dog and i run");

		try {
System.out.println("waiting 3 seconds");
			// sleep 3 seconds
			Thread.sleep(3000);

			System.out.println(" done , 3 seconds has passed");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
