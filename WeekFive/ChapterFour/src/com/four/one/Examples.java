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
        //startwith and endwith
        String str4 = "ABCAB";


        System.out.println(str4.startsWith("AB"));

        System.out.println(str4.endsWith("B"));

        System.out.println(str4.startsWith("A", 3));

        // endwith does not allow you to search from a certain position

        //  System.out.println(str4.endsWith("A", 3));

        name = "JOE";

        String name2 = "joe";
//String test2= name2.toUpperCase();
        //System.out.println(name.equals(test2));

        System.out.println(name.equalsIgnoreCase(name2));


    }

    static void ex4() {
//method Chaining
        String day = "  sunday   ".replace('d', 'z').trim().concat("men");
        System.out.println(day);

        System.out.println("  Monday   ".replace('d', 'z').trim().concat("men"));
        day = "monday";

        String newDay = day.replace("m", "T").concat("Day").substring(2, 6);
        System.out.println(newDay);


        String letters = "ABCAB";

        //System.out.println(letters.substring(0, 2).startsWith('A'));


        String str = " hello there nice to meet you ";
        // gets rid of spaces
        str = str.trim();
        // sets the counter to zero
        int spaceCount = 0;

        // loop through the lenght of the string array
        for (int i = 0; i < str.length(); i++) {
            // if the char is a space
            if (str.charAt(i) == ' ') {
                // increment the space counter by one
                spaceCount++;


            }
        }

        System.out.println(str.length());
        System.out.println(spaceCount);

        System.out.println("letter count is : " + str.replaceAll(" ", "").length());

        System.out.println("letter count is : " + (str.length() - spaceCount));
        int words = spaceCount;

        System.out.println("Word count is " + (spaceCount + 1));


    }


}
































