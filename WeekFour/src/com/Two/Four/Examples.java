package com.Two.Four;

public class Examples {

    static void assignmentOper() {

        int a = 12, b = 3;

        a -= b; // same as a= a-b;
        System.out.println("a is " + a + " b is =" + b);

        b *= a;// same as b= b*a;
        System.out.println("a is " + a + " b is =" + b);

        a += b; // same as a= a+b;

        System.out.println("a is " + a + " b is =" + b);

		/*
         * you can't declare different variable types on the one line,
		 * 
		 * // double dnum 56.7, dnum2 = 3423.4, int num = 45;
		 * 
		 * 
		 */

        int c = 56;

		/*
         * read from right to left, a is the smae as b as the same as c
		 * 
		 * 
		 */

        a = b = c;

        boolean myboole = true;
        boolean myboolean2 = false;

		/*
         *
		 * cannot do the following myboole += myboolean;
		 * 
		 * 
		 * check to see if they are the same.
		 */

        long lNum = 1234567890123456789L; // 64 bit number

		/*
         * a int can fit inside a long , as it is a 32 bit number
		 * 
		 */

        int smallnum = 67;

        lNum = smallnum; // fits inside a long variable

		/*
         * we can cast from bigger number to smaller but you can get
		 * unpredictable results
		 */

        smallnum = (int) smallnum;

        System.out.println("small numbe is: " + smallnum);
        /*
         *
		 * */

    }

    static void ArithmeticOperators() {

		/*
		 * the arithmetic operators are : +,-,/,*
		 * 
		 * and modulus %
		 * 
		 * i++ post increment operator --i post decrement operator
		 * 
		 * ++i pre increment operator --i pre decrement operator
		 */

        int a = 8, b = 7;

        a = 3;
        b = 4;

        a = 4;
        b = 100;

        // always have to be separated by semi colon

        System.out.println("val of a is: " + a);

        System.out.println("val of b is: " + b);

        System.out.println(a % b);

        ++a; // ai s now 5
        System.out.println(" ++a is now : " + a);

        ++a;// a is now 6

        System.out.println(" a is now : " + a);

        // print out first and it then increment the number
        System.out.println(" a is now : " + (a++));

        // a++;

        System.out.println(" a is now : " + a);

        a = 10;
        b = 100;

        int num = a + b++;// it adds a and b first and it then increment b after

        System.out.println(" num is now : " + num);

        System.out.println("b is : " + b);

        b = 100;

        num = a + ++b;

        System.out.println(" num is now : " + num);

		/*
		 * this is the same as (num = 10+(100+1) =111
		 * 
		 */

        num = ++a + ++b;

        System.out.println(" num is now : " + num);

        a = 10;
        b = 100;

        num = ++a - b++;

        System.out.println(" num is now : " + num);

        a = 10;
        b = 100;

        num = ++a + b++ + b;

        System.out.println(" num is now : " + num);

        a = 10;
        b = 100;

        num = a-- + b-- + ++b - --a;

        System.out.println(" big num is now : " + num);

        a = 10;
        b = 100;

        num = ++a + --a + a++ + a - ++b + b + b--;

        System.out.println(" big num is now : " + num);

        a = 10;
        b = 100;

        num = a-- + b++ - a + b + ++a - --a;
        System.out.println(" big num is now : " + num);
        System.out.println(a + ", " + b + ", " + num);

        num = num++ - a++ + --b + b + ++num;
        System.out.println(a + ", " + b + ", " + num);
        System.out.println(" big num is now : " + num);

        char char1 = 'a'; // lower case is 97 in ascii

        System.out.println(char1 + char1);

        // char myChar = char1 + char1; will not work, as it trying to fit two
        // char together

        System.out.println(char1 * char1); // it will becoming a type int,
        // automatically

        // you can use all arithmetic operators with char

    }

    static void widening() {
        byte a = 2, b = 4;
        int counter = 0;
        // short snum = a + b;

        int num = a + b; // this is a now a int

        long lnum = 678l;

        // you always widen to the largest datatype, which is a long in this
        // case.

        lnum = num + a + b;

        System.out.println(lnum);

        double dnum = 4.5;

        dnum = dnum + num + a + b;

        System.out.println(++counter + " dnum " + dnum);

        byte b3 = 5, b4 = 9;

        a = 10;
        b = 100;
        num = ++a + a + +--a - --a + a++;

        System.out.println(" the  num is now : " + num);

    }

    static void relationalOperators() {

        int a = 10, b = 10, c = 100;

		/*
         * > < >= <= ! ==
		 * 
		 * 
		 * this statement will evaluate to a boolean true or false
		 */

        System.out.println(a > b); // prints false

        System.out.println(a >= b);// prints true

        System.out.println(a == c);// prints false
        // this will print 4 times
        for (int i = 0; i < 4; i++) {

            System.out.println("print " + i);
        }
        // this will print out for 5 times

        for (int i = 0; i <= 4; i++) {
            System.out.println("print 2 " + i);

        }

        a = 10;
        b = 10;
        c = 100;

        System.out.println(a != b);
        System.out.println(a != c);

        boolean b1 = false;

        System.out.println(b1 == true);

        // can't use incompatible data types to compare

        // System.out.println(b1> a);

        int num = 45, num2 = 90;
        System.out.println(num == num2);
		/*
		 * this is the assignment operator num2 has the value of of 90; this
		 * will be assigned to num and displayed , so this will display 90
		 * 
		 */
        System.out.println(num = num2);


        num = 45;
        num2 = 90;
        if (num >= 56) {


        }


    }


    static void logicalOperator() {

        System.out.println("");

        /* &&  is AND  have both have to be true
        * ||  is OR  either can be true
        * ! is NOT
        *
        *
        * */

        int a = 10, b = 20;

        // both have to be true

        System.out.println(a > 20 && b > 20); // false
        //either can be true
        System.out.println(a > 20 || b > 20); // true
        // NOT true
        System.out.println(!(a > 10)); // true


        System.out.println(!(b > 10)); // true



        /* && are called short circuit operators , if the first part evalautes to false ,
         it does not  bother with the second or subsequent ones */

    /* & ensure both sisdes are evaluated and are impletmented, even if  the first argument is false,
    *so here is incremetneted by one
    *
    *
    */
        System.out.println(a > 20 & ++a < 100);


        String str = null;

        if (str != null && str.length() > 0) {

            System.out.println(str.toUpperCase());
        }


    }


    static void precedence(){


    }

}
