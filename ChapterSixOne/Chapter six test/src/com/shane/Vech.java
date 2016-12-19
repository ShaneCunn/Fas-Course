package com.shane;

/**
 * Created by shane on 19/12/2016.
 */
public class Vech {

    void driving() {

        System.out.println("vech drive");
    }

    void stopping() {

        System.out.println("vech stopping");
    }


}


class bike extends Vech {
    void driving() {

        System.out.println("bike drive");
    }

    void stopping(int num) {

        System.out.println("overloaded bike stopping" + num);
    }

}
