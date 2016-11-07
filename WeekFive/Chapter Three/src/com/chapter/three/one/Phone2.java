package com.chapter.three.one;

/**
 * Created by shane on 07/11/2016.
 */
public class Phone2 {

    String phonenumber = "123456789";

    void setNumber() {
        String phonenumber;
        phonenumber = "987654321";

    }

}


class TestPhone {

    public static void main(String args[]) {
        Phone2 p1 = new Phone2();

        p1.setNumber();
        System.out.println(p1.phonenumber);

    }


}
