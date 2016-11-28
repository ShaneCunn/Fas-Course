package com.seven;

/**
 * Created by shane on 28/11/2016.
 */
public class Examples {
    static void breaking() {


        for (int i = 0; i < 5; i++) {

            // this prints 5 times

            System.out.println("i is " + i);

            for (int j = 0; j < 4; j++) {
                // this prints 20 times

                System.out.println("j is " + j);

            }
        }
    }


    static void breaking2() {

        for (int i = 0; i < 5; i++) {

            System.out.println("i is " + i);

            // this prints 5 times
            for (int j = 0; j < 4; j++) {
                if (j > 2) {

                    break; // this break out of the inner loop, if great j is greater than 2
                }
                System.out.println("j is " + j);

            }
        }
    }

    static void tail54() {
        String[] programmers = {"Outer", "Inner"};
        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break;
                System.out.print(inner + ":");
            }
        }

    }


    static void Labels() {


        /*
        *
        * you can label blocks of code
        *
        *
        *
        * */

        // it only used with a break or continue
        outer:
        for (int i = 0; i < 4; i++) {


            inner:
            for (int j = 0; j < 8; j++) {

                if (j > 2) {

                    break outer;
                }
            }
        }
    }
}
