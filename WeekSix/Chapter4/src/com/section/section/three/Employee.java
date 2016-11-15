package com.section.section.three;

/**
 * Created by shane on 15/11/2016.
 */
public class Employee implements Behaviour {
    @Override
    public void mad() {

        System.out.println("Employee is mad");


    }

    @Override
    public void happy() {
        System.out.println("Employee is happy");

    }

    @Override
    public void sad() {
        System.out.println("Employee is sad");

    }
}
