package com.company;

/**
 * Created by shane on 29/11/2016.
 */
public class Building {


    double height;
    double width;
    int age;

    void calcPrice() {

        System.out.println("house price is:");
    }

    void energyRating() {

        System.out.println("house price is:");
    }
}


class House extends Building {

    boolean planning;

    int windowAmount;

    void calcPrice() {

        System.out.println("house price is:");
    }

    void energyRating() {

        System.out.println("house energy rating is:");
    }

}

class Bungalow extends House {

    boolean garage;
    boolean centralheating;

    void energyRating() {

        System.out.println("bungalow price is:");
    }

    void calcPrice() {

        System.out.println("house price is:");
    }


}