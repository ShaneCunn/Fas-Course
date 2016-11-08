package com.android;

/**
 * Created by shane on 08/11/2016.
 */
public class Animal {

    int eat() {

        return 0;

    }

    // this is an overloaded method as this eat method has a different parameter list,
    // this takes and int but the above takes no parameters. RETURN does not matter
    void eat(int num) {

    }

    // overloaded method that takes a double and a int
    int eat(double dnum, int num) {

        return 0;

    }

    // access modifer does not matter , return type dosen't matter
    protected void eat(String str, int numb) {


    }

    // this is private and is only available inside the animal class
    private void eat(int num, String str) {


    }

    void drink() {

        System.out.println("Animal drinking ");
    }

}

class Dog extends Animal {

    void drink(int num) {// overloaded drink method


    }


    void drink() { // overriding  the drink() method in the animal class that has no parameters


    }

}



























