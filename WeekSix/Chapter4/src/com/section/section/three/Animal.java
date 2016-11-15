package com.section.section.three;

/**
 * Created by shane on 15/11/2016.
 */
public abstract class Animal {

    void eat() {


    }

    abstract void drink();


}

class monkey extends Animal {


    @Override
    void drink() {
        System.out.println("monkey drinking");
    }
}


class hippo extends Animal {


    @Override
    void drink() {
        System.out.println("Hippo drinking");
    }
}





























