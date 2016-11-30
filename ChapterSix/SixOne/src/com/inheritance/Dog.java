package com.inheritance;

/**
 * Created by shane on 29/11/2016.
 */
public class Dog extends Animal {

    String owner;
    String colour;
    boolean sex;


    void breeding() {
        System.out.println("dog breeding");

    }

    void pants() {
        System.out.println("dog panting");

    }


    void eat() {
        System.out.println("dog eating"); // overridden methods

    }

}
