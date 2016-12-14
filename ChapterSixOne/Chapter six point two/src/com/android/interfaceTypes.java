package com.android;

/**
 * Created by shane on 13/12/2016.
 */
public interface interfaceTypes {
    // abstract method

    void methodone(); // an abs method has no body

    abstract void method2(); // can have the keyword abstract but is included automatically

// any class implementing this interface , will have to provide implementation for method 1 and 2


    // default method can be also called defender or virtual extender methods

    default void defMethod1() {

        // it always has a body


    }
}

