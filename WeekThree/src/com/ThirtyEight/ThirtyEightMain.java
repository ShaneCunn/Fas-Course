package com.ThirtyEight;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ThirtyEightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("testout for 38");

		Animal bob = new Animal();

		/*
		 * Brand new for Java 8
		 * 
		 * Dates , three of a dates : local date,
		 * 
		 * 
		 * 
		 */
		LocalDate date; // this is only the date 12-12-2016
		// ie the time is 12:23:56:34

		LocalTime time;

		LocalDateTime dateTime;

		// each of the above class has static method called now , which can be
		// used by:

		// prints current date, by default prints in usa format YYYY-MM-DD

		System.out.println(LocalDate.now());

		// print the current time , in 24 hours format

		System.out.println(LocalTime.now());

		// print out date and time ,

		System.out.println(LocalDateTime.now());

		// System.out.println(LocalTime.now(clock));

		date = LocalDate.of(2016, Month.OCTOBER, 21);

		System.out.println(LocalDate.now());

		LocalDate testdate = LocalDate.now(Clock.systemUTC());

		System.out.println(testdate);

		try {
			date = LocalDate.of(2050, Month.SEPTEMBER, 32);
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("the exceptions is " + e);
		}

		// this is how you add days to dates in java.
		date = date.plusDays(120);
		
		date = date.plusWeeks(12);

		
		//example of chaining 
		
		date = date.plusDays(120).plusYears(12);
		
		System.out.println("new date is: " + date);
	}

}
