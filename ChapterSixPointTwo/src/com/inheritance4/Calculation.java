package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public interface Calculation {

    static int multi(int num, int num2) {

        return num * num2;
    }

    static int divid(int num, int num2) {

        return num / num2;
    }

    static int tax(int wages) {
        return wages - 200;
    }
}
