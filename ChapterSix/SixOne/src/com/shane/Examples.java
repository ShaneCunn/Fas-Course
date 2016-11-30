package com.shane;

import java.util.function.Predicate;

/**
 * Created by shane on 29/11/2016.
 */
public class Examples {


    public static void ex1() {


    }


    public static void lambdaTest(){

        Predicate<String> i  = (s)-> s.length() > 5;

        System.out.println(i.test("java2s.com "));
    }
}
