package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_ForEach {
    public static void main(String[] args) {

        /*
        Create an ArrayList to store below colors
        Blue
        Red
        Brown
        Pink
        Yellow
        Black

         */

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red","Brown","Pink", "Yellow" ,"Black" ));
        System.out.println(colors);

        System.out.println("\n-----------Iterating with ForI ----------\n");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("\n-----------Iterating with ForEach ----------\n");

       // for (String color : colors) {
       //     System.out.println(color);
       //
       // }

        colors.forEach(System.out::println);




    }
}
