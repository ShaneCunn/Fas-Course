package TwentySeven;

public class Employee {

	int pps;
	String name;
	double wages;

	void works() {

		System.out.println("a employee works");
	}

}

class Accountant extends Employee {

	// System.out.println("employee number is: " + pps + "\n employee name =" +
	// name + "\nemployee wages are = " + wages);
	String[] certs;

	double allowances;
	boolean healthPlan;

	void works() {
		
		System.out.println(" i am accountant and call other classes");
		billing();
		calcBudget();
		calcWages();
	}

	void billing() {

		System.out.println("I do billing");

	}

	void calcWages() {

		System.out.println("I do billing");

	}

	void calcBudget() {

		System.out.println("I do Budget");

	}

}
