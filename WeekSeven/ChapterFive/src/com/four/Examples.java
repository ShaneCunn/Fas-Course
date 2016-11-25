package com.four;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shane on 25/11/2016.
 */
public class Examples {


    static void ex1() {


        ArrayList<String> strList = new ArrayList<String>();


        strList.add("mary");
        strList.add("patsy");
        strList.add("harry");
        strList.add("bridie");
        //   strList.add("mary");


        for (String p : strList) {


            System.out.println(p);
        }
        String[] nameList = {"mary", "patsy", "harry", "bridie"};


        for (String p : nameList) {

            System.out.println(p);
        }


        int[] numArray = {34, 56, 67, 78, 89, 99};

        for (int num : numArray) {
            System.out.println(num);

        }

        StringBuilder[] sbArray = {new StringBuilder("timm"), new StringBuilder("george"), new StringBuilder("sarah")};

        for (StringBuilder sb : sbArray) {

// with a enhanced for loop, you can't change values
            sb = new StringBuilder("harry");

            System.out.println(sb);
        }

        for (StringBuilder sb : sbArray) {
            System.out.println(sb);
        }


        for (int num : numArray) {
            num = 23;
        }

        //for primitive  date types you can't change the values in an enhanced for loop
        for (int num : numArray) {
            System.out.println(num);
        }


        for (StringBuilder sb : sbArray) {

            sb.append(" Lally");

            System.out.println(sb);
        }

        // can't be used to init a array and modify its elements, you use a normal for loop instead

        // can't be used to delete or remove from an arraylist

        // you can't init a array inside a enhanced for

        int[] myArray = new int[5];

        for (int myInts : myArray) {

            myInts = 2;


        }

        for (int myints : myArray) {

            System.out.println(myints);
        }


        for (int myInts : myArray) {

            for (int i = 0; i < myArray.length; i++) {

                myInts = 2;
            }
            //  System.out.println(myInts);
        }

        for (int myints : myArray) {
            System.out.println("part 2");
            System.out.println(myints);
        }


        int[] numArray1 = {2, 3, 4, 5, 6};
        int[] numArray2 = {9, 8, 7, 6, 5, 4};

        for (int i = 0; i < numArray1.length; i++) {

            System.out.println(numArray1[i]);
            System.out.println(numArray2[i]);


        }

        String[] names1 = {"harry", "george", "mary"};
        String[] names2 = {"harry2", "george2", "mary2"};
        String[] names3 = {"harry3", "george3", "mary3"};


        String[][] name2DList = {names1, names2, names3};

        for (int rows = 0; rows < name2DList.length; rows++) {
            for (int columns = 0; columns < name2DList[rows].length; columns++) {

                System.out.print(name2DList[rows][columns] + "\n");
            }
            System.out.println();
        }

        // my enhanced for loop
        for (String[] row : name2DList) {
            //   System.out.println();
            System.out.println(Arrays.deepToString(row) + "\n");


        }
        //  to go through a 2/3d array of strings
        for (String[] nameArr : name2DList) {
            // for each one of hte arrays of strings
            // we use a string to ireate through it
            for (String name : nameArr) {

                System.out.println("part3 " + name);
            }
        }
    }
}
