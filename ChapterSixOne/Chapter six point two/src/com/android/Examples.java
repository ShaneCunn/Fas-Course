package com.android;

/**
 * Created by shane on 12/12/2016.
 */
public class Examples {

    static void ex2() {

        // to see mutiple implementation g
    }

    static void ex3() {

        Deer bambi = new Deer();

        // deer implements the run interface which extends
        // the move interface. however it cannot  implement another interface

        bambi.landBased();
        bambi.runSpeed();

        System.out.println(bambi.testRand);
        System.out.println(bambi.finalInt);
        System.out.println(bambi.finalnum);
    }

}
