package string_methods;

public class _11_startsWith_endWith_Methods {
    public static void main(String[] args) {
        /*
        1.RETURN
        2.RETURN A BOOLEAN
        3. NON - STATIC
        4. THERE ARE OVERLOADED METHODS BUT WE WILL USE ALWAYS THE ONE WITH ARGS
         */

        String s = " TechGlobal";
        System.out.println(s.startsWith("T"));// true
        System.out.println(s.startsWith("t"));// false
        System.out.println(s.startsWith("Tech"));// true

        System.out.println(s.endsWith("Global"));// true

        // IMPORTANT
        String city ="Chicago";
        System.out.println(city.startsWith("Chicago")); //true
        System.out.println(city.endsWith("Chicago"));//true
        System.out.println(city.startsWith(""));// true
        System.out.println(city.endsWith(""));// true

        System.out.println(city.startsWith("M"));// false
        System.out.println(city.endsWith("lin"));// false
    }
}
