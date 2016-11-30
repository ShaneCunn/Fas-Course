package com.inheritance2;

/**
 * Created by shane on 29/11/2016.
 */
public class Main {


    public static void main(String args[]) {


        Animal superanimal = new Animal();

        Dog bobo = new Dog();

        Collie fred = new Collie(5);

/*
        StaticMethods.takesStuff(fred);
        StaticMethods.takesStuff(bobo);
        StaticMethods.takesStuff(superanimal);*/

        // calls the  toString method for each of these classes
        System.out.println(fred);
        System.out.println(bobo);
        System.out.println(superanimal);


        // Person percy = new Person();

        // you can't create a abstract object


    }
}

