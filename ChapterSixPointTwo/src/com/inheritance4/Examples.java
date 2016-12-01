package com.inheritance4;

/**
 * Created by shane on 30/11/2016.
 */
public class Examples {


    static void ex1() {

        Animal andy = new Animal();

        Mammal manny = new Mammal();
        Dolphin flipper = new Dolphin();

        System.out.println("our animal");
        System.out.println(andy.weight);
        System.out.println(andy.age);


        System.out.println("our mammal");
        System.out.println(manny.pregTime);
        System.out.println(manny.age);
        System.out.println(manny.weight);


        System.out.println("our Dolphin");
        System.out.println(flipper.age);
        System.out.println(flipper.weight);
        System.out.println(flipper.swimspeed);
        System.out.println(flipper.pregTime);


    }


    static void ex2() {

        Bird bob = new Bird();

        Domestic freddy = new Domestic();
        Chicken pecky = new Chicken();


        System.out.println("our bird:".toUpperCase());

        System.out.println(bob.age);
        bob.drink();
        bob.eat();

        System.out.println("our domestic:".toUpperCase());
        freddy.eat();
        freddy.peck();// the peck
        freddy.drink();


        System.out.println("our chicken:".toUpperCase());
        pecky.drink();
        pecky.eat();
    }


    static void ex4() {

        Ape fred = new Ape();
        Monkey bob = new Monkey();
        Human john = new Human();

        //  Human myHuman = new Ape();

        // creates a super class reference to a sub class object
        // a animal is a dog

        // SuperClass() --> Subclass
        Ape myApe = new Human();
        System.out.println("our human");
        john.eat();
        john.drinking();
        john.speak();
        john.useTools();

        System.out.println("our apeman");
        myApe.eat();
        myApe.drinking();


    }

    static void ex5() {

        Insect myTar = new Tar();// this is a super class reference to a subclass object
        // this has only access to methods in the superclass but it s implementation  CAN come from the sublcass

        // this object can only eat or drink
        System.out.println("Insect and tar subclass  but exclude the spider from the inheritance");
        myTar.eat();
        myTar.drink();

        Tar terry = new Tar();
        System.out.println("Tar object");
        terry.eat();
        terry.drink();
        terry.web();


        Spider sally = new Tar();


    }

    static void ex6() {

        Doctor phil = new Doctor();

        phil.drinking();
        phil.eat();
        phil.wages();

        //   Employee myEmp = new Employee()

        // this will not work as you can't create a object of an abstract class


        System.out.println("Person doctor");


        Person perDoc = new Doctor();

        perDoc.drinking();
        perDoc.eat();
    }

    static void ex7() {

        Wages.calcPRSI();

        Calculation.tax(10000);

        System.out.println(Calculation.tax(1000));
    }

    static void ex8() {


    }

}


