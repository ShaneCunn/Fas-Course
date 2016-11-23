package com.section.section.Six;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

        // plus dates
        date1 = LocalDate.of(2016, 12, 27);
        System.out.println(date1.plusDays(4));
        System.out.println(date1.plusWeeks(5));
        System.out.println(date1.plusMonths(7));
        System.out.println(date1.plusYears(2));


        date1 = LocalDate.of(2016, 12, 27);


        System.out.println(date1.withDayOfMonth(21));
        System.out.println(date1.withDayOfYear(21));
        System.out.println(date1.withMonth(10));
        System.out.println(date1.withYear(2555));

        date1 = LocalDate.of(2016, 12, 27);
        System.out.println(date1.atTime(10, 23, 56));
        date1.atTime(10, 23, 56);


        System.out.println(date1.atTime(0, 0, 30));

        System.out.println(date1.atTime(0, 0, 30, 0000000000011));

        System.out.println(date1.atTime(LocalTime.of(16,30)));

        LocalDate earlyDate = LocalDate.of(1970, 01, 04);
        LocalDate date4 = LocalDate.MAX;
        LocalDate date5 = LocalDate.MIN;

        System.out.println("max date is" + date4);
        System.out.println("min date is " + date5);

    }


    static void exPeriod() {

        LocalDate date1 = LocalDate.of(2017, 01, 01);
        LocalDate date2 = LocalDate.of(2018, 01, 01);

        Period per1 = Period.between(date1, date2);

        System.out.println(per1);
    }
    // epoc day is jan 1 1970, ie unix time, ie DAY ONE

    static void ex2() {
// localtime is store in this format: hours-minutes,-seconds- nanosecond , no milliseconds
        // it is immutable , it is created in similar date


        LocalTime time1 = LocalTime.of(12, 12);
        LocalTime time2 = LocalTime.of(13, 15, 25);
        LocalTime time3 = LocalTime.of(11, 10, 33, 999888777);
        LocalTime timeTest = LocalTime.of(11, 10, 33, 777);


        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(timeTest);

//time2 = LocalTime.of(25, 61, 65); // will cause of range exception
//  0 to 23 hours, 0 to 59 seconds


        // you can parse a string to be a time

        time2 = LocalTime.parse("16:06");

        System.out.println(time2);

        time2 = LocalTime.NOON;

        System.out.println("none " + time2);

        time2 = LocalTime.MIDNIGHT;

        System.out.println("midnight " + time2);

        time2 = LocalTime.MAX;

        System.out.println("max time " + time2);

        time2 = LocalTime.MIN;

        System.out.println("min time " + time2);

        LocalTime rightnow = LocalTime.now();


        System.out.println("hours of " + rightnow.getHour());
        System.out.println("mins of " + rightnow.getMinute());
        System.out.println("secs of " + rightnow.getSecond());
        System.out.println("hours of " + rightnow.getHour());

        LocalDate year1 = LocalDate.of(2017, 01, 01);
        LocalDate year2 = LocalDate.of(2018, 01, 01);

        Period per1 = Period.between(year1, year2);
        System.out.println(per1);


        LocalTime startTime = LocalTime.of(8, 30);

        LocalTime timmyTime = LocalTime.of(8, 25);

        if (startTime.isBefore(timmyTime)) {

            System.out.println("timmy was late");
        } else {

            System.out.println("timmy was on early");
        }


        LocalTime worldRecord = LocalTime.of(2, 3, 45);
        LocalTime myTime = LocalTime.of(2, 1, 50);


        if (myTime.plusMinutes(4).isBefore(worldRecord)) {

            System.out.println("mytime is better");


        } else {
            System.out.println("world record is better");

        }
        if (worldRecord.isBefore(myTime)) {

            System.out.println(" world 2 record is better");
        } else {

            System.out.println("mytime 2 is better");
        }

    }


    static void ex3() {


        //  LocalDateTime dateTime1 = LocalDateTime.
    }


    static void ex4() {

        // period only apply to dates , don't apply to times.

        Period yearPeriod = Period.ofYears(3);
        Period monthPeriod = Period.ofMonths(11);
        Period weekPeriod = Period.ofWeeks(3);
        Period dayPeriod = Period.ofDays(56);

        Period per1 = Period.of(2, 1, 2);
        System.out.println(per1);

        // period goes in year , months  and days


        // you can do minus numbers

        LocalDate myDate = LocalDate.of(2010, 02, 12);

        myDate = myDate.plus(per1);
        System.out.println(myDate);

        LocalDate mydate2 = LocalDate.of(2030, 03, 07);

        System.out.println(mydate2);

        Period betweenDAtes = Period.between(myDate, mydate2);
        System.out.println(betweenDAtes);
        Period per2 = Period.of(2015, 04, 9);
        System.out.println(per2.getDays());
        System.out.println(per2.getYears());
        System.out.println(per2.getMonths());
        System.out.println(per2);

        // period have the following characters , y,Y = year, m or M = months, D or d = day, P = period


        Period p5y1 = Period.parse("P5Y");
        Period p5y2 = Period.parse("P5Y");
        Period p5y3 = Period.parse("P5Y");
        Period p5y4 = Period.parse("+P5Y");
        Period p5y5 = Period.parse("-p-5Y");


        System.out.println(p5y5);
        // 9 month , 60 days


        Period p0y9m = Period.parse("p0y9m");
        Period p0y0m60d = Period.parse("p0y0m60d");

        System.out.println(p0y9m);
        System.out.println(p0y0m60d);


        LocalDate today = LocalDate.now();
        LocalDate futureLong = LocalDate.of(2056, 10, 20);


    }

    static void ex9() {

        DateTimeFormatter eurDate2 = DateTimeFormatter.ofPattern("dd MM yyyy");

        LocalDate myDate2 = LocalDate.parse("01 01 2017", eurDate2); // eurdate is the formatter
        // we can create a date time or tdate time by passing in a string .
        // we do this by using the parase method .
        // the parse method takes a string and a formatter
        //

        System.out.println("non formatted " + eurDate2);

        System.out.println("formatted" + myDate2.format(eurDate2));

      /*  Format formatter = new SimpleDateFormat("EEEE");
        String s = formatter.format(new Date());
        System.out.println(s);*/
    // it  has to be a valid date, the 1 of janaury is a thur,
        LocalDate wrong = LocalDate.parse("Wednesday 01 01 2015", eurDate2); // eurdate2 is the formatter



    }



}
