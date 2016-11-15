package com.section.section.three;

/**
 * Created by shane on 15/11/2016.
 */
public class Examples {

    static void ex4() {


        // 3D arrays

        int[][][] threeD = {{
                {23, 45, 67},
                {3, 456, 6789},
                {654, 789, 9876}
        }};


        int[] numArray = {23, 45, 67};

        int[][] twoD = new int[2][3];
        int[][][] threeD2 = new int[2][2][3];


        double[] dList = new double[5];

        int[] iList = new int[5];

        String[] sList = new String[5];

        char[] charList = new char[5];

        for (int i = 0; i < 5; i++) {


            System.out.println(dList[i]);
            System.out.println(iList[i]);
            System.out.println(sList[i]);
            System.out.println(charList[i]);

        }
       /*  if no values are int in our array the default value is given to each element in the array
         the default for number is 0.0 or 0
        boolean is False
        String is NULL
         char is nothing ''
         for objects it is NULL

         */
        // if your declaring a n array over 2 lines , you have to use the NEW keyword


        int intArray;

        //intArray ={23,45,67};

        //  intArray = new int[3]={23,45,67};


    }

    static void ex5() {
        Cat[] catList = new Cat[3];

        Cat tibbles = new Cat();
        Cat tomCat = new Cat();
        tomCat.name = "tomCat";
        Cat fluffles = new Cat();
        fluffles.name = "Fluffles";
        // populates the array of Cats
        catList[0] = tibbles;
        catList[1] = tomCat;
        catList[2] = fluffles;

        for (int i = 0; i < catList.length; i++) {

            System.out.println("name of cat is : " + catList[i].name + " the ages is : " + catList[i].age + " ");
        }
    }


    static void ex6() {

        Animal andy = new Animal() {
            @Override
            void drink() {
                System.out.println("test");

            }
        };
        // if you have an array of a ABS type you can populate the array with concrete classes that inherit from this this abstract
        // in our case its hipp and monkeys
// these object can only access  methods that were overridden
        Animal[] animalList = new Animal[5];
        hippo henry = new hippo();
        animalList[0] = new hippo();

        animalList[1] = new monkey();

        animalList[2] = new monkey();
        animalList[3] = new hippo();
        animalList[4] = henry;


        for (int i = 0; i < animalList.length; i++) {
            System.out.println("age is " + animalList[i].age);
            animalList[i].drink();
            animalList[i].eat();
        }

        collie bob = new collie();
        collie rex = new collie();
        cockSpaniel hunter = new cockSpaniel();

        Dog[] dogList = {bob, rex, hunter, new Dog()};
        // this is an array of dogs, so it can be popl with all  the breeds of dog,
        // which inherits from the dog cclass, and also can have Dogs in it

        // collie[] collieList ={bob, rex, new Dog()}
        // this will not work as it takes collies and oyu can't put in a superclass object into an array that only accepts
        // a subclass, this array can only takes collies , and a og can only could be cocker spaniel or collie
        //so this array cannot take cocker spaniels either
    }

    static void ex7() {


    }
}














