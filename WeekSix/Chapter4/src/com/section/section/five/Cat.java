package com.section.section.five;

/**
 * Created by shane on 17/11/2016.
 */
public class Cat {


    String name;
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, int age) {

        super();
        this.name = name;
        this.age = age;

    }


    Cat() {


    }

    // overridden method, this is overriding the equal method from the object class
    public boolean equals(Object obj) {

        // return (this == obj);
        if (this == obj) {

            return true;
        }
        if (obj instanceof Cat) {

            Cat newCat = (Cat) obj;

            boolean check = name == newCat.name && age == newCat.age;

            return check;


        } else
            return false;
    }
}
