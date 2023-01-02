package collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuolicates {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(removeDuplicates(new Integer[]{-5,10,-5,10,1,})));

    }

    /*
     Create a method that takes an array of numbers below
     -5,10,-5,10,1,2,5

     Remove all duplicates and return a new array
     [-5,10,1,2,5]
     */
    public static Integer[] removeDuplicates(Integer[] arr){

        LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(arr));

        return  new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
    }
}
