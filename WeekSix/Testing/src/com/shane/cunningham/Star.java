package com.shane.cunningham;

/**
 * Created by shane on 17/11/2016.
 */
public class Star {


    public static void starTest(int size) {


        int i, j, k;
        for (i = 1; i <= size; i++) { // outer loop through until it is less than or equal to the size variable
            for (j = i; j < size; j++) {// use the loop to add a spaces
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {// uses the loop to add *  multi by 2
                System.out.print("*");
            }
            System.out.println();// print a new line at the end of the loop
        }
        for (i = (size - 1); i >= 1; i--) {// outer loop through until it is greater than or equal to the size variable,
            // keep decreasing  j
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {// uses the loop to add *  multi by 2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


