package fas1;

import java.util.Scanner;

class CalTest {

	public static void main(String[] args) {

		boolean exitCal = false;
		
		
		while (!exitCal) {
			System.out.println("Simple Calculator\n");

			Scanner keyboard = new Scanner(System.in);

			double num1, num2;
			int numOper;
			System.out.print("Enter first number: ");

			num1 = keyboard.nextDouble();
			System.out.print("Enter second number: ");
			num2 = keyboard.nextDouble();

			System.out.println("Selected operators, select:\n1  to add\n2 to divide\n3 to multi\n"
					+ "4 to subtract\n0 to close calculator");

			numOper = keyboard.nextInt();

			switch (numOper) {

			case 1:

				System.out.println("Answer is: " + add(num1, num2));
				break;
			case 2:

				System.out.println("Answer is: " + div(num1, num2));
				break;

			case 3:
				System.out.println("Answer is: " + multi(num1, num2));
				break;

			case 4:
				System.out.println("Answer is: " + sub(num1, num2));
				break;

			case 0:

				exitCal = true;
				System.out.println("Closing Cal");
				keyboard.close();
				break;

			default:
				System.out.println("warning, not a number");

			}
		}
	}

	private static double add(double x, double y) {
		return x + y;
	}

	private static double div(double x, double y) {
		if (y == 0) {
			System.out.println("Error you can't divide by Zero!!");
			return 0;
		} else if (x == 0) {

			System.out.println("Error you can't divide by Zero!!");

		}
		return x / y;
	}

	private static double multi(double x, double y) {
		return x * y;
	}

	private static double sub(double x, double y) {
		return x - y;
	}

}