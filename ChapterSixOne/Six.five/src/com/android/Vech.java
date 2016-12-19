package com.android;

/**
 * Created by shane on 15/12/2016.
 */
public class Vech {

    int range;
    String name;
    static int count = 0;

    // constructor 1
    Vech() {
        System.out.println("Vech blank constructor called");
        count++;
    }

    // constructor 2
    Vech(int range, String name) {
        count++;

        this.name = name;
        this.range = range;

        System.out.println("vech constructor , that takes int and a string called ");
    }


    static void statMEthod() {

        System.out.println("stat method called ");
    }
}


class Car extends Vech {

    Car() {
        super();
        System.out.println("car blank constructor");
    }
}

class Boat extends Vech {
    Boat(int range, String name) {
      /*  super.range = 450;
        super.name = "bob23";*/

        super(450, "bob45");
        // Boat.name =name;

        //  super();
        System.out.println("boat blank constructor");

        System.out.println(range + name);
    }

}

class Ferrai extends Car {

    Ferrai() {
        //    super();

        System.out.println("ferrai called ");


    }
}