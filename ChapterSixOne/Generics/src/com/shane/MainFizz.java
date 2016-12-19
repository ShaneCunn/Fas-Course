package com.shane;

import java.util.Scanner;

/**
 * Created by shane on 16/12/2016.
 */
public class MainFizz {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("type quit to quit");

        boolean runner = true;
        int num = 0;
        while (runner) {
            System.out.println("enter  a number: ");

            try {
                num = Integer.parseInt(keyboard.next());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Please enter a integer");
            }
            if (num == 101) {
                runner = false;
            }
            for (int i = 1; i <= num; i++) {

                //  System.out.println(i);

                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("fizzbuzz: " + i);
                } else if (i % 5 == 0) {

                    System.out.println("buzz: " + i);

                } else if (i % 3 == 0) {
                    System.out.println("fizz: " + i);
                }
            }
        }
        System.out.println("quitting program");
        keyboard.close();
    }
}
