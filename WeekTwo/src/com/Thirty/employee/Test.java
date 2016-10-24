package com.Thirty.employee;


class Test {
	private int age=2;
	private String name="rex";
	private double weight=3.4;
	private double height=2.3;
	private Dog rex = new Dog(age, name, weight, height);
	
	void printy(){
		/*
		 * can access age as age is a public 
		 * variable
		 */
		System.out.println(rex.age);
		/*
		 * cannot find sex as its package level
		 * access and we are now in a different
		 * package
		 */
		//System.out.println(rex.sex);
		
	}

}

class CockerSpaniel extends Dog{
	
	int num;
	//String colour="Brown";
	
	

	public CockerSpaniel(int age, String name, double weight, double height) {
		super(age, name, weight, height);
		// TODO Auto-generated constructor stub
	}
	//blank constructor
	CockerSpaniel(){
		
	}
	
	
	
	void printy(){
		//has access to the colour variable as it is protected
		System.out.println(colour);
				
		
		
	}
	
}
