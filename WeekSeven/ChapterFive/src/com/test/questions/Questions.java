package com.test.questions;

/**
 * Created by shane on 28/11/2016.
 */
public class Questions {


    public static void q1() {
        int i = 10;
        do
            while (i < 15)

                i = i + 20;

        while (i < 2);
        {
            System.out.println(i);
        }
    }

    public static void q2() {
        int i = 10;
        do
            while (i++ < 15)

                i = i + 20;

        while (i < 2);
        {
            System.out.println(i);
        }
    }

    public static void q3() {

        int[] testarray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0, j = 0; i < 10; i++, j++) {

            System.out.println("j num is: " + j);
            for (int test : testarray) {

                System.out.println("numb is : " + test);
            }

        }

        while(testarray.length <0){

            
        }



    }
}
