package com.android;

/**
 * Created by shane on 14/12/2016.
 */
public class Main {


    public static void main(String args[]) {
        accountant bob = new accountant();

        System.out.println(bob.name);
        bob.clockIn();
        bob.fiddleTheBook();
        bob.earn();
        System.out.println(bob.PPS);
        //   System.out.println("array values are :"+ bob.qualifications);

        for (String b : bob.qualifications) {

            System.out.println("array values are :" + b);
        }

        Employee eddie = new accountant();

        Employee fred = new fireman();

        // reference determines what methods and var can be called , only method first defined in the emp calls and be called


        System.out.println(eddie.name);

        // it always check it own class first
        eddie.earn();
        eddie.holiday();

        Fight fighter = new Person();

        fighter.stab();
        fireman john = new fireman();
        fireman sarah = new fireman();
        accountant peter = new accountant();
        accountant mary = new accountant();

        Work[] workEmp = new Work[4];

        workEmp[0] = john;
        workEmp[1] = sarah;
        workEmp[2] = peter;
        workEmp[3] = mary;

        for (Work b : workEmp) {

            b.clockIn();
        }




    }
}
