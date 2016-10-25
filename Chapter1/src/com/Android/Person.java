package com.Android; //first thing you see in a java file except a comment

// Second thing is a import statement

// 

import com.Animal.Cow; // this import this class only ****************

// import everything using .*;

import com.Animal.*;

// you need the content of mammal package separately, you can only import from that level only

import com.Animal.Mammal.*;

public class Person {

	// a single file can have many classes as you want.

	// you have only public class per file

	Cow bessy = new Cow();

	Duck daffy = new Duck();
	Zebra blackie = new Zebra();

	Ape andy = new Ape();

	// a class within a class ie inner classes

	// this is how to call a class with using a import ie fully qualified name,
	// its isn't used much , but will be used for the exam
	com.Animal.Mammal.Ape andy3 = new com.Animal.Mammal.Ape();

	private class Heart {

	}

	enum Car {

		Ford, Feista, Volkswagon
	}

	// TO DO add in Enum switch statement
	class Building {

	}

	private interface test {

	}

}
