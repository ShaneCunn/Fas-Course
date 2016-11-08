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
    }
}
