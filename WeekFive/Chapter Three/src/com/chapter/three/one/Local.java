package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Local {

    private String name = "mary";

    protected String address = "Galway";

    /*
    *  class variable or static variable a static variable belongs
    *
    * */
    static int examID = 45;

    void accessLocal(int number) {// this is a method parameter, is also available through accessLocal

        double dnum = 24;

        /*
        *  this is called a "FORWARD STATEMENT"
        *
        *   which is not allowed , and will not compile
        *
        *   local can be as long a method parameter , but never longer
        * */
        double dnum2 = 20;





        System.out.println(" dnum value :" + dnum);


        int age = 19;

        if (age > 19) {

            /*this is a local variable , that is available inside these brackets, ie inside the curly brackets*/

            double weight = 34.5;

            System.out.println("the wieght is :" + weight);


        }

        /* as soon you are outside the curly brackets
        * , we can no longer access the weight*/


        else {
            /*
            *  height is a local  to these curly brackets
            *
            * */
            double height = 45.6;
            System.out.println("the hieght is:" + height);
        }

        // System.out.println(weight);
        // System.out.println(height);


        for (int i = 0; i < 4; i++) {

            System.out.println(" i is " + i);
            if (i < 2) {
/*
*  i is
* */
                int j = 1;

                System.out.println("j is :" + j);


            }
            {
/*
*  the code below is always going to  execute,  however the  variable  is only available inside the brackets
* */
                int only = 0;

                System.out.println("prints only: " + only);
                System.out.println("prints only: " + only);

            }
        }


    }


    void accesMethod(int num, double dnum) {

        /*
        *  method parameter are only accessiable  only through in the method that defines them the scope of a method parameter ,
         *  may be as long as a that of a local variable or longer , but can never be shorter
        * */

        int localInt = 4;

        System.out.println("num is " + num);

        System.out.println("dnum  is :" + dnum);

        System.out.println("local is " + localInt);


        for (int i = 0; i < 2; i++) {

            // local variable i, only available to the for loop
            System.out.println("i is: " + i);
            System.out.println(dnum + "\n" + localInt + "\n" + num);


        }
    }

    void accessStatic() {

        System.out.println(name);
        System.out.println(address);
        System.out.println(examID);

    }

    static void accessStatic2() {

        // System.out.println(name);
        //  System.out.println(address);

        /*
        *  can't access address  or name in a static method as both variable are non static instance variable
        *
        * */
        System.out.println(examID);


    }

}

























