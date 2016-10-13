package com.android;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean toRunning = false;

		while (!toRunning) {

			Scanner keyBoard = new Scanner(System.in);
			int choice;

			System.out.println("enter choice between 1-3: \n" + "enter 4 to exit");
			choice = keyBoard.nextInt();

			switch (choice) {
			case 1:
				System.out.println("1 was picked");
				break;

			case 2:
				System.out.println("2 was picked");
				break;

			case 3:
				System.out.println("3 was picked");
				break;
			case 4:
				toRunning = true;
				System.out.println("Closing Cal");
				keyBoard.close();
				break;
			default:
				System.out.println("nothing was entered ");
				break;
			}
		}
		
		public static String  feedback1{
			
			
			
		}

	}

}
