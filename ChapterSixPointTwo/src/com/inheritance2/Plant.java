package com.inheritance2;

/**
 * Created by shane on 29/11/2016.
 */
public abstract class Plant {
    // an abstract class does not have to have a abs methods in it. it can have concrete methods in it
    void grow() {


    }

    void reproduce() {


    }


}

class Flower extends Plant {


}

abstract class Rose extends Flower {


}
