package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public interface Desire {


    void hungry();

    void thirsty();

    void procreate();


    default void freedom() {
        System.out.println("Freemdom is given");

    }

}
