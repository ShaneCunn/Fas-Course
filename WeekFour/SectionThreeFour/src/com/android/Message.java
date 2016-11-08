package com.android;

/**
 * Created by shane on 08/11/2016.
 */
public class Message {
// 3 overloaded methods

    void read(Phone myPhone) { // one take a phone

        System.out.println("Read phone message");

    }

    void read(PC myPC) { // two takes a pc

        System.out.println("Read PC message");

    }

    void read(Tablet myTablet) {// three takes Tablet

        System.out.println("Read Tablet message");

    }
}
