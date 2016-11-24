package com.shane.cunningham.assignment2;

/**
 * Created by shane on 17/11/2016.
 */
class Star {


    public static void StarGenerator(int size) {

        Diamond Looper = new Diamond(); // create a new diamond object and call Looper

        for (int i = 1; i <= size; i++) { // outer loop through until it is less than or equal to the size variable

            Looper.top(i, size); // pass in the value of i and size and sent it to the top loop in looper




            Looper.bottomLoop(i); //  pass in the value of i and sent it to the bottom loop

            System.out.println();// print a new line at the end of the loop
        }
        for (int i = (size - 1); i >= 1; i--) {// outer loop through until it is greater than or equal to the size variable,

            Looper.bottomTop(size, i);// pass in the value of i and size and sent it to the top loop in looper

            Looper.bottomLoop(i);//  pass in the value of i and sent it to the bottom loop
            System.out.println();// print out a new line
        }
    }
}


