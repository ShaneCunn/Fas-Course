package com.android;

/**
 * Created by shane on 15/12/2016.
 */
public class Animal {
    int age = 23;
    String name = "andy";

    void eat() {
        System.out.println("animal eating");
    }
}


class Dog extends Animal {
    int age = 44;
    String name = "bob";

    void eat() {
        System.out.println("dog eating");
    }

    void accesSuper() {
        // super.age = 23;


        System.out.println("age of dog is :" + age);
        System.out.println("super class ie animal age :" + super.age);
        eat();
        super.eat();
    }


}
