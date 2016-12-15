package com.android;

/**
 * Created by shane on 15/12/2016.
 */
public class Employee {
    int age = 23;
    String name = "tim";


    Employee() {

        System.out.println("blank constructor called");
    }

    Employee(int age, String name) {
        System.out.println("constructor that takes an  int and string ");
        this.age = age;
        this.name = name;

        System.out.println();

        System.out.println("second constructor called ");


    }

    void earn() {

        System.out.println("EMP Earns money");
    }

    void duties() {
        earn();
        System.out.println("");
    }


    Employee(int age) {
        //name = "pat";

        //this.age = age;

        this(age, "patsy2");

        // System.out.println("name is :");

    }
}

class accountant extends Employee implements behaviour {
    int age = 45;
    String name = "mary";

    @Override
    void earn() {
        super.earn();


    }

    @Override
    public void sad() {
        System.out.println(" acc sad");
    }

    @Override
    public void angry() {
        System.out.println(" acc angry");

    }
}
