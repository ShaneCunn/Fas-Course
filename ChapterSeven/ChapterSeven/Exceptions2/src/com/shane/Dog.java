package com.shane;

import java.util.ArrayList;

/**
 * Created by shane on 20/12/2016.
 */
public class Dog {

    /*
    * the eat method is saying i am not going to deal with it
    * and let whatever is calling eat to deal with it
    * and exception is thrown to what ever is calling it
    *
    * */
    void eat() throws RuntimeException {
        // the rule for checked exceptions is you have to throw or use a try catch block  or both
        System.out.println("Dog eat");

        // when you inside a method or constructor  you can throw  an exceptiona
        // as this is a checked exception and throws it

        throw new RuntimeException();


    }

    void sleep() {

        int[] testList = {1, 4, 3, 4, 5, 6};

        System.out.println(testList[8]);
    }

    void run() {

        //  int[] testList = {1, 4, 3, 4, 5, 6};
        ArrayList<Integer> numlist = new ArrayList<>();

        numlist.add(2);
        numlist.add(3);
        numlist.add(4);

        System.out.println(numlist.get(5));
    }
}
