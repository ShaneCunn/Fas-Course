package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Pupil {

    String name;
    int age;
    static int courseID = 12345;


    Pupil(String name, int age) {

        this.age = age;

        this.name = name;


    }

    void eat() {

        System.out.println("I am a pupil i eat" + " and my name is " + name);
    }

    static void takeCourse() {

        System.out.println("i am taking a course with id : " + courseID);
    }

    /*
    *
    *
    * */
}
