package com.shane.cunningham;

/**
 * Created by shane on 17/11/2016.
 */
public class Star {


    public static void StarGenerator(int size) {


        int i, j, k;

        for (i = 1; i <= size; i++) { // outer loop through until it is less than or equal to the size variable

            j = i; // set j to 1
            while (j < size) {

                System.out.print(" "); // print out a space
                j++; // increase j by 1

            }

            k = 1;// set  k to 1,
            int bigger = i * 2;

            while (k < bigger) { // loop through while less than var i multi by 2
                System.out.print("*"); // print out a star
                k++; // increase k by 1 each loop
            }

            System.out.println();// print a new line at the end of the loop
        }
        int smallerSize = size - 1;
        for (i = smallerSize; i >= 1; i--) {// outer loop through until it is greater than or equal to the size variable,
            // keep decreasing  j


            j = size; // set j to equal size variable
            while (j > i) {// while j is greater than i , keeps looping

                System.out.print(" "); // print a space
                j--; // decreases j by 1
            }

            int bigger = i * 2;
            k = 1; // set  k to 1,
            while (k < bigger) {
                System.out.print("*"); //  print out a star
                k++; // increase k by 1
            }
            System.out.println();// print out a new line
        }
    }
}


