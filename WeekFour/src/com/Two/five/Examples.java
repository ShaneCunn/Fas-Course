package com.Two.five;

import java.util.ArrayList;

/**
 * Created by shane on 03/11/2016.
 */
public class Examples {


    static void Wrappers() {

        Integer myInt = new Integer(3);
        Integer myInt2 = 4;
        Integer myInt3 = new Integer("12");
        Integer myInt4 = Integer.valueOf(45);

        /*
        * why use a wrapper class
        *  it treats a basic data type as an object,
        *  so you can call methods for each object
        * */

        // calling a method from the integer class

        myInt.intValue();


        // basic data type do not have methods

        int num = 67;

        /* you can't  add basic data  types to an arraylist
        *  you can only add objects to a arraylist */

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(23);

        System.out.println("the num list is " + numList);
        /*
        *
        * autoboxing is the automatically conversion of a primitive data type
         *to an object of the right wrapper class
        * */

        /* creating a wrapper by assignment
        *  assign a primitive value to a wrapper  class variable (autoboxing)
        * */

        Double myDouble = 2.34;// this is a creating the wrapper class Double
        double Dnum = 12.456; // this is the primitive version
        Double myDouble2 = Dnum;
        System.out.println("double num is: " + myDouble2.doubleValue());


        /*
        *  this list can take any type of number as all wrapper classes inherit from the number class
        *
        *
        * */


        Dog spot = new Dog(); // this calls the blank constructor
        Dog lassies = new Dog(23); // this call the constructor that takes an int


        /* with an wrapper classes there are 2 constructors ,
        * one that take a primitive value and
         *
         * one that takes String value,
         * the latter  does not work Characters
         *
         *  this is a calling the constructor that takes an int
         * */


        Integer number = new Integer(12);
        /*
        * this is calling the constructor in the Integer class that takes a string
        * and converts that  string to an integer
        */

        Integer number2 = new Integer("123");

        Boolean myBool = new Boolean("True");
        /*
        *
        *  can't do this as this is a Character and it can't take an String
        * */
        // Character myCharActer = new Character("a");
        Character myCharActer = new Character('a');


        /*
        * create wrapper by using static methods of the wrappers classes
        * */

        Boolean myBool2 = Boolean.valueOf(true);

        /*
        *  you create a wrapper by using static method by passing a string value
        * */

        Boolean myBool3 = Boolean.valueOf("true");

        Integer statInt = Integer.valueOf(12);

        // cannot do this with a character

        int numtest = new Integer(12); // example of unboxing


        System.out.println("test out :" + numtest);

        int newNum = myInt;

        /*
        * Parser are for converting string to numbers,  and booleans, there is no parser for Char ie character
        *
        * */

        String strNum = "123";

        System.out.println(Integer.parseInt(strNum));

        int value = Integer.parseInt(strNum);

        double dValue = Double.parseDouble("123.456");

        boolean myboolean = Boolean.parseBoolean("FalSe");

        System.out.println(myboolean);
        /*
        * if you want to convert from a string to wrapper, we do the following
        *
        * */

        Integer wrapInt = Integer.valueOf("123");
        int value2 = Integer.parseInt(strNum, 34);

        System.out.println(value2);


    }


    static void compareWrapper(){

        
    }
}


