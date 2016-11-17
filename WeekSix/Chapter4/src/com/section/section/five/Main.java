package com.section.section.five;

import java.util.ArrayList;

/**
 * Created by shane on 17/11/2016.
 */
public class Main {

    public static void main(String args[]) {

        String str = "hank";
        String str2 = "hank";
        String str3 = "mary";
        String str4 = new String("mary");


        //both true
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        // both false
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

        // rhis will print false, as these are 2 different objects
        // when you use a new() keyword , this will not chekc the pool or add to the pool
        System.out.println(str3 = str4);

        // this will print true, because this uses the string class equal()
        // which is overridden method from the object class

        Dog spot = new Dog();
        Dog rex = new Dog();
        Dog lassie = spot;

        //this is taking the object calss implementation of the equals methods
        // which returns true if they are the same
        System.out.println("comparing dogs");
        System.out.println(spot.equals(rex));
        System.out.println(spot.equals(lassie));

        Dog dog1 = new Dog("benji", 2);
        Dog dog2 = new Dog("benji", 2);


        System.out.println("comparing  2 dogs ie equal");
        System.out.println(dog1.equals(dog2));


      /*

       public boolean equals(Object obj) {
            return (this == obj);
        }


        */

        // rhis is qhat an equal method looks like for a class that does not define it own equal() method
       /* public boolean equals(Object obj) {

            return (this == obj);
        }*/

        Cat cat1 = new Cat("Tibbles", 2);
        Cat cat2 = new Cat("Tibbles", 2);
        Cat cat3 = cat1;
        Cat cat4 = new Cat("Fluffy", 4);


        System.out.println();

        ArrayList<Cat> catList = new ArrayList<>();

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);

        System.out.println(catList);

        catList.remove(cat1);

        System.out.println("removed cat" + catList);

        catList.remove(new Cat("Fluffy", 4));

        System.out.println("removed cat matching above" + catList);

       // catList.removeIf();




    }
}
