package com.android;

/**
 * Created by shane on 13/12/2016.
 */
public interface InterfaceOne {

    // static method
    static void statMethod1() {
        System.out.println("interface1 and statmethod");

    }

    public void testMethod(); // abstract method

    int testnum();

    default void defaultMETHOD() {

        System.out.println("default method output");
    }
}
