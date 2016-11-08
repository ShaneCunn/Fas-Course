package com.android;

/**
 * Created by shane on 08/11/2016.
 *
 *
 * Create methos with arguments and return values; including overloaded methods
 *
 * overloaded method is a method that has the same name  but a differnt parameter list or different order of parameters
 *
 */
public class Main {


    public static void main (String args[]){
        Animal myAnimal = new Animal();

        // printlc() is a overloaded  method that can take any data type and any object
        System.out.println(myAnimal);

        Dog fred = new Dog();
        fred.drink();

        Phone sammie = new Phone();
        double dnum = 2;
        int num = 3;
        //sammie.call(2, 3.0);  this will not as it can't determine which call methods to use as one
        // takes a double and an int the other takes a int and a double
        //
        sammie.call(dnum, num);
        Message myMessage = new Message();

        Tablet myTablet = new Tablet();

        myMessage.read(new Tablet());

        myMessage.read(new PC());

        myMessage.read(new Phone());
    }
}






















