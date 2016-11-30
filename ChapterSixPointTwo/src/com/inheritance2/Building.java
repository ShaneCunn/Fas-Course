package com.inheritance2;

/**
 * Created by shane on 29/11/2016.
 */
public abstract class Building {
    abstract void Heating();

}

abstract class House extends Building {
    abstract void Lighting();


}

// all abstract classes have to be implemented  as soon it the first concrete class
class Bungalow extends House {


    @Override
    void Lighting() {

    }

    @Override
    void Heating() {

    }
}