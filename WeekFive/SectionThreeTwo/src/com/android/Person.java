package com.android;

/**
 * Created by shane on 07/11/2016.
 */
public class Person {

    static int counter = 0;
    int age;

    Person() {

        System.out.println("new person created ");
        counter++;
        System.out.println("counter is " + counter);
    }

    Person(int age) {
        this.age = age;
    }

    void outOfScope() {


        /*
        * outside of the brackets phil  is liable for garbage collection, as we can no longer access this
        * */

        {

            Person phil = new Person();

            System.out.println(phil);
        }

        // phil is inaccessible



    }
}
