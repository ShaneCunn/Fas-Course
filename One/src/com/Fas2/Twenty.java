package com.Fas2;

public class Twenty {

	public static void main(String args[]) {

		Person john = new Person();

		Person sarah = new Person();

		john.weight = 555000;
		john.height = 155;
		john.name = "john2";

		sarah = new Person();

		sarah.weight = 120;
		sarah.height = 123;
		sarah.name = "jane";
		
		
		
		john.display();
		john.bmi();
		
		sarah.display();
		sarah.bmi();

	}

}
