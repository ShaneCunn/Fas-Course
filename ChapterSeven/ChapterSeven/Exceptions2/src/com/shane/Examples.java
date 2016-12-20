package com.shane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by shane on 20/12/2016.
 */
public class Examples {


    static void ex1() {

        int[] numList = {1, 2, 3, 4};


        try {

            System.out.println(numList[0]);
            for (int i = 0; i < numList[7]; i++) {

                System.out.println(i);
            }
        } catch (Exception e) {
            // e.printStackTrace();

            System.out.println("Exception is : " + e);
        } finally {
        }
        System.out.println(numList[3]);
    }

    static void ex2() {
        Dog spot = new Dog();

        try {
            spot.eat();
        } catch (RuntimeException e) {
            //e.printStackTrace();

            System.out.println("eat method excepton : " + e);
            System.out.println("caught in ex2");
        }


    }

    static void ex3() {
        Dog spot = new Dog();

        spot.sleep();


    }

    static void ex4() {
        Dog spot = new Dog();


        try {
            spot.sleep();

        } catch (Exception e) {

            System.out.println("Exception is : " + e);
        }

    }

    static void ex5() {


        try {
            Dog spot = new Dog();

            spot.run();
        } catch (ArrayIndexOutOfBoundsException a) {
            // e.printStackTrace();

            System.out.println(" can only catch out of ArrayIndexOutOfBounds Exception ");
        } catch (IndexOutOfBoundsException a) {
            // e.printStackTrace();

            System.out.println(" can only catch out of ArrayIndexOutOfBounds Exception ");
        } catch (Exception a) {
            // e.printStackTrace();

            System.out.println(" can only catch out of ArrayIndexOutOfBounds Exception " + a);
        }
    }

    static void ex6() {
        String[] names = {"shane", "bob"};
        FileInputStream fis = null;
        try {
            int a = 4 / 0;
            System.out.println(names[4]);
            fis = new FileInputStream("files.txt");
        } catch (FileNotFoundException e) {

            System.out.println("file not found ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds " + "\n subclass of index out of bound errors method/exception");
        } catch (IndexOutOfBoundsException e) {

            System.out.println("index out of bounds  ");
        } catch (NullPointerException e) {

            System.out.println("null pointer exception ");
        } catch (IOException e) {

            System.out.println("io exception ");

        } catch (Throwable e) {

            System.out.println("throwable caught ");
        }
        // executes in nearly all curcumstances
        finally {

            System.out.println("finally called ");

       }


    }
}
