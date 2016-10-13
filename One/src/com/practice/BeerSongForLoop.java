package com.practice;

public class BeerSongForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int beerNum = 99;
		String word = "bottles";
		

		for (beerNum = 99; beerNum > 0; beerNum--) {  // while beerNum is 99 it decreases the counter by 1
			if(beerNum == 1){
				word ="bottle"; // added check to change from bottles to bottle when beerNum == 1
			}
			System.out.print(beerNum + " " + word + " of beer on the wall, "); // print out the value of beerNum and word
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down and Pass it around.");
		}
		if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
		}

		else {
			System.out.println("No more bottles of beer on the wall"); // if beerNum is 0 it prints this
		}
	}

}
