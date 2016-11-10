package com.android;

/**
 * Created by shane on 10/11/2016.
 */
public class Animal {

    String name;


    void returnTest(String name) {

        this.name = name;

        //  return name;
    }

  static  void changeAnimal(Animal andy) {


        andy = new Animal();

        andy.name = "Andy changed";
        System.out.println(andy);
        System.out.println("inside method name changed: " + andy.name);
    }



}

class Dog {


    int age;
    String name;
}


