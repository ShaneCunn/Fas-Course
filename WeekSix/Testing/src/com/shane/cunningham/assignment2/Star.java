package com.shane.cunningham.assignment2;

/**
 * Created by shane on 17/11/2016.
 */
public class Star {


    public static void StarGenerator(int size) {

        Diamond Looper = new Diamond();
        int i, j;

        for (i = 1; i <= size; i++) { // outer loop through until it is less than or equal to the size variable

            Looper.top(i, size);

            
            Looper.star(i);
            System.out.println();// print a new line at the end of the loop
        }
        for (i = (size - 1); i >= 1; i--) {// outer loop through until it is greater than or equal to the size variable,

            Looper.bottomTop(size, i);

            Looper.star(i);
            System.out.println();// print out a new line
        }
    }
}


