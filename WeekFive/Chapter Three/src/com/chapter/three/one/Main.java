package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 *
 * this is a exam objective 1.1 define the scope of variable
 */
public class Main {

    public static void main (String args []){
/*
*  access a static variable in a static way, this is the recommended way to to access a static variable
*
* */

        //  System.out.println(" exam is " + Local.);

        Local myLocal = new Local();
/*
*  accessing a static variable in a non static way
*  it is not recommended
* */
        System.out.println(myLocal.examID);


        Pupil fred = new Pupil("fred", 45);
        Pupil bob = new Pupil("bob", 23);
        fred.eat();
        bob.eat();

        /*
        *  i do not have to create a pupil to acces the static method takeCourse,
         * as this method applies to all of the pupils ,
        *  not just ONE, so it follows you can't access an individual pupils name or age
        * */

        fred.takeCourse();

        Dog spot = new Dog();
        Dog peter = new Dog();
        Dog john = new Dog();

        spot.name = "fred 2";
        spot.age = 23;
        spot.weight = 23456;
        peter.name = "peter";
        peter.weight = 56;
        john.name = "john";
        john.weight = 987654;


        System.out.println("spot name :" + spot.name + "  weight: " + spot.weight + " id is " + spot.packID);
        System.out.println("peter name :" + peter.name + "  weight: " + peter.weight + " id is " + peter.packID);
        System.out.println("john name :" + john.name + "  weight: " + john.weight + " id is " + john.packID);

        /*
        * every dog shares the same packID , this means if we change it for the one dog,
         * it is changes for every dog
        * */

        spot.packID = 56;
        System.out.println("spot name :" + spot.name + "  weight: " + spot.weight + " id is " + spot.packID);
        System.out.println("peter name :" + peter.name + "  weight: " + peter.weight + " id is " + peter.packID);
        System.out.println("john name :" + john.name + "  weight: " + john.weight + " id is " + john.packID);

        Dog.packID = 677;

        spot.eat();

        peter.eat();
        john.eat();

        Dog.hunt();

        Phone Lg = new Phone();

                Lg.call();
        Lg.dailUP();

    }
}
