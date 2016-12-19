package com.shane;

/**
 * Created by shane on 19/12/2016.
 */
public class animal {

    /*
    * you have to sent it a object that implements an interface or lambda or a interface reference to a object
    * that implements the interface
    *
    * */
    void walk(behaviour myBehaviour) {

        myBehaviour.move();
    }
}


class Dog implements behaviour {


    @Override
    public void move() {
        System.out.println(" dog moving");
    }
}

class Cat implements behaviour {


    @Override
    public void move() {
        System.out.println("Cat moving");
    }
}

