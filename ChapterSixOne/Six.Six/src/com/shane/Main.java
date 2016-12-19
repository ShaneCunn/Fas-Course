package com.shane;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by shane on 16/12/2016.
 * <p>
 * <p>
 * write a lambda expression that consumes a lambda predicate expression
 */
public class Main {

    public static void main(String args[]) {

        System.out.println("hello shane");
// lambda always start with a interface
        behaviour B1 = (int a, int b) -> {
            System.out.println("b1 interface called ");
            System.out.println(a * b);

            return a * b;

        };

        behaviour b2 = (int a, int b) -> {
            System.out.println("b2 interface called ");
            System.out.println(a + b);

            return a + b;
        };

        behaviour b3 = (int a, int b) -> {
            System.out.println("b3 interface called ");

            System.out.println(a / b);
            return a / b;
        };


        //   b1 is implememetning the abs method lambda1 contianed with the behaviour interface
        B1.lambdaTest(12, 3);

        b2.lambdaTest(12, 3);

        b3.lambdaTest(12, 3);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach(System.out::println);


        takeLambda(14, 4, B1);
    }

    // this is a method that 2 ints and a lambda or a class that implements a behaviour interface

    // if you sent he b1 lambda it will be *  the numbers
    static void takeLambda(int a, int b, behaviour behave) {

        System.out.println(" take lambda called ");
        behave.lambdaTest(a, b);

        Employee bob = new Employee(32, 45, "eddie");
        Employee mary = new Employee(24, 23, "mary");

        System.out.println(mary.getRating());


        validate performanceTest = (emp) -> {

            return false;
        };


        /*
*  there is a built in interface called a predicate , which looks like htis
*  public interface predicate <T>{
*
*  boolean test(T t)
*  }
*
*  this takes any data type returns a boolean
*
* */


        Predicate<Employee> predicate = (emp) -> {

            return emp.getRating() > 5;
        };

    }

}

interface behaviour {
    int lambdaTest(int a, int b);

}

interface manners {


    boolean lambda2(int a, String name);
}

// this takes our lambda and  tkaes a an meployee
interface validate {

    boolean check(Employee emp);
}

/*
* Lambda only work interfaces that have only ONE ie abstract or normal method in it,
*
*
*
*
* */
class Dog implements behaviour {


    @Override
    public int lambdaTest(int a, int b) {
        return 0;
    }

    void eat(int num) {


    }


}





