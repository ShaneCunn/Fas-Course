package com.practice;

import java.util.Scanner;

public class Beer {
	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter the number of bottles here: ");
		int size = keyboard.nextInt();
		BeerBackwards.songPrint(size);
		keyboard.close();
	}

}
