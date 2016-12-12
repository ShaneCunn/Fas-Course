package microsoft;

import com.android.one.Employee;

/**
 * Created by shane on 12/12/2016.
 */
public class Accountant extends Employee {

    void getVar() {

        System.out.println("age is:" + age);

        // System.out.println("name is: "+ name); name is default level access, only available inside it own package

        // System.out.println("phone num is"+ phoneNum); won't work as it is private

        System.out.println("Email is " + email); // it is available in it won class and derived classes


    }


}
