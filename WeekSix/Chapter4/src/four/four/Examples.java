package four.four;

import java.util.ArrayList;

/**
 * Created by shane on 16/11/2016.
 */
public class Examples {


    static void ex1() {

        ArrayList<String> strList = new ArrayList<String>();

        ArrayList<String> str2 = new ArrayList<>(); // you can lose type information , if you leave out <String>


        int[] myArray = {2, 3, 4};

        strList.add("test");

        strList.add("one");

        strList.add("two");

        strList.add("three");
        strList.add("four");

        System.out.println("Str list content is : " + strList);

        for (String x : strList) {

            System.out.println(x);
        }

        for (int i = 0; i < strList.size(); i++) {

            System.out.println(strList.get(i));
        }


        // an array list can only take primitives

        ArrayList<Integer> intList = new ArrayList<>();

        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<>();

        ArrayList<Double> Dlist = new ArrayList<>();


        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(new Integer(5));

        for (int y : intList) {

            System.out.println("numbers are : " + y);
            System.out.println("last number is :" + intList.get(intList.size() - 1));

        }

        intList.add(2, 56);

        for (int y : intList) {

            System.out.println("numbers are : " + y);
            System.out.println("last number is :" + intList.get(intList.size() - 1));

        }

        Dog spot = new Dog();
        Dog rex = new Dog();

        ArrayList<Dog> dogList = new ArrayList<>();

        dogList.add(spot);
        dogList.add(rex);

        Cat bob = new Cat(4, "bob");


        Cat fred = new Cat(90, "fred");

        Cat peter = new Cat(7, "peter");

        Cat tomcat = new Cat(5, "tomcat");


        ArrayList<Cat> catList = new ArrayList<>();

        catList.add(bob);
        catList.add(fred);
        catList.add(peter);
        catList.add(tomcat);

        for (Cat y : catList) {

            System.out.println(y);
        }

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(rex);
        animalList.add(spot);
        animalList.add(bob);
        animalList.add(fred);

        System.out.println(animalList);






    }
}
