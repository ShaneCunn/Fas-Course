package com.inheritance3;

/**
 * Created by shane on 29/11/2016.
 */
public interface movement {

    // this is java 8 only,
    // 2 new feature were added to interfaces
    // setting a default in an interface

    // this a standard  abs method
    void walk();

    // when defining a default method in an interface  you have to use the keyword default, and you have to give the method a body{}
    //

    default void run(){

        System.out.println("i am running");


    }
}
