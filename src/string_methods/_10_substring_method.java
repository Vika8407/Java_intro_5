package string_methods;

public class _10_substring_method {
    public static void main(String[] args) {

        /*
         1.RETURN
         2. RETURN A STRINGS
         3. NON STATIC
         4. IT IS OVERLOADED AND TAKES 1 OR 2 INT INDEX ARGUMENTS
         */

        String  s = "TechGlobal";
        // get Global
        String s1 = s.substring(4);// from 4 index to the end
        System.out.println(s1);

        // Get Tech
        System.out.println(s.substring(0,4));
        //or
        String  s2 = s.substring(0,4);
        System.out.println( s2);

    }
}
