package com.shane;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * Created by shane on 19/12/2016.
 */
public class Examples {


    static void ex1() {


        int[] intList = {1, 2, 3, 4};


        for (int a : intList) {

            System.out.println(a);
        }

        for (int i = 0; i < 6; i++) {

            System.out.println(intList[5]);
        }


    }


    static void ex2() {
        ArrayList<Integer> intlist = new ArrayList<>();

        intlist.add(23);
        intlist.add(45);
        intlist.add(56);
        intlist.add(67);
        System.out.println(intlist.get(5));


    }


    static void ex3() {

        dog spot = null;
        dog lassie = new dog();

        System.out.println(spot);

        System.out.println(spot.age);

    }

    static void ex6() {

        // Check Exception

        //  we are going to excue some code in here, and if the code generate an exception
        try {

            // this will catch the exception and deal with it, it will print it out the exception
            File newFile = new File("Shane.txt");
            FileInputStream fis = new FileInputStream(newFile);

            System.out.println("File created");


        } catch (Exception e) {

            System.out.println("Exception is: " + e);
        }


    }

}
