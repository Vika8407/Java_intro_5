package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_CountElements {
    public static void main(String[] args) {
        System.out.println("\t\n ============ TASK 1 ============\n");
        /*
        Create an Array list and store below colors
        blue
        brown
        pink
        yellow
        red
        purple
        Print the Array list
        Print size
        Print each element separately
         */

        String[] elements = {"Blue","Brown", "Pink","Yellow","Red","Purple"};
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(elements));

        //colors.add("Blue");
        //colors.add("Brown");
        //colors.add("Pink");
        //colors.add("Yellow");
        //colors.add("Red");
        //colors.add("Purple");
        System.out.println(colors);
        System.out.println(colors.size());
        for ( String color : colors){
            System.out.println();
        }

        System.out.println("\t\n ============ TASK 2 ============\n");

               /*
               Count elements that has length of 6
               expected :2
                */

       int count6 =  0;
        for (String color : colors){
            if(color.length() == 6 )count6++;
        }
        System.out.println(count6);

        count6 =0; // resetting counter
        for (int i = 0; i < colors.size(); i++) {
           if (colors.get(i).length() == 6) count6++;
        }
        System.out.println(count6);


        System.out.println("\t\n ============ TASK 3 ============\n");

        /*
        Count the elements that has 'o'
        expected: 2
         */

        int countO = 0;
        for ( String color : colors){
            if( colors.contains("o"))countO++;
        }
        System.out.println(countO);

        countO = 0;
        for (int i = 0; i < colors.size() ; i++) {
            if(colors.get(i).toLowerCase().contains("o"))countO++;
        }
        System.out.println(countO);

    }
}
