package com.practice;

class BeerBackwards {

    private static final String[] storage = {" green bottles of beer on the wall", " and if ",
            " green bottle should accidently fall, ", "They'll be ", " green bottle hanging on the wall", "no bottles of beer on the wall"};

    private static void songstuff(int number) {

        System.out.println(number + storage[0] + storage[1] + number + storage[2] + storage[3]);

    }

    public static void songPrint(int number) {
        if (number == 1) {

            System.out.println(number + storage[4]);

        }

        if (number == 0) {

            System.out.println(storage[3] + storage[5]);

        } else {

            songstuff(number);
            songPrint(number - 1);
        }

    }
}
