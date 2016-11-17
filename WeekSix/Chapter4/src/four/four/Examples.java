package four.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

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

    static void ex2() {
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("test");
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");

        // when you create an arraylist , it create an array of size 10,
        // if it get bigger than that, it a copy of the array for each new value added.
        //

        Dog spot = new Dog();
        Dog rex = new Dog();

        ArrayList<Dog> dogList = new ArrayList<>();

        dogList.add(spot);
        dogList.add(rex);

        for (int i = 0; i < dogList.size(); i++) {
            System.out.println("dog stuff is " + dogList.get(i));

        }


        Cat bob = new Cat(4, "bob");
        Cat fred = new Cat(90, "fred");
        Cat peter = new Cat(7, "peter");
        Cat tomcat = new Cat(5, "tomcat");


        ArrayList<Cat> catList = new ArrayList<>();

        catList.add(bob);
        catList.add(fred);
        catList.add(peter);
        catList.add(tomcat);


        // for loop
        System.out.println("for loop");
        for (int i = 0; i < catList.size(); i++) {
            System.out.println("cat name is: " + catList.get(i));
            catList.get(i).eat();
        }

        System.out.println("enhanced for loop");

        // enhanced for loop to  get name
        for (Cat x : catList) {

            System.out.println("cat name is : " + x.name);

            x.eat();
        }

    }


    static void ex3() {
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(4);
        intList.add(3);
        intList.add(2);
        intList.add(1);
        ListIterator<Integer> iterator = intList.listIterator();

// using the hasnext retruns ture if there is naother avlue in the list,
// returns false if there is not another value in our list
    /*    while (iterator.hasNext()) {

            System.out.println("list out: " + iterator.next());

            System.out.println("list out: " + iterator.nextIndex());


        }*/
        System.out.println("before");
        System.out.println(intList);

        while (iterator.hasNext()) {


            if (iterator.next() > 2)

                iterator.remove();

        }

        System.out.println("after removal");
        System.out.println(intList);

        Collections.sort(intList);


        System.out.println("sorted list" + intList);

        Collections.shuffle(intList);

        System.out.println("rand list" + intList);


    }

    static void ex4() {

        ArrayList<Double> Dlist = new ArrayList<>();

        // you are trying to the first number on a list, which has nothing in it
        // Dlist.add(1, 2.3);
        try {
            Dlist.set(0, 2.3);// you can't use set on a empty arraylist
        } catch (Exception x) {
            System.out.println(x);
}


        for (int i = 0; i < Dlist.size(); i++) {

            Dlist.get(i);
        }

    }

    static void ex5() {


        String sb1 = new String("one");
        String sb2 = new String("two");
        String sb3 = new String("three");
        String sb4 = new String("four");
        String sb5 = new String("five");

        ArrayList<String> strList = new ArrayList<>();

        strList.add(sb1);
        strList.add(sb2);
        strList.add(sb3);
        strList.add(sb4);
        strList.add(sb5);

        System.out.println("before\n" + strList);

        strList.remove(2);

        System.out.println("after\n" + strList);

        strList.remove(2);

        System.out.println("after\n" + strList);


    }


    static void ex6() {

        String sb1 = new String("one");
        String sb2 = new String("two");
        String sb3 = new String("three");
        String sb4 = new String("four");
        String sb5 = new String("five");

        ArrayList<String> strList = new ArrayList<>();

        strList.add(sb1);
        strList.add(sb2);
        strList.add(sb3);
        strList.add(sb4);
        strList.add(sb5);
        ArrayList<String> nameList = new ArrayList<>();
        String name1 = "Charlie";
        String name2 = "enda";
        String name3 = "peter";
        String name4 = "john";


        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);

        strList.addAll(nameList);

        System.out.println(strList);


        ArrayList<String> strList2 = new ArrayList<>();

        strList2.add(sb1);
        strList2.add(sb2);
        strList2.add(sb3);
        strList2.add(sb4);
        strList2.add(sb5);

// this is going to add namelist at position 2

        strList.addAll(2, nameList);


        ArrayList<String> strCopy = strList;

        System.out.println(strCopy == strList);
    }

    static void test4() {

        ArrayList<String> myArrList = new ArrayList<String>();
        String one = "One";
        String two = new String("Two");
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");
        for (String val : myArrList)
            System.out.print(val + ":");
        for (String val : yourArrList)
            System.out.print(val + ":");
    }


    static void ex9() {
        String sb1 = new String("one");
        String sb2 = new String("two");
        String sb3 = new String("three");
        String sb4 = new String("four");
        String sb5 = new String("five");
        ArrayList<String> strList = new ArrayList<>();

        strList.add(sb1);
        strList.add(sb2);
        strList.add(sb3);
        strList.add(sb4);
        strList.add(sb5);
        ArrayList<String> nameList = new ArrayList<>();
        String name1 = "Charlie";
        String name2 = "enda";
        String name3 = "peter";
        String name4 = "john";


        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);


        strList.clear();

        System.out.println(strList);

        strList.add(sb1);
        strList.add(sb2);
        strList.add(sb3);
        strList.add(sb4);
        strList.add(sb5);

        // contains() this method return true if the list contains  the string or object


        System.out.println(strList.contains("one"));

         
    }
}
































