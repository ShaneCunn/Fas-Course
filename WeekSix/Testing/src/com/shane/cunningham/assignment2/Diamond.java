package com.shane.cunningham.assignment2;

/**
 * Created by shane on 18/11/2016.
 */
public class Diamond {

    int star(int star){

         int k = 1;
        int i = star;
        while (k < i  * 2) { // loop through while less than var i multi by 2
            System.out.print("*"); // print out a star
            k++; // increase k by 1 each loop
        }
        return star;
    }

    int top(int test1, int size){

        int j = test1;
    while (j < size) {

        System.out.print(" "); // print out a space
        j++; // increase j by 1

    }
    return test1;
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
