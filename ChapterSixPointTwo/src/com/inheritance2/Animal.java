package com.inheritance2;

/**
 * Created by shane on 29/11/2016.
 */
public class Animal {


    int age = 5;
    String name = "just a animal owner";

    Animal() {

        System.out.println("animal constructor called");
    }


    void Drink() {

        System.out.println("animal drinking");
    }

    void Eating() {

        System.out.println("animal eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


class Dog extends Animal {


    String colour = "blue";
    double weight = 12.5;

    Dog() {

        System.out.println("dog constructor called");
    }

    void Drink() {

        System.out.println("dog drinking");
    }

    void Eating() {

        System.out.println("dog eating");
    }

    void Panting() {

        System.out.println("Dog panting");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}


class Collie extends Dog {

    String owner = "no one";
    boolean sex = true;

    Collie() {

        System.out.println("collie constructor called");
    }

    Collie(int age2) {

        System.out.println("collie age is :" + age2);
    }

    void Drink() {

        System.out.println("collie drinking");
    }

    void Eating() {

        System.out.println("collie eating");
    }

    void Grooming() {

        System.out.println("collie groomed ");
    }

    @Override
    public String toString() {
        return "Collie{" +
                "owner='" + owner + '\'' +
                ", sex=" + sex +
                '}';
    }
}