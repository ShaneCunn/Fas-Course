package Android;

/**
 * Created by shane on 08/11/2016.
 *
 *
 * Exam objective 6.3 Create and overload constructors including impact on default constructors
 */
public class Main {

    public static void main(String args[]){
        // Dog() is calling the constructor in the dog class, that no arguments as we have no arguments,
        // as there is no user define constructors. ie uses the default no argument constructor
        Dog spot = new Dog();

        Cat tomCat = new Cat();

        // this calls the constructor that takes an int
    }

    Cat bob = new Cat(12);

    Cat peter = new Cat(12,"peter",4.5);
    Donkey trump = new Donkey(12, "Trump", 4.5);


    // trump.
    Human fred = new Human(67, "ferd", 67.7, true);

  //  Cow bessie = new Cow();



}
