package com.four.one;

/**
 * Created by shane on 10/11/2016.
 */
public class Examples {


    static void ex1() {


        // this is all about creating String
        // when you create a string by assigning  a value, you place the text in what is called the STRING POOL,
        // so the name shane is place in the pool
        String name = "Shane";
        String str1 = new String("paul");

        String str2 = new String("paul");

        // every time a new string is created by assigning a value, it first checks to seee ift already exists.
        // if it does it assign the value in the pool to the new string  reference
        System.out.println(str1==str2);// this checks the value
        System.out.println(str1);
        System.out.println(str1);


        String name2 = "Shane";

        System.out.println(name2.valueOf(str1));

        System.out.println(str1.equals(str2));


        // here we create two separte string objects that each has  the value TODAY
        String myDay = new String("today");
        String yourDay = new String("Today");

        System.out.println(myDay == yourDay); // will print false

        System.out.println(myDay.equals(yourDay));

        Dog spot = new Dog();

        Dog fred = new Dog();

        System.out.println(spot.equals(fred));
    }

    static void ex2() {

        String str = "Hello There, nice to meet you";

        System.out.println(str.replace('e', 'E'));

        // strings a re immutable , so methods of the string classs,
        // DOES NOT change a string methods of the string class
        System.out.println(str);

        System.out.println(str.toUpperCase());
        String newStr = str.replace('e', 'E');
        //String remov = str.replaceAll

        //String remov = str.split("nice");

    }

    static void ex3() {

        String name = "Paul";

        // charAT() shows what char is a certain index.


        //
        System.out.println(name.charAt(0));
        //System.out.println(name.charAt(4));


        System.out.println("Lenght" + name.length());
        System.out.println("Lenght" + name.lastIndexOf(5));
        // if index of , can;t find a particular or string it, it will return -1

        for (int i = 0; i < name.length(); i++) {


        }

        // indexof , it give the index of a particular char or string  start at 0

        String nursey = "mary had a little lamp, whoose fleece was a white as snow, every where mary ";

        String exam = "oracle";
        String cub = exam.substring(2);

        System.out.println(cub);


        // TRim


        name = "     shane    ";
        System.out.println(name);
        String test = name.trim();
        System.out.println(test);

        // Replace

        name = "tommy";

        System.out.println(name.replace('m', 'n'));

        String str3 = "the quick grey fox jumped over the lazy dog";

        System.out.println(str3.replace("fox", "Wolf"));

        // can't mix and match

        // System.out.println(str3.replace('f', "Wolf"));

        
    }

}
































