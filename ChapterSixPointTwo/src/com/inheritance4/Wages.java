package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public interface Wages {

    void Calc(); //abstract

    default void calcTax() {// default

        System.out.println("calculate tax");
    }

    void calcUSC();// abstract

    static void calcPRSI() {

        System.out.println("prsi cal");

        // a static method in a interface caon only be called in a static way, to call this, we go WAGeS.calcPRSI
    }

    static void test2(){


    }
}
