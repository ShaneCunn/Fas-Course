package com.android;

public class Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new object of type dog
		// the variable is called spot
		Dog spot = new Dog();
		spot.age = 18;
		spot.breed = "mongrel";
		spot.weight = 200;
		spot.name = "pippa";

		System.out.println("the age of the dog is: " + spot.age + " \nbreed is: " + spot.breed + "\nthe weight is: "
				+ spot.weight + " \nthe name is : " + spot.name);

		Dog dog2 = new Dog();

		dog2.age = 12;
		dog2.weight = 145;
		dog2.breed = "test2";
		dog2.name = "john";

		System.out.println("\nthe age of the dog is: " + dog2.age + " \nbreed is: " + dog2.breed + "\nthe weight is: "
				+ dog2.weight + " \nthe name is : " + dog2.name);
		String test = "square dog";
		Dog.test(test);

		Dog[] dogArray = { spot, dog2 };
		
for(int b = 0 ; b> dogArray.length; b++){
	
	System.out.println("\nthe age of the dog is: " + dogArray[b].age + " \nbreed is: " + dogArray[b].breed + "\nthe weight is: "
			+ dogArray[b].weight + " \nthe name is : " + dogArray[b].name);
	
	
	
	
	for (Dog c : dogArray){
		System.out.println("\nthe age of the dog is: " + c.age + " \nbreed is: " + c.breed + "\nthe weight is: "
				+ c.weight + " \nthe name is : " + c.name);
		
		
	}
}
		

	}

}
