package com.three.one.two;

/**
 * Created by shane on 07/11/2016.
 *
 * this is a exam objective 1.1 define the scope of variable
 */
public class Main {

    public static void main(String args []){

        Monkey monty = new Monkey();
        Lion leo = new Lion();
        Elephant nellie = new Elephant();
        Zebra zed = new Zebra();


        Zoo newZoo = new Zoo(monty, leo, nellie, zed);

        monty = new Monkey();
        nellie = new Elephant();
        leo = new Lion();
        zed = new Zebra();
        // with the var argument list you can pass it, many ints , ie one int, 2 int, or many ints
        // ... this is actually an array , this takes  the var passed to it to the method  into an array
        Person percy = new Person();
        percy.daysWorked(2, 3, 4, 5);
        percy.daysWorked(2);
        percy.daysWorked(2, 3);


    }
}
