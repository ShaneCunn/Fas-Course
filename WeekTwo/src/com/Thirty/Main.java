package com.Thirty;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot=new Dog();
		spot.setHeight(7);
		System.out.println("height of spot is "+spot.getHeight());
		/*
		 * we can gain access to the boolean sex
		 * as it has default level access, which is
		 * package level access
		 */
		System.out.println(spot.sex);
		

	}

}
