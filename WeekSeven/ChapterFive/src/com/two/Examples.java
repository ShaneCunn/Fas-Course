package two;

/**
 * Created by shane on 24/11/2016.
 */
public class Examples {


    static void ex1() {


        int marks = 20;

        switch (marks) {


            case 10:
                System.out.println("mark is 10");
                break;
            case 20:
                System.out.println("mark is 20");
                break;
            case 30:
                System.out.println("mark is 30");
                break;

            default:
                System.out.println("invalid");
                break;
        }
            /*
            * you can only use
            * these:
            *
            * char,byte,short,int,String,Integer,Short,Byte,Character,enum
            *
            * */
        String days = "FRI";

        switch (days) {

            case "SUN":

                System.out.println("this is SUN");
                break;
            case "MON":

                System.out.println("this is MON");
                break;
            case "TUE":

                System.out.println("this is TUE");
                break;
            case "WED":

                System.out.println("this is WED");
                break;
            case "THU":

                System.out.println("this is THU");
                break;
            case "FRI":

                System.out.println("this is FRI ");
                break;
            case "SAT":

                System.out.println("this is SAT ");
                break;
            default:
                System.out.println("invalid day");


        }


    }

    static void ex2() {

        String days = "FRI";

        switch (days) {
            case "SAT":
            case "SUN":
                System.out.println("this is SUN");
                break;
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println("this is FRI ");
                break;

            default:
                System.out.println("invalid day");


        }

    }

    static void ex3() {
        int score = 10, num = 20;

        // you can put in a express in the switch

        switch (score += num) {


        }

        // you can only use certain variable types, whole numbers and Strings
        // chars, String and enums EXCEPT for a LONG

        // it too big a number


        // you can't use a boolean , as it gives only 2 options

        // or a double


    }
}
