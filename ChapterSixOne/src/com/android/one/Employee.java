package com.android.one;

/**
 * Created by shane on 12/12/2016.
 */
public class Employee {
    // its available in all classes
    public int age;

    // package private, avaailable only in the same package
    String name;
    // available only in the same classe
    protected String email = "me@nonone.com";

    private int phoneNum = 1234556;


    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void work() {

        System.out.println();
    }

    void sendinvite(Employee emp) {

        System.out.println("employee name is: " + emp.name);
    }

    public Employee() {


    }


}


class Fireman extends Employee {


    public Fireman(int age, String name) {
        super(age, name);
    }

    void rescue() {

        System.out.println("Fireman rescue");
    }

    void safetyQ() {

        System.out.println("Fireman safety qualifiications");

    }

}
