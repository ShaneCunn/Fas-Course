package TwentySix;

public class TwentySix {

	public static void main(String args[]) {

		Animal fred = new Animal();

		fred.eat();

		fred.moving();

		fred.reprocing();

		fred.printme();

		Animal peter = new Animal();

		Shark jawsTheShark = new Shark();

		jawsTheShark.attacks();
		jawsTheShark.eat();

		jawsTheShark.age = 212321;

		jawsTheShark.printme();
		
		Ape bobba = new Ape();
		
		bobba.climb();

		Animal[] zoo = { fred, jawsTheShark, peter, bobba };

		for (Animal b : zoo) {
			b.eat();
			System.out.println("test2");
			b.printme();
			
			

		}

		for (int i = 0; i < zoo.length; i++) {

			zoo[i].eat();

		}

	}

}
