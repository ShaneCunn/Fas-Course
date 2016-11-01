package com.farm;

import java.util.Arrays;
import java.util.Random;

public class Farmer {
	String name;
	Animal[]animalList;
	int animalCount;
	static int counter;
	double price;
	double totalPrice;
	boolean type;
	int id;
	public Farmer(String name, int animalCount,double price,
			boolean type) {
		super();
		counter++;
		this.name = name;
		this.animalCount = animalCount;
		this.type=type;
		animalList=new Animal[animalCount];
		id=counter;
		popHerd();
		totalPrice=calcTotalPrice(price);
	}

	private void popHerd(){		
	 if(type){
			for(int i=0;i<animalCount;i++){
				for(int j=0;j<2;j++)
				{
					int weight=randInt(50,100);
					animalList[j]=new Sheep(weight,false);
				}
				int weight=randInt(25,50);
				animalList[i]=new Sheep(weight,true);	
			}
			
		}
		
		else{
			for(int i=0;i<animalCount;i++){
				for(int j=0;j<2;j++)
				{
					int weight=randInt(500,700);
					animalList[j]=new Cow(weight,false);
				}
				int weight=randInt(300,500);
				animalList[i]=new Cow(weight,true);	
			}			
		}		
	}
	
	private double calcTotalPrice( double price){
		double total=0;
		for(int i=0;i<animalCount;i++){
			total+=animalList[i].calcPrice(price);
		}
		return total;
	}
private int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}


@Override
public String toString() {
	return "Farmer [name=" + name + ", animalList=" + Arrays.toString(animalList) + ", animalCount=" + animalCount+" total price is "+totalPrice
			+ "]";
}


	
	

}
