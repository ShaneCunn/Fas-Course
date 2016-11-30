package com.company;

/**
 * Created by shane on 29/11/2016.
 */
public class Employee extends Person {
    double wage = 90000;
    int hoursWorked = 25;

    void eat() {

        System.out.println("Employee eating");
        super.eat();

    }


    void takesBreaks() {

        System.out.println("Employee taking break");


    }

    void calcTax() {

        System.out.println("Employee taxes are");


    }

}
