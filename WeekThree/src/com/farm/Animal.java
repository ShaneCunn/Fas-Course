package com.farm;

public abstract class Animal {
	double weight;
	boolean sex;
	String gender;
	
	Animal(){
		
	}
	
	Animal(double weight,boolean sex){
		this.weight=weight;
		if(sex)
			gender="Female";
		else
			gender="Male";		
	}
	
	double calcPrice(double pricePerKg){
		return weight*pricePerKg;
	}
	

}
class Cow extends Animal{
	int id;
	static int counter=0;
	
	Cow(){
		
	}

	Cow(double weight, boolean sex) {
		super(weight, sex);
		counter++;
		id=counter;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cow [id=" + id + ", weight=" + weight + ", gender=" + gender + "]\n";
	}	
	
}

class Sheep extends Animal{
	int id;
	static int counter=0;
	
	Sheep(){
		
	}

	Sheep(double weight, boolean sex) {
		super(weight, sex);
		counter++;
		id=counter;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sheep [id=" + id + ", weight=" + weight + ", gender=" + gender + "]";
	}
	
}
