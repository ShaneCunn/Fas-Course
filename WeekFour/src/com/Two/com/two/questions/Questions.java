package com.Two.com.two.questions;

/**
 * Created by shane on 04/11/2016.
 */
public class Questions {


    static void question1() {

        int myChar = 97;
        int yourChar = 98;
        /*
        *  if string in output, promotes all to string
        *
        * */

        String test = "";
        System.out.println(myChar + yourChar);//if you use no string in a print statement  and you use math function such as + - * / ,
        // it  will automatically cast them to int


        System.out.print((char) myChar + (char) yourChar);
        int age = 20;
        System.out.print(" ");
        System.out.print((float) age);

    }

    static void question4() {

        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);
        System.out.print(buy == sell);
        boolean buyPrim = buy.booleanValue();
        System.out.print(!buyPrim);


    }

    static void question5() {

        short a2 = 0512;
        double b23 = 10;
        byte a34 = -0;

        long a9 = 123456789;


    }
}
