package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 * <p>
 * mulitple inheritance is not allowed in java, bt  multiple implementation of interfaces is allowed
 */
public class Cat implements Desire {


    // this is new in java 8 , we are providing  a default implementation for this methods



    @Override
    public void hungry() {

    }

    @Override
    public void thirsty() {

    }

    @Override
    public void procreate() {

    }
}
