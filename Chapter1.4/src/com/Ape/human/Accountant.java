package com.Ape.human;

import com.Ape.Gibbon;

class Accountant {

	
	 // because the gibbon class is public and the class is in a different package;
	static Gibbon derek = new Gibbon();
	
	
	
	
	static void run(){
		
		System.out.println(derek.name);
	}
}
