package com.android;

/**
 * Created by shane on 15/12/2016.
 */
public class Ape {


    int age;
    String name;


   /* Ape() {


    }*/

    public Ape(int age, String name) {
        this.age = age;
        this.name = name;
    }
}


class human extends Ape {

    human() {

        super(23, "jenny");
    }

   /* human(int test, String name2){
        this.age = test;
        this.name = name2;

    }*/
}