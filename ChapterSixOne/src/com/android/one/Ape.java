package com.android.one;

/**
 * Created by shane on 12/12/2016.
 */
public class Ape {
    // every ape will have the age 45
    int age = 45;

    void eat() {

        System.out.println("ape eating");
    }


    void drink(int num, String name) {


    }


    void happy() {

        System.out.println("ape is happy");


    }
}

class Human extends Ape {
    // every human will have the age 23, ie it is hidden
    int age = 23;

    void eat() {

        System.out.println("human eating");
    }

    @Override
    void drink(int num, String name) {


    }
// this a polymorphism method
    void happy(int num) {

        System.out.println("human is happy and num is " + num);


    }
}
