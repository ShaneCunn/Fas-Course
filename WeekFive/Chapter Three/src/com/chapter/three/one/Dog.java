package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Dog {

    String name;
    int age;
    /*
    * this variable  has it own copy of the variables
    * */


    double weight;

    static int packID = 90;

    /*
    *  instance method , every dog has its own copy of this method,
    *  you will be able to access the weight,
    *  name and age of each dog and also packid
    * */

    void eat() {

        System.out.println("before i eat " + weight);
        weight = weight * 2;

        System.out.println("after i eat " + weight);


    }

    static void hunt() {
/*
*  this method applies to the pack of dogs, so it applies to all dogs
*   so there isnt a variable called age to access the age of all dogs,
*   as every dog has a different age, similar for name, similar for weight.
*   this why you can't  access instance variable in a static method
*
* */
        System.out.println("on the hunt with " + packID);
    }
}
