package com.android;

/**
 * Created by shane on 10/11/2016.
 */
public class Questions {


    static void Q5() {


        Dog spot = new Dog();
        spot.name = "spot2";

        System.out.println("name outside method is  " + spot.name);

        Change.ChangeDogName(spot);

        System.out.println("After method");

        System.out.println(spot.name);

        System.out.println("address outside method " + spot);

    }
}
