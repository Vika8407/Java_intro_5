package string_methods;

public class Exercise02_StringComperasion {
    public static void main(String[] args) {
        /*
        In this task we will learn different ways of ignoring cases.
         that you
         */
        String  str1 = "JAVA";
        String  str2 = "java";

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.toLowerCase().equals(str2));//true
        System.out.println(str1.equals(str2.toUpperCase()));// true



    }
}
