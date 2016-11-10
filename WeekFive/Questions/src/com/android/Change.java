package com.android;

/**
 * Created by shane on 10/11/2016.
 */
public class Change {

    static void ChangeDogName(Dog spot) {
        spot.name = "tim";


    }

    static void ChangeDog(Dog spot) {
        spot = new Dog();


        System.out.println("address of dog " + spot);
    }

    static void ChangeDogNoName(Dog spot) {
        spot = new Dog();


        spot.name = "jimmy";


    }


}
