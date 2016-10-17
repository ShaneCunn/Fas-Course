package com.practice;

class BeerSongWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int beerNum = 99;
		
		
		String wordBeer = "bottles";
		
		while(beerNum> 0){
			if (beerNum == 1){
				
				wordBeer = "bottle";
			}
			System.out.print(beerNum + " " + wordBeer + " of beer on the wall, "); // print out the value of beerNum and word
			System.out.println(beerNum + " " + wordBeer + " of beer.");
			System.out.println("Take one down and Pass it around." );
			beerNum --;
			if (beerNum == 1) {

				wordBeer = "bottle";
			}
			if (beerNum > 0) {
				System.out.println(beerNum + " " + wordBeer + " of beer on the wall");
			}

			else {
				System.out.println("No more bottles of beer on the wall"); // if beerNum is 0 it prints this
			}
		}

	}

}
