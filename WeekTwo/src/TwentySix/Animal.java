package TwentySix;

// super or parent class
class Animal {

	int age = 5;
	private String name = "spot";
	private Double weight = 7.0;

	void eat() {

		System.out.println("i am animal eating");
	}

	void moving() {
		System.out.println("i am animal moving");

	}

	void reprocing() {
		System.out.println("i am animal reproductiing");
	}

	void attacks() {

		System.out.println("does nothing and not attacks");
	}

	void printme() {

		System.out.println("animal age " + age + "\nanimal name =" + name + "\nanimal weight = " + weight);

	}

}

// derived class , it called overriding
class cow extends Animal {

	// System.out.println("test 5");

}

class Shark extends Animal {

	void eat() {

		System.out.println("i am a shark eating");
	}

	void attacks() {
		System.out.println("i am a shark biting");

	}
}















