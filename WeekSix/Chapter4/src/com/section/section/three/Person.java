package com.section.section.three;

/**
 * Created by shane on 15/11/2016.
 */
public class Person  implements Behaviour{

    int age = 45;
    String name = "john";
    @Override
    public void mad() {

        System.out.println("person is mad");


    }

    @Override
    public void happy() {
        System.out.println("person is happy");

    }

    @Override
    public void sad() {
        System.out.println("person is sad");

    }
}
