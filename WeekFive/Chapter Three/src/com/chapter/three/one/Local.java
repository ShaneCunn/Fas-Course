package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Local {


    void accessLocal() {

        double dnum = 0;

        System.out.println(" dnum value :" + dnum);


        int age = 19;

        if (age > 19) {

            /*this is a local variable , that is available inside these brackets, ie inside the curly brackets*/

            double weigth = 34.5;

        }

        /* as soon you are outside the curly brackets
        * , we can no longer access the weight*/


        else {
            /*
            *  height is a local  to these curly brackets
            *
            * */
            double height = 45.6;
        }

       // System.out.println(weight);
       // System.out.println(height);
    }

}
