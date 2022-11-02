package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        // create a double array  with this values 1.5, 2.3, -1.3, -3.7

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(decimals));
        System.out.println(" The lenght of Array is " + decimals.length);
        // sort from bigger to smaller

        Arrays.sort(decimals);
        System.out.println("Array after sorting " + Arrays.toString(decimals));

        // print in separete lines

        //When  need indexes or increment to use go fori  with arrays
        System.out.println("\n Fori loop below :");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }
        //When dont need indexes or increment to use go for each with arrays
        System.out.println("\n For each loop below :");
        for (double d : decimals){
            System.out.println(d);
        }
        System.out.println("\n Fori loop  prins two arrays below :");
        for (int i = 0; i <decimals.length ; i++) {
            System.out.println(decimals[i] + "-" +chars[i]);
        }


    }
}
