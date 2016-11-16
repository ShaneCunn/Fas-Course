package com.shane.cunningham;

/**
 * Created by shane on 16/11/2016.
 */
public class Calculator {

    Calculator() {


    }

    int add, substract, multiply, divide;

    int adder(int a, int b) {
        int add = a + b;
        return add;


    }

    int substract(int a, int b) {
        int add = a - b;
        return substract;


    }

    int multiply(int a, int b) {


        int multiply = a * b;
        return multiply;
    }


    int divide(int a, int b) {

        if (b <= 0) {

            System.out.println("Error! Dividing by zero is not allowed..");
            return 0;
        }
        int divide = a / b;
        return divide;

    }
}


