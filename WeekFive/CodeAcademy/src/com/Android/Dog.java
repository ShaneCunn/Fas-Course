package com.Android;

/**
 * Created by shane on 11/11/2016.
 */
public class Dog {


    int age;

    public Dog(int dogsAge) {
        age = dogsAge;

    }

    public void bark() {
        System.out.println("Woof");

    }

    public static void main(String[] args) {

        Dog spike = new Dog(12);
        spike.bark();
    }


}