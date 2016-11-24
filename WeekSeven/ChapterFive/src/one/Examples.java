package one;

/**
 * Created by shane on 23/11/2016.
 */
public class Examples {


    static void ex1() {

        int age = 18;

        if (age > 18) {

            System.out.println("you are older than 18");
        } else if (age == 18) {

            System.out.println("you are  18");
        } else {

            System.out.println("you are younger than 18");
        }

        int weight = 40;

        // assigning values to var weight
        System.out.println(weight = 45);


        // comparing values
        if (weight == 67) {


        }


        if ((weight += 10) > 20) {

            System.out.println("will print out");
        }

        boolean test = true;
        if (test) {

            System.out.println("boolean true");
        }
        if (test == true) {
            System.out.println("boolean true as well");


        }

        int num1 = 10, num2 = 20;
        if ((num1 + num2) > 50) {

            System.out.println("number less than 50");
        } else {
            System.out.println("number is greater than 50");

        }


        String result = "1";
        int score = 10;
        if ((score = score + 10) == 100)
            result = "A";
        else if ((score = score + 29) == 50)
            result = "B";
        else if ((score = score + 200) == 10)
            result = "C";
        else
            result = "F";
        System.out.println(result + ":" + score);
    }


    static void ex2() {

        int age = 14;
        if (age >= 17)
            System.out.println("over 18");
        else {
            System.out.println("Test out");

        }

        // you can have a if statement all by itself, but as soon you put a else ,
        // you have to put in a body
        // also this person will now be 28 age


        if ((age + 10) > 30) ;

        if (age > 30) {

        }//System.out.println(); // you can't put any exe statement between the body of your if statements
        else {

        }


    }

    static void ex3() {

        String name = "Lion";

        if (name.equals("Lion"))
            System.out.println("feed me meat");
        else if (name.equals("horse"))
            System.out.println("feed me hay");

            // no more than one line, other it will cause an error
            //  System.out.println("test");
        else
            System.out.println("feed me cabbages");
        System.out.println("hippo like cabbages");

        if (name.equalsIgnoreCase("ostrich"))
            for (int i = 0; i < 4; i++) {// treat for loop as one line
                System.out.println(i);
                System.out.println("print out");


            }
        else
            for (int j = 1; j < 3; j++)
                System.out.println("second loop");


    }

    static void ex4(int score2) {
        int score = 110;
        // this.score = score2;
        score = score2;
        if (score < 400) {

            if (score > 300) {

                System.out.println("print greater than 400 greater than 300");
            } else {
                System.out.println("print less than 400 less than 300");
            }
        }

    }


}
