package com.shane;

import java.util.ArrayList;

/**
 * Created by shane on 16/12/2016.
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("hello shane");

        ArrayList<Integer> arrayListTEST = new ArrayList<Integer>();


        arrayListTEST.add(45);
        arrayListTEST.add(65);

        arrayListTEST.add(67);
        arrayListTEST.add(78);

        for (int value : arrayListTEST) {

            System.out.println("the values are :" + value);
        }


        ArrayList<String> arrayListString = new ArrayList<String>();


        Box<Integer> myBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        arrayListTEST.forEach(valve -> System.out.println("values are :" + valve));
        arrayListString.forEach(value -> System.out.println("removed number" + value.startsWith("S")));
    }
}
