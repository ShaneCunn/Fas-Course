package com.section.section.five;

/**
 * Created by shane on 17/11/2016.
 */
public class Ape {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ape)) return false;

        Ape ape = (Ape) o;

        if (age != ape.age) return false;
        return name != null ? name.equals(ape.name) : ape.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    String name;
    int age;


    public Ape(String name, int age) {

        super();

        this.name = name;
        this.age = age;

    }


}
