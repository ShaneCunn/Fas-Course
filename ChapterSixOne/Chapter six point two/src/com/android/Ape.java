package com.android;

/**
 * Created by shane on 13/12/2016.
 */
public class Ape {

    public void eat() {
        System.out.println("ape eating");
    }

    protected void drink() {
        System.out.println("ape drinking");

    }

    void breed() {
        System.out.println("ape breeding");
    }

    // can't override this method,  as it is only available inside the Ape class
    private void sleeping() {
        System.out.println("ape sleeping");
    }


}

class Human extends Ape {

    // this is not overridden , this a brand new sleep method, no relationship
    // can't overridden a private method
    private void sleeping() {
        System.out.println("human sleeping");
    }

    // this has package private , ie default level access , which is  less accessible thatn the public eat() method in the ape class.
    // a overrridden
   /* void eat() {

    }

    protected void eat() {

    }

    private void eat() {

    }*/


   /*
    this is allowed as it has more access
   protected void drink() {


    }*/

    public void drink() {


    }

    /*

    all these acces levels work as we are overrriding breed()
   void breed(){

    }

    protected void breed(){}
    */
    public void breed() {
    }


}