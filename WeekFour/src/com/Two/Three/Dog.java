package com.Two.Three;

public class Dog {

	int age;
	int weight = 12345;

	public Dog(int age) {

		this.age = age;

	}

	public Dog() {

		age = 45;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}

}

class PassMe {

	static void changeValue(Dog spot, int num) {

		spot.age = spot.age * 2;

		num = num * 2;

		spot = new Dog();

	}
}
