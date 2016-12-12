package com.android.one;

import microsoft.Accountant;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");

        Employee bob = new Employee(18, "bob");

        Fireman sam = new Fireman(29, "john");

        Employee eddie = new Employee(25, "not a name");

        eddie.sendinvite(sam);
        eddie.sendinvite(bob);
        eddie.name = "peter";
        eddie.sendinvite(eddie);
        Accountant fred = new Accountant();

        fred.getClass();

    }
}
