package com.shane;

/**
 * Created by shane on 19/12/2016.
 */
public class animal {

    int age = 15;
}

class dog extends animal {
    int age = 12;

    void recur() {

        System.out.println("void ");

        recur();
    }


}