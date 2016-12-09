package com.test;

import java.util.Scanner;

/**
 * Created by shane on 07/12/2016.
 */
public class Main {


    public static void main(String args[]) {
        System.out.println();
        String number = "123";
        int test = Integer.parseInt(number);
        System.out.println(test);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter a number ");
        int numberinput = keyboard.nextInt();
        System.out.println("the number was "+ numberinput*2);

        System.out.println("num2");
        numberinput = Integer.parseInt(keyboard.next());

        System.out.println("number 2 is :"+ numberinput);




    }
}


