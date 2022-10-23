package string_methods;

import java.util.Arrays;

public class _16_Split_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns a string array
        3. non - static
        4. it takes regex as argument
         */
        String s = " Today is Sunday and the weather is nice ";
        String [] arr1 = s.split(" "); //[Today, is, Sunday, and, the, weathe,r is,  nice]
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(s.split("is")));
    }
}
