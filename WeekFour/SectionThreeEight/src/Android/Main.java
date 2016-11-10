package Android;

/**
 * Created by shane on 09/11/2016.
 * <p>
 * exam objective 6.6 determine the effect upon object creation
 */
public class Main {

    public static void main(String args[]) {
        Dog spot = new Dog();

        // if you pass a primitive var to a method this method
        // then change the values of the primitive, it stills has the same
        int num = 10;

        String name = "Spot";
        boolean myBool = false;//
        // before method it will print 10 and false
        System.out.println("before method call, \n num is " + num + " mybool is: " + myBool);

        System.out.println();
        Change.changePrimitive(num, myBool);
        // after method it will print
        System.out.println("after method call, \n num is " + num + " mybool is: " + myBool);

        spot.name = "lassie2";
        System.out.println(spot);
        System.out.println("dog name is :" + spot.name);
        Change.changeObject(spot);

        //when you pass a method to a object, you can't change what the object refers to
    }


    static void Changeinstance(Dog spot) {


    }
}
