package com.ThirtyFour;

class ExamplesABS {

	class Mammal extends AnimalABS {

		@Override
		void eat() {
			// TODO Auto-generated method stub

		}

		@Override
		void drink() {
			// TODO Auto-generated method stub
			
		}

	}
	
	static void ex3(){
		
		Wizard fred = new Wizard();
		
		
		fred.angry();
		
		fred.frusated();
		
		
		// a behaviour  interface refereence can
		
		behaviour wizBehaviour = new Wizard();
	}
	
	
	static void ex4(){
		
		Insect tiny = new Insect();
		
		
		tiny.fly();
		
		Soldier tom = new Soldier();
		tom.scared();
	}

}
