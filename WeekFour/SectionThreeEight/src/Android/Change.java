package Android;

/**
 * Created by shane on 09/11/2016.
 */
public class Change {


    static void changePrimitive(int num, boolean myBool) {

        num = 100000;
        myBool = true;

        System.out.println("inside method value are :" + num + " mybool " + myBool);


    }

    static void changeObject(Dog spot) {
        // spot is now a new  dog
        spot = new Dog();

        System.out.println("new address is " + spot);


    }
}
