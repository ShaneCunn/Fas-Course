package com.android;

/**
 * Created by shane on 12/12/2016.
 */
public interface Behaviour {

    void sad();

    public abstract void happy();

    default void mad() { // the default impletemention must  be used with {} brackets with the keyword default


        System.out.println("i am mad");
    }




}
