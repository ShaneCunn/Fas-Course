package com.section.section.TEST;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by shane on 23/11/2016.
 */
public class Questions {


    static void four() {
        // you can't an int to arraylist of LONGS, the default is WHOLE numbers
        ArrayList<Long> lst = new ArrayList<>();
        lst.add(10L);
        // you are casting 10 to be of type LONG


        System.out.println(lst.get(0));


    }

    static void Six() {

        ArrayList<String> ejg = new ArrayList<>(); // line 4
        ejg.add("One"); // line 5
        ejg.add("Two"); // line 6
        System.out.println(ejg.contains(new String("One"))); // line 7
        System.out.println(ejg.indexOf("Two")); // line 8
        ejg.clear(); // line 9
        System.out.println(ejg); // line 10Sample exam questions 11
        System.out.println(ejg.get(1)); // line 11

    }

    static void Seven() {

        String ejg1 = new String("E Java");
        String ejg2 = new String("E Java");
        String ejg3 = "E Java";
        String ejg4 = "E Java";
        do
            System.out.println("test" + ejg1.equals(ejg2));
        while (ejg3 == ejg4);

    }


    static void Nine() {

        String ejg = "game".replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);
        System.out.println(ejg);
    }

    static void Ten(){


        StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        ejg.append(ejg.delete(3, 6));
        System.out.println(ejg);
    }


    static void twelve(){

        String printDate = LocalDateTime.parse("2057-08-11")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(printDate);
    }
}
