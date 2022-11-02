package arrays;

import java.util.Arrays;

public class _07_StringArrayRecap {
    public static void main(String[] args) {

        // create a string array with length of 4

        String[] fruits  = new String[4];
        System.out.println(Arrays.toString(fruits));

        fruits[0] = " Apple";
        fruits[3] = " Kiwi";
        System.out.println(Arrays.toString(fruits));
        fruits[1] = "Grapes";
        fruits[2] ="Orange";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\n Reassigning value :");
        fruits[3] = fruits[0];
        fruits[2] = fruits[0];
        System.out.println(Arrays.toString(fruits));

        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
