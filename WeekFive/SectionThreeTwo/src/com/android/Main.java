package com.android;

/**
 * Created by shane on 07/11/2016.
 */
public class Main {


    /*
    * Exam objective 2.4 explain an object's lifecycle creation , dereference by reassignment and garbage collection
    *
    *
    * */
    public static void main(String args[]) {
        System.out.println("test out");


        /*
        * declares a variable of type person , it does not  create a person
        * */
        //  Person bob;

        // an object is  only created when a reference var is initialised

        //  Person fred = new Person();

        //   Person paul = new Person();

        //  Person john = new Person();
        //  fred = paul;
        //    Person patsy;
        //   patsy = paul;

        // you can't reference this, it has no name , its still created and is liable for garage collection


        Person paul = new Person();

        Person peter = new Person();

        Person patsy = peter = paul;

        peter = new Person();

        patsy = peter;
        paul = new Person();

    }
}
