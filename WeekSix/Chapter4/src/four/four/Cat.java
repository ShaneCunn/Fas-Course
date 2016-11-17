package four.four;

/**
 * Created by shane on 16/11/2016.
 */
public class Cat extends Animal {

    int age;
    String name;

    @Override
    public String toString() {
        return "Cat is age= " + age +
                ", name his = '" + name + '\'' +
                '}';
    }

    public Cat(int age, String name) {

        this.age = age;
        this.name = name;


    }

    Cat() {


    }

    void eat() {

        System.out.println(name + " eating");

    }

}
