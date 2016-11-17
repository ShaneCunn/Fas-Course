package com.section.section.three;

/**
 * Created by shane on 15/11/2016.
 */
public abstract class Animal {
    int age = 5;

    int test5;
    void eat() {


    }

    abstract void drink();


}

class monkey extends Animal {

    int iq;
    @Override
    void drink() {
        System.out.println("monkey drinking");
    }

    void climb() {

        System.out.println("monkey climbing");
    }
}


class hippo extends Animal {
    double speed;


    @Override
    void drink() {
        System.out.println("Hippo drinking");
    }

    void swim() {

        System.out.println("hippo swimming");
    }
}

class Bird extends Animal {

    boolean migrate;

    @Override
    void drink() {
        System.out.println("Bird drinking");
    }

    void fly() {

        System.out.println("bird is flying");
    }
}



























