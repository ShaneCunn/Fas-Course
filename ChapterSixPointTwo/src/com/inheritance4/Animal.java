package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 * <p>
 * <p>
 * only allowed one public class per file, it has to be the same name as the file....
 */
public class Animal {
    int age = 10;
    double weight = 12.5;


}

class Mammal extends Animal {

    double pregTime = 14;
}

class Dolphin extends Mammal {

    double swimspeed = 34.5;
}


