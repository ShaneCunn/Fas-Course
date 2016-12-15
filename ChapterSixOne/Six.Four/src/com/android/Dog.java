package com.android;

/**
 * Created by shane on 14/12/2016.
 */
public class Dog implements Behaviour {


    int age = 12;

    void Happy() {
        System.out.println("Dog is happy");
    }

    @Override
    public void angry() {
        System.out.println(" dog angry");
    }

    @Override
    public void sad() {
        System.out.println("dog sad");
    }
}


