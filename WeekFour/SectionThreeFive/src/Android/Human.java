package Android;

/**
 * Created by shane on 09/11/2016.
 */
public class Human {


    int age;
    String name;
    double weight;
    boolean sex;

    Human() {// constrcutor 1
        this(10); // calling the constructor that a takes an int;

        System.out.println("blank constructor shown");
    }


    Human(int age, String name, double weight, boolean sex) {

// constructor 2
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
// when  calling another constrcutor from another constructor,

    }


    Human(int age) {

        //constructor 3

        this.age = age;
    }


}






















