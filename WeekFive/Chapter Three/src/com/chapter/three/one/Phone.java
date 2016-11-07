package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Phone {

    int weight;
    String name = "Apple"; // instance variable
    //static String name = "Samsung"; //  static variable
    static String colour = "black"; // all our phone are black in colour,

    /*
    * two variable with the same name, one is static, can't be defined in the same  class
    * */

  /*  void dialup(int number) {

        // local variable and methods parameters can't be defined with the same name
        int number = 10; // local var called int number


    }*/


    void dailUP() {
        // local variable with the same name as a the instance variable or class variable is allowed
        // this is called shadowing
        String name = "samsung";

        String colour = "blue";
        System.out.println(name);
        System.out.println(colour);


    }

    void call(){
// it has no string
        System.out.println(name);
        System.out.println(colour);

       // System.out.println("test super" + );
    }


}
