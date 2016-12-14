package com.android;

/**
 * Created by shane on 14/12/2016.
 * <p>
 * <p>
 * Develop code that shows the use of polymorphism
 * including overridding and object ype versus reference type
 */
public class Employee {

    int age;
    String name;

    String PPS = "999999a";


    void earn() {
        System.out.println("emp earns");

    }

    void holiday() {

        System.out.println("Emp holiday");
    }
}

class accountant extends Employee implements Work {

    String[] qualifications = {"cpa", "cfa"};


    @Override
    public void clockIn() {
        System.out.println(" i am accountant i don't clock in");
    }

    void earn() {

        System.out.println("acc earning ");
    }

    void fiddleTheBook() {

        System.out.println("accountant fiddling");
    }
}


class fireman extends Employee implements Work {


    @Override
    public void clockIn() {
        System.out.println(" fireman clockin");
    }

    void extinguish() {
        System.out.println(" put out fire");

    }
}
