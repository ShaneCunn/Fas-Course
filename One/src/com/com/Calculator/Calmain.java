package com.com.Calculator;

/**
 * Created by shane on 20/10/2016.
 */
public class Calmain {


    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);

    }
}
