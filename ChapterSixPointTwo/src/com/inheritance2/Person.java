package com.inheritance2;

/**
 * Created by shane on 29/11/2016.
 */ // can't  create a instance  of this class, ie use the new keyword
public abstract class Person {

    abstract void eat();
}

class Employee extends Person {


    @Override
    void eat() {

    }
}


class Accountant extends Employee {

// if a concrete class extends a abs calss , the impletmentation must be provided
}


