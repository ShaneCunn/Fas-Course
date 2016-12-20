package com.shane;

/**
 * Created by shane on 20/12/2016.
 */
public class Trace {

    static void ex1() {
        System.out.println("method 1");
        ex2();
    }

    static void ex2() {
        System.out.println("method 2");
        ex3();

    }

    static void ex3() {
        System.out.println("method 3");
        int[] numList = {1, 2, 3, 4};

        System.out.println(numList[4]);
    }
}
