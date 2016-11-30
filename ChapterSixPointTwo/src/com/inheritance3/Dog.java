package com.inheritance3;

/**
 * Created by shane on 29/11/2016.
 */
public class Dog implements Behaviour{

    int age;
    String name;


    @Override
    public void angry() {

    }

    @Override
    public int happy(int num) {
        return 0;
    }

    @Override
    public void sad() {

    }

    @Override
    public double mad(double dnum) {
        return 0;
    }
}
