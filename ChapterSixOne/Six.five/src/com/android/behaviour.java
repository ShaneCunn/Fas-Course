package com.android;

/**
 * Created by shane on 15/12/2016.
 */
public interface behaviour {

    // void earn();
    int finalInt = 34;

    default void happy() {

        System.out.println("i am happy");
    }


    void sad();

    void angry();

    // you can this in an interface, but you can only use it inside default methods

    default void callThis() {
        System.out.println(this.finalInt);
        System.out.println("without this " + finalInt);
        // can call other default methods
        this.happy();
        // can call the object itself
        this.sad();
        angry();
    }


}
