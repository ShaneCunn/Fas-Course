package com.Two.five;

import java.util.ArrayList;

/**
 * Created by shane on 03/11/2016.
 */
public class Examples {


    static void Wrappers() {

        Integer myInt = new Integer(3);
        Integer myInt2 = 4;
        Integer myInt3 = new Integer("12");
        Integer myInt4 = Integer.valueOf(45);

        /*
        * why use a wrapper class
        *  it treats a basic data type as an object,
        *  so you can call methods for each object
        * */

        // calling a method from the integer class

        myInt.intValue();


        // basic data type do not have methods

        int num = 67;

        /* you can't  add basic data  types to an arraylist
        *  you can only add objects to a arraylist */

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(23);

        System.out.println("the num list is " + numList);
        /*
        *
        * autoboxing is the automatci conversion of a primitive data type
         *to an object of the right wrapper class
        * */


    }
}


