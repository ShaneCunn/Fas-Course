package com.three.one.two;

/**
 * Created by shane on 08/11/2016.
 */
public class Person {


    int age;
    String name;

    //  variable arguments,  the ... means we can pass as many int variable as you like.
    int daysWorked(int... days) {

        int count = 0;

        for (int i = 0; i < days.length; i++) {

            System.out.println("number is :" + days[i]);
            count++;
        }
        return count;
    }


    void holidays(String type, int... num) { //IMPORTANT: vars have to be the last argument


    }

    //void holidays2( int... num(String type)) { // have to be last, won't work otherwise

    //void test(int... num, int... sdasd) //

    }
