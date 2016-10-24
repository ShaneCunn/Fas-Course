package com.TwentyThree;

class TweentyThreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog lassie = new Dog();

		// these are all references ie names of the object ie idea
		Dog rex = lassie;
		Dog pippa = lassie;

		System.out.println(lassie == rex);

		System.out.println(
				"the name is : " + lassie.name + "\nthe weight is: " + lassie.weight + "\nthe age is: " + lassie.age);
		// the are new dogs .
		rex = new Dog();
		pippa = new Dog();

		pippa.age = 12;

		pippa.weight = 15.0;

		pippa.name = "sarah";

		System.out.println("\n\npippa object\n" + "the name is : " + pippa.name + "\nthe weight is: " + pippa.weight
				+ "\nthe age is: " + pippa.age);
		// every time the new keyword is called , the constructor is called. if
		// it is not defined it calls the default constructor.

		Cat tibble = new Cat();

		System.out.println("\n\ncat object\n" + "the name is : " + tibble.name + "\nthe weight is: " + tibble.weight
				+ "\nthe age is: " + tibble.age + "\nthe height is:" + tibble.height);

		Cat test2 = new Cat();
		
		Swan sammy = new Swan(12, 12.555, 12313.1312,"shaen swan");
		
		

		System.out.println("\n\nSwan object\n" + "the name is : " + sammy.name + "\nthe weight is: " + sammy.weight
				+ "\nthe age is: " + sammy.age + "\nthe height is:" + sammy.height);
		
		
		//Person shane = new Person(23, "mary", true);
		
		Pig piggy = new Pig();
		
		piggy.one();
			
			

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
