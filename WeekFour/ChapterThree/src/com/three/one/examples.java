package com.three.one;

/**
 * Created by shane on 03/11/2016.
 */
public class Examples {


   static void local() {
        /*
        *
         * non static can both types of variables
         *
         * if you define variable inside {} it becomes a local variable to that section of code
        *
        * */
        int age = 4;
        if (age < 18) {

            String name = "shane"; // local variables
            System.out.println("hello " + name);
        } else {

            String name = "patsy";// local variable
            System.out.println("hello " + name);
        }
        // System.out.println("name =" + name);


    }
}
