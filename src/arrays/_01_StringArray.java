package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. Assigning value to a specific indexes
        countries[1] = "Spain";

        // 3. Print specific index from an array
        System.out.println(countries[0]);//null
        System.out.println(countries[1]);//Spain

        // 4. Printing an array
        System.out.println(Arrays.toString(countries));//[null,Spain,null]
        
        /*
        Assign Blgium to index of 2 and print array once again
         */
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries));

        // 5. Update existing element
        countries[1]  = " France" ;
        System.out.println(Arrays.toString(countries));// [null, France, Belgium ]

        // 6. Getting the length of an array - how many elements -3
        System.out.println(countries.length); // 3

        // 7. Printing each element separately
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
               //with loops
        for (int i = 0; i < 2; i++) {
            System.out.println("Countries at index of " + i + countries[i]);
        }
        








    }
}
