package com.android;

/**
 * Created by shane on 15/12/2016.
 * <p>
 * use this and usper to acces objects and construtors
 */
public class Main {

    public static void main(String args[]) {

        Employee eddie = new Employee();

        accountant bob = new accountant();

        bob.duties();

        Employee fred = new Employee(120);
        System.out.println(fred.age + "name is " + fred.name);

        accountant ann = new accountant();
        System.out.println("account ann called ");
        ann.angry();
        ann.sad();
        ann.callThis();

        Dog pippa = new Dog();

        pippa.accesSuper();

        //   Ferrai niceCar = new Ferrai();

        //niceCar.

        Vech v1 = new Vech();
        Vech v2 = new Vech();
        Vech v3 = new Vech();

        System.out.println(" vech count is : " + Vech.count);

    }


}
