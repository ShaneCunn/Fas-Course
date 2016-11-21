package com.shane.cunningham.assignment2;

/**
 * Created by shane on 18/11/2016.
 */
public class Diamond {

    int bottomLoop(int iVar) {
         int k = 1;
        while (k < iVar * 2) { // loop through while less than var i multi by 2
            System.out.print("*"); // print out a bottomLoop
            k++; // increase k by 1 each loop
        }
        return iVar;
    }

    int top(int jVar, int size) {
        while (jVar < size) {

        System.out.print(" "); // print out a space
            jVar++; // increase j by 1

    }
        return jVar;
    }


    int bottomTop(int size, int i){
        int j = size;
        while (j > i) {
            System.out.print(" "); // print out a space
            j--; // increase j by 1

        }
        return size;
    }

}
