package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_StringArayList {
    public static void main(String[] args) {

        System.out.println("\n -----------Task 1----------\n");

                /*
        Create an ArrayList and store below cities in it
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList

        EXPECTED:
        3
        [Chicago, Berlin, Miami]
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n -----------Task 2----------\n");
        //Replace index 2 with Evanston
        cities.set(2,"Evanston");
        System.out.println(cities);

        System.out.println("\n -----------Task 3----------\n");

        //delete Berlin, Miami
        cities.remove(1);
        cities.remove(0);
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n -----------Task 4----------\n");
                    /*
            TASK
            Add below cities to ArrayList
            New York
            Rome
            Gent

            Print the ArrayList
            Print the size

            EXPECTED:
            [Evanston, New York, Rome, Gent]
            4
             */
        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n -----------Task 5----------\n");

        //remove all elements
        cities.clear();
        System.out.println(cities);
        System.out.println(cities.size());



    }
}
