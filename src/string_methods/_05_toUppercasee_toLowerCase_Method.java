package string_methods;

public class _05_toUppercasee_toLowerCase_Method {
    public static void main(String[] args) {
        /*
        1. RETURN type
        2. RETURNS A STRING
        3. NON STATIC
        4. THE ONE WE USE DOES NOT TAKE ANY ARGUMENT - THERE ARE  OVERLOADED METHODS
         */
        String name = " John";

        System.out.println(name.toLowerCase());// john
        System.out.println(name.toUpperCase());// John

        System.out.println(" hello ".toUpperCase());// HELLO
        System.out.println( "hello".toLowerCase());//hello
        System.out.println( "abc".toUpperCase().toLowerCase());//hello
        System.out.println( "ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase());//abxy







    }
}
