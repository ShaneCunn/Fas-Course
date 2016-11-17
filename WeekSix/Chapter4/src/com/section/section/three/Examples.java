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

        Behaviour[] behaviourArray = new Behaviour[4];


        //  Behaviour behave = new Behaviour()


        Behaviour behaveEMP = new Employee();
        // this will access the emp impletmention of the happy, sad, and mad() methods
        behaveEMP.happy();
        behaveEMP.mad();
        behaveEMP.sad();
        // you can only access these methods
        // when declaring a var of type interface , you can only assign an object that implement that interface to it
        // in this case a refer of type behaviour can ony be assigned to an employee or person object
        //as both these classes implement behaviour


        Behaviour[] behaveList = new Behaviour[3];
        // when you have an array of type interface you can only pop this array with objects whosse classes impletment this interface


        behaveList[0] = new Person();
        behaveList[1] = new Employee();
        behaveList[2] = new Person();

        for (int i = 0; i < behaveList.length; i++) {

            behaveList[i].sad();
            behaveList[i].happy();

            behaveList[i].mad();

        }


    }

    static void ex8() {
        Object obj = new Object();

        // the object class is the super class of all other classes in JAVA

        obj.toString();

        // one of the methods is  the toString methods , insert any data type or object into a print statement

        System.out.println(obj.toString());
        System.out.println(obj);


        Cat tibbles = new Cat();
        // this is going to use the toString method from the object classe
        System.out.println(tibbles);

        Dog spot = new Dog();

        System.out.println(spot);

        // using the overridden toString method

        // when you have a super class refere to subclass object, you can only access object first defined first in the super class
        // in this case the CAt,  it takes impletmention from the object
        // the dog does have it own impletmentation, so it will use this toString method.
        Object objCat = new Cat();

        Object objDog = new Dog();

        // this array can take any object
        Object[] objArray = new Object[4];

        objArray[0] = new hippo();
        objArray[1] = new String("Hello");
        objArray[2] = new Person();
        objArray[3] = new Integer(2);

        for (int i = 0; i < objArray.length; i++) {


        }


    }

    static void ex9() {

        Dog[] dogArray2 = {new Dog(), new Dog(), new Dog(), new Dog()};

        dogArray2[2] = null; // it is not a an error to assign to array

        // our list is equal to dog, dog, null ,dog
        for (int i = 0; i < dogArray2.length; i++) {

            // System.out.println(dogArray2.toString());

            System.out.println(dogArray2[i].hieght);


        }

    }


    static void ex10() {

// Asymmetrical mutlidimensional Array


        String[][] twoDarray = new String[2][3];

        String mutli[][] = new String[][]{
                {"mary", "pat"}, // 2 column
                {"john"}, // 1 column
                {"lighter", "shane", "greater", "weird"} //4 column


        };
        int[] numArray ={23,34,56,67};

        System.out.println(numArray.length);
        String [] str = {"mary had a little lamb"};
        System.out.println(str.length);
    }

}















