package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public class Bird {

    Bird(){

        super();

    }

    int age = 23;

    boolean flight = false;


    void eat() {

        System.out.println("bird eating");
    }

    void drink() {

        System.out.println("bird drinking");
    }


}

class Domestic extends Bird {
    double weight = 234.5;


    void eat() {

        System.out.println("dom  eating");
    }

    void peck() {
        // this is a method in the domestic class
        System.out.println("bird pecking");
    }

}

class Chicken extends Domestic {


    int eggamount = 4;

    void drink() { // this over ridden

        System.out.println("chick drinking"); // overidden the drink() from the bird()
    }

    void peck() {

        System.out.println("chicken pecking");
    }

    void eat() {


        System.out.println("chicken eat");//

    }

    void lay() {


        System.out.println("chicken laying");//this is a method unique to the chick method class

    }
}