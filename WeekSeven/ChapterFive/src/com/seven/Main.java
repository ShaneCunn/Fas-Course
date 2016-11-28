package com.seven;

/**
 * Created by shane on 28/11/2016.
 * <p>
 * Exam objective 5.5  use break and continue
 * <p>
 * <p>
 * break and continue are mainly used to brak out of loops, but are also used in switch statement
 * <p>
 * break breaks out of the loop
 * <p>
 * continue  break out of the current iteration of hte loop and continues with the next iteration
 */
public class Main {

    public static void main(String args[]) {

        for (int i = 0; i < 11; i++) {

            //  System.out.println("nums is: " + i);

            if (i > 5) {
                break;
                // when i get to 5 it exit the loop completely
            }

            System.out.println("nums is: " + i);

        }


        for (int i = 1; i < 14; i++) {

            if (i % 2 == 1) {

                continue;// if any number  is odd in this if statement then exit the loop in this current loop


                /*
                * if the reminader is 0 the modulus is 0, which means the number divided by two the remainer is 0; so if anumber
                *
                *
                * */

            }

            System.out.println("even num is: " + i);

        }

        //  Examples.breaking();
     //   Examples.breaking2();
        Examples.tail54();
    }


}
