package Android;

/**
 * Created by shane on 08/11/2016.
 */
public class Cat {

    int age;
    String name;
    double weight;

    //  constructor with no arguments
Cat(){

    age =12;
    name = "tibbles";
    weight =12.3;
}
// this is a constructor that takes an int , and assign that int to age
Cat (int newAge){

    age = newAge;


}


Cat(int age, String name , double weight){


    this.age = age;
    this.name = name;
    this.weight = weight;
}



}
