package three;

import java.util.Arrays;

/**
 * Created by shane on 24/11/2016.
 */
public class Examples {

    static void ex1() {

        // for loops and statements

        // you can have as many initisation statements as you want
        // the must be data type

        for (int i = 0, j = 1, m = 3; i < 4; i++) {


        }

        // only termination condition is allowed
        for (int k = 0; k < 4; k++) {


        }


    }

    static void ex3() {


        String[] names1 = {"harry", "george", "mary"};
        String[] names2 = {"harry2", "george2", "mary2"};
        String[] names3 = {"harry3", "george3", "mary3"};


        String[][] name2DList = {names1, names2, names3};


        for (String[] row : name2DList) {

            System.out.println(Arrays.deepToString(row));


        }


   /*     for (int rows = 0; rows < name2DList.length; rows++) {
            for (int columns = 0; columns < name2DList[rows].length; columns++) {
                System.out.print(name2DList[rows][columns] + "\n");
            }
            System.out.println();
        }*/


    }
}
