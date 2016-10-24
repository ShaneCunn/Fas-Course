package com.Thirty;

class Dog {
	/*
	 * available to all classes everywhere
	 */
	private int age;
	/*
	 * only have access to these variables through
	 * getters and setters
	 */
	private String name;
	private double weight;
	private double height;
	/*
	 * default access is the same package level access
	 * sex has default access modifier
	 */
	boolean sex;
	/*
	 * available in the same package and also 
	 * in derived classes even if they are 
	 * not in the same package
	 * see Dog class method printy()
	 */
	protected String colour="red";
	public Dog() {
		super();
		this.age = 2;
		this.setName();
		this.setWeight();
		this.setHeight(4.5);
	}
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	//for accessing the private name variable
	public String getName() {
		return name;
	}
	//for setting the private name variable
	private void setName() {
		this.name = "spot";
	}
	//for accessing the private weight variable
	public double getWeight() {
		return weight;
	}
	//for setting the private weight variable
	private void setWeight() {
		this.weight = 2.3;
	}
	//for getting the private height variable
	public double getHeight() {
		return height;
	}
	//for setting the private height variable
	public void setHeight(double height) {
		this.height = height;
	}
}

class Cat{
	
}
