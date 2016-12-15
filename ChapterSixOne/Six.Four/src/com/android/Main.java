package com.android;

/**
 * Created by shane on 14/12/2016.
 * <p>
 * <p>
 * Exam objective 7.3 , determining when casting is necessary
 */
public class Main {

    public static void main(String arg[]) {

        byte bnum = 3;
        int num = (int) bnum;
        double dnum = (double) num;
        long lnum = (long) dnum;

        System.out.println(lnum);
        Cat tibbles = new Cat();


        // Dog spot = new Cat();

        // Dog spot = tibbles;
        //  Dog spot = (Dog)tibbles;


        Animal bob = new Animal();
        bob.eat();
        System.out.println("age: " + bob.age + " Name is: " + bob.name);

        // you can cast it a lower class ie derived class, it can do this because it
        //Cow bessie = (Cow) bob;
        hen chicks = new hen();
        Animal[] testArray = {

                bob = new Chicken(),
                new Cow(),
                new Sheep(),
                new Pig(),
                chicks = new hen()

        };

        System.out.println(testArray[0] instanceof Cow);
        System.out.println(testArray[0] instanceof Chicken);
        int numCount = 0;

        for (Animal b : testArray) {
            if (b instanceof Chicken) {

                System.out.println("True");
                System.out.println(Chicken.class.getSuperclass());
            } else if (b instanceof Cow) {
                numCount++;


            } else if (b instanceof Pig) {
                numCount++;


            } else if (b instanceof Sheep) {
                numCount++;


            } else if (b instanceof hen) {
                numCount++;


            }

        }
        System.out.println("Other Animals: " + numCount);

        Animal andy = new Animal();
        Cow daisy = new Cow();

        System.out.println("before casting");
        andy.eat();
        daisy.eat();
/*
* you can't  cast a an animal to be a cow , but you can cast a cow to be an animal,
* which is you can't cast a superclass to be a subclass
* bout you can cast a subclass  to be a superclass
*
*
*/

        andy = (Animal) daisy;
        andy.eat();

        Behaviour behaveDog = new Dog();

        System.out.println("behavior dog interface");


        behaveDog.angry();
        behaveDog.sad();


        Dog myDog = (Dog) behaveDog;

        System.out.println("after casting");

        myDog.Happy();
        System.out.println(myDog.age);

        // cannot call the method happy()
        // as happy method is not in the behaviour interface


        ((Dog) behaveDog).Happy();
    }

}
