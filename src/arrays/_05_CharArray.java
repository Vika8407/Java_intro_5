package arrays;

import java.util.Arrays;

public class _05_CharArray {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");

             /*
            TASK-1
            Create a char array and store values below
            #
            $
            5
            A
            b
            H

            Print the array

            EXPECTED:
            [#, $, 5, A, b, H]
             */
        char[]characters = {'#', '$', '5', 'A', 'b','H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\t\n ============ TASK 2 ============\n");

                /*
        TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */


        int[] number = new int[6];
        System.out.println(" The size of  the array = " + number.length);

        System.out.println("\t\n ============ TASK 3 ============\n");

                    /*
            TASK-3
            Print each element using fori loop

            EXPECTED:
            #
            $
            5
            A
            b
            H
            */
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        System.out.println("\t\n ============ TASK 4 ============\n");

        for ( char character : characters){
        System.out.println(character);
    }
        System.out.println("\t\n ============ TASK 5 ============\n");

                    /*
            TASK-5
            Print each element that are letters

            EXPECTED:
            A
            b
            H
             */
        for ( char character : characters){
            if(Character.isLetter(character)) System.out.println(character);
        }
        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        System.out.println("\t\n ============ TASK 6 ============\n");

                    /*
            Count how many uppercase characters you have in the array

            EXPECTED:
            2
             */
        int countU1 = 0;
        for ( char character : characters){
            if(Character.isUpperCase(character)) countU1++;
        }

        int countU2 = 0;
        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i])) countU2++;
        }



    }
}
