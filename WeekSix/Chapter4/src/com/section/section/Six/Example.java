package com.section.section.Six;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by shane on 17/11/2016.
 */
public class Example {


    static void ex1() {
// you can't  directly create a date or time object ie use new .
        // you create  adate object by using the static method of
        LocalDate date1 = LocalDate.of(2100, 12, 25);

        LocalDate datenow = LocalDate.now();
        System.out.println(datenow);


        LocalDate date2 = LocalDate.of(2017, Month.JULY, 22);

        System.out.println(date2);
        LocalDate date3 = LocalDate.parse("2018-08-12");
        System.out.println(date3.getDayOfYear());


        // get methods

        System.out.println(date3.getEra());
        System.out.println(date3.getDayOfYear());
        System.out.println(date3.getDayOfWeek());
        System.out.println(date3.getDayOfMonth());
        System.out.println(date3.getMonth());
        System.out.println(date3.getYear());
        System.out.println(date3.getMonthValue());

        LocalDate xmas = LocalDate.of(2016, 12, 25);

        LocalDate paddy = LocalDate.of(2017, 03, 17);

        //System.out.println(xmas + paddy); can't added date together

        System.out.println(xmas.isBefore(paddy));
        System.out.println(paddy.isAfter(xmas));
        System.out.println(paddy.isBefore(xmas));


        xmas = xmas.minusDays(10);

        System.out.println("new xam date " + xmas);

        //LocalDate test1 = xmas.getDayOfYear();
        





    }
}
