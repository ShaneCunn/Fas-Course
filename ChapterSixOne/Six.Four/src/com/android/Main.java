package com.android;

/**
 * Created by shane on 14/12/2016.
 * <p>
 * <p>
 * Exam objective 7.3 , determining when casting is necessary
 */
public class Main {

    public static void main(String arg[]) {

        byte bnum = 3;
        int num = (int) bnum;
        double dnum = (double) num;
        long lnum = (long) dnum;

        System.out.println(lnum);


    }
}
