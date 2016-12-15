package com.android;

/**
 * Created by shane on 14/12/2016.
 */
public class Animal {

    int age = 4;
    String name = "andy";

    void eat() {

        System.out.println("animal eating");
    }

}

class Cow extends Animal {
    @Override
    void eat() {
        //  super.eat();

        System.out.println("cow eating");
    }

    void Drink() {
        System.out.println("Cow drinking");
    }
}

class Sheep extends Animal {
    void sleep() {

        System.out.println("Sheep sleeping");
    }

}

class Pig extends Animal {

    void pigging() {

        System.out.println("pig pigging");
    }
}

class Chicken extends Animal {

    void chucking() {

        System.out.println("chicken make noises");
    }


}

class hen extends Chicken {

    void feeding() {
        System.out.println("hen feeding");
    }
}
