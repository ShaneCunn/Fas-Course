package Android;

/**
 * Created by shane on 09/11/2016.
 */
public class Animal {

    Animal() {

        System.out.println("animal called ");
    }


    class Cow extends Animal {


        Cow() {
            super(); // calles the animal constrcutor first implicitly
            System.out.println("cow constrcutor called ");
        }
    }
}
