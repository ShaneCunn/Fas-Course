package com.android.one;

/**
 * Created by shane on 12/12/2016.
 * <p>
 * can,t createa an instance of abs class, so i can't create a plant,flower or roase,
 * but  you can of Englishrose as it a Concrete Class
 */
public abstract class Plant {


    int height;
    String name;


    void grow() {

        System.out.println("plant growing");
    }

    void shed() {
        System.out.println("plant shedding");


    }


}

abstract class Flower extends Plant {

    abstract void pollyinate(); // abstract method has no body

}


abstract class rose extends Flower {

}


class EnglishRose extends rose { // once it reach a non abs class it has to impletement it  ie concrete method
    @Override
    void pollyinate() {

    }
}


