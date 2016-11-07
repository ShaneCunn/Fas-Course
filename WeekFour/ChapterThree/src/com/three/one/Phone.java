package com.three.one;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;

/**
 * Created by shane on 03/11/2016.
 */
public class Phone {


    String colour, brand;
    int appCount;

    double weight, width, height;

    void getSize() {


        double size = width * height;
        System.out.println("size is :" + size);
    }

    static void test(){

        System.out.println("");
    }
}
