package com.shane.cunningham.assignment2;

/**
 * Created by shane on 18/11/2016.
 */
class Diamond {

    void bottomLoop(int iVar) {
         int k = 1;
        while (k < iVar * 2) { // loop through while less than var i multi by 2
            System.out.print("*"); // print out a bottomLoop
            k++; // increase k by 1 each loop
        }
    }

    void top(int jVar, int size) {
        while (jVar < size) {
        System.out.print(" "); // print out a space
            jVar++; // increase j by 1

        }
    }


    void bottomTop(int size, int i) {
        while (size > i) {
            System.out.print(" "); // print out a space
            size--; // increase j by 1

        }
    }

}
