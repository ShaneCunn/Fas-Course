package com.shane;

/**
 * Created by shane on 19/12/2016.
 */
public class Main {


    public static void main(String args[]) {

        animal bob = new animal();
        Cat fred = new Cat();
        Dog pippa = new Dog();

        // System.out.println(bob.walk(pippa););

        bob.walk(fred);
        pippa.move();


        bike smallBike = new bike();

        smallBike.driving();

        smallBike.stopping();
        smallBike.stopping(12);





    }
}
