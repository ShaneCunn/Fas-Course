package com.android;

/**
 * Created by shane on 10/11/2016.
 */
public class Main {

    public static void main(String args[]) {


        Animal test = new Animal();

        test.name = "bob";

        System.out.println(test.name);
        Animal andy = new Animal();

        andy.name = "joe";
        // send this animal to the change animal method

        System.out.println(andy + " the name is: " + andy.name);

        andy.changeAnimal(andy);

        // print out the address of animal
        Questions.Q5();




    }
}
