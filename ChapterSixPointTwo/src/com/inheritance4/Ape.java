package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public class Ape {
    void eat() {


        System.out.println("ape eating");
    }

    void drinking() {


        System.out.println("ape drinking");
    }

}


class Monkey extends Ape {

    void eat() {


        System.out.println("monkey eating");
    }

    void useTools() {


        System.out.println("monkey tools");
    }
}

class Human extends Monkey {

    void drinking() {


        System.out.println("human drinking");
    }

    void useTools() {


        System.out.println("Human tools");
    }

    void speak() {


        System.out.println("human speaks");
    }


}