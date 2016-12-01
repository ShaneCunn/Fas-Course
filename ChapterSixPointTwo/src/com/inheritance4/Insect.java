package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public class Insect {

    void eat() {

        System.out.println("insect eat");
    }

    void drink() {

        System.out.println("insect drinking");
    }
}

class Spider extends Insect {

    void web() {

        System.out.println("Spin web");
    }
}


class Tar extends Spider {

    void eat() {

        System.out.println("Tar eat");
    }

    void drink() {

        System.out.println("Tar drink");
    }
}
