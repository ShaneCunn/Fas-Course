package com.four;

import java.util.ArrayList;

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


            sb = new StringBuilder("harry");

            System.out.println(sb);
        }

        for (StringBuilder sb : sbArray) {


            System.out.println(sb);
        }


    }
}
