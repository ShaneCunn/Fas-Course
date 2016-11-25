package com.five;

/**
 * Created by shane on 25/11/2016.
 */
public class Examples {


    public static void ex1() {
        int age = 12;

        while (age <= 18) {

            System.out.println("your age is " + age);
            age++;
        }

        boolean bunsAvailable = true;
        int count = 0;
        while (bunsAvailable) {


            System.out.println("nice buns");
            count++;
            if (count > 4) {

                bunsAvailable = false;
            }
        }


        // will always excute once
        do {
            System.out.println("you are over 18");
            age++;
        } while (age > 18);


    }
}
