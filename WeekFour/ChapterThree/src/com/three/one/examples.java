package com.three.one;

/**
 * Created by shane on 03/11/2016.
 */
public class examples {


    static void local() {
        /*
        *  if you define variable inside {} it becomes a local variable to that section of code
        *
        * */
        int age = 4;
        if (age < 18) {

            String name = "shane"; // local variables
            System.out.println("hello" + name);
        } else {

            String name = "patsy";// local variable
            System.out.println("hello" + name);
        }
    }
}
