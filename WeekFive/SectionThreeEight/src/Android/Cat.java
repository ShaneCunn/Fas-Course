package Android;

/**
 * Created by shane on 09/11/2016.
 */
public class Cat {

    int age = 12;
    String name = "bob";
    double weight = 3.45;


    static void changeCat(Cat tibbles){


        tibbles.name = "peter";
        tibbles.age = 200;
        tibbles.weight = 678.6;

        tibbles = new Cat();

    }

}
