package com.android;

/**
 * Created by shane on 08/11/2016.
 */
public class Ape {


    double weight;
    int age;

    void walk() {


    }

    void walk(int num) {

        System.out.println("Ape walking");


    }
}


class monkey extends Ape {
    boolean treeDwelling;
// overridden
    void walk() {


    }
// overloaded

    void walk(String str) {


    }


    void walk(int num) {

        System.out.println("Monkey walking");
    }

}

class Chimp extends monkey {


    class Human extends Ape {


    }
}
