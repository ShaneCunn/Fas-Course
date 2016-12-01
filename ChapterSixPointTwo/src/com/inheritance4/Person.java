package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */

// you can create a instantiate  or object of this class as it abstract
public abstract class Person {
    Person() {

        System.out.println("person constructor");
    }

    abstract void eat();

    // a abstract method has no body, it always defined with the keyword abstract
    // A class become abstract, as soon you create a abstract method inside it.
    // if you delete the abstract from it, you get an error.
    // however you can have a concrete method inside a abstract class

    void drinking() {

        System.out.println("person drinking");
    }
}


abstract class Employee extends Person {


    void wages() {


    }


}


class Doctor extends Employee {

    // if a concrete class extends a abstract call as all abstract methods  contained in the chain have to be implemented

    // it forces the doctor class  to create it won concrete method
    @Override
    void eat() {

        System.out.println("doctor eating");

    }
}
