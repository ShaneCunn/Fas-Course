package com.shane;

/**
 * Created by shane on 20/12/2016.
 */
public class Animal {
    static Animal getAnimal(Animal andy) {
        Animal bob = new Animal();
        System.out.println("getAnimal called ");
        return bob;
        // return new Cow();
        //return new Sheep();

        // this method can return a animal , a sheep or cow as sheep and cow extends the animal class.
        // Likewise it can take a animal sheep , cow , as the method parameter

    }

}


class Cow extends Animal {


}

class Sheep extends Animal {


}