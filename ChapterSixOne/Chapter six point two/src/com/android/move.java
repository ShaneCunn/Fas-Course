package com.android;

import java.util.Random;

/**
 * Created by shane on 13/12/2016.
 */
public interface move {


    void landBased();

    // void waterBased();

}

// runs inherits from the move interface
// any class that impletment  the run interface, also impletment all the methods for the move interface
interface Run extends move {
    public static final int finalnum = 54;
    // this is a special variable, it is public, static final int
    int finalInt = 67;

    double testRand =  Math.random()* 10;
    void runSpeed();


}
