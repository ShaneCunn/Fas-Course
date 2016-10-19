package com.com.Calculator;

/**
 * Created by shane on 19/10/2016.
 */
public class CalculatorModel {


    private int calculatorValue;

    public void addNumber(int firstNumber, int secondNumber) {


        calculatorValue = firstNumber + secondNumber;


    }


    public int returnValue(){


        return calculatorValue;
    }


    public static void main(String args[]) {
        String test = "hello shane";


        System.out.println(test);
    }
}
