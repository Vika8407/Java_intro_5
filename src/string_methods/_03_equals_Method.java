package string_methods;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class _03_equals_Method {
    public static void main(String[] args) {
        /*
        1. RETURN
        2. RETURNS A BOOLEAN
        3. NON STATIC// CALLED WITH OBJECT
        4. IT TAKES 1 OBJECT AS ARGUMENT
         */
        String s1 = " hello ";
        String s2 = " java ";
        String s3 = " Hello ";

        boolean b1 = s1.equals(s2);

        System.out.println( b1 ); // false
        System.out.println(s2.equals(s3));// false
        System.out.println(" abc " .equals("abc  "));// false
        System.out.println("" .equals(""));// true
        System.out.println("" .equals("  "));// false
        System.out.println(s1.equalsIgnoreCase(s3));// true



    }
}
