package com.shane;

/**
 * Created by shane on 16/12/2016.
 */
public class Employee {


    private int age, rating;
    private String name;

    public Employee(int age, int rating, String name) {
        this.age = age;
        this.rating = rating;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }
}
