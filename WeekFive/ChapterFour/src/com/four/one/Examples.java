package com.four.one;

/**
 * Created by shane on 10/11/2016.
 */
public class Examples {


    static void ex1() {


        // this is all about creating String
        // when you create a string by assigning  a value, you place the text in what is called the STRING POOL,
        // so the name shane is place in the pool
        String name = "Shane";
        String str1 = new String("paul");

        String str2 = new String("paul");

        // every time a new string is created by assigning a value, it first checks to seee ift already exists.
        // if it does it assign the value in the pool to the new string  reference
        System.out.println(str1==str2);// this checks the value
        System.out.println(str1);
        System.out.println(str1);

        String name2 = "Shane";




    }
}
