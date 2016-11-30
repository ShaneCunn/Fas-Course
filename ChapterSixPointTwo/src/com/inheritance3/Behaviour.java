package com.inheritance3;

/**
 * Created by shane on 29/11/2016.
 */

// an interface is a purely abstract class, but isn't anymore.
public interface Behaviour {

    abstract void angry();

    int happy(int num);

    // by default all methods in an interface are public and abstract
    public abstract void sad();


    double mad(double dnum);


}
