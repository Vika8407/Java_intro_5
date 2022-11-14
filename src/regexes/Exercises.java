package regexes;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}","JohnDoe_123"));
        System.out.println(Pattern.matches("[\\w]{8,15}","JohnDoe_123"));// it can be a word
        System.out.println(Pattern.matches("[\\d]{8,15}","12345678910"));//meta for numbers
        System.out.println(Pattern.matches(".+","John12345@#$ "));//meta for everything

        System.out.println("\t\n ============ TASK 1 ============\n");
       // Write regex SSN format
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}","000-00-0000"));

        System.out.println("\t\n ============ TASK 2 ============\n");
      //Write regex patter phone number format
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","(000)-000-0000"));

        System.out.println("\t\n ============ TASK 3 ============\n");
        //Hoe much wood woud a wood chuck if a wood chuck could chuck wood
        //replase wood with ****
        String str ="How much wood woud a wood chuck if a wood chuck could chuck wood";
        System.out.println(str.replaceAll("wood","****"));

        System.out.println("\t\n ============ TASK 4 ============\n");
        // replace all special chars and spaces in a string
        String str1 = "abc 123 $#^ ";
        System.out.println(str1.replaceAll("[ $#^]",""));// works but not dynamic.
        System.out.println(str1.replaceAll("[\\w]",""));//doesn't work because w includes _;
        System.out.println(str1.replaceAll("[^a-zA-z0-9]",""));//best way

        System.out.println("\t\n ============ TASK 5 ============\n");
        // create a Regex pattern that chakes for a first and last name
        System.out.println(Pattern.matches("[\\w]{2,}[ ][\\w]{2,}","John Doe"));// my way
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}","John Doe"));//different i way
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+","John Doe"));// teachers way with capital letter  \\s its space

        System.out.println("\t\n ============ TASK 6 ============\n");

                   /*
                   Assume you are given a String that contains Letters and numbers
           Using REGEX, print out 2 Arrays, one with the letters of the string and 1 with
           the numbers
           TestData1:
           String str = “A1b2C#”;
           Program:
           [A, b, C]
           [1, 2, 3]
           TestData2:
           String str = “%ABC123#”;
           Program:
           [A, B, C]
           [1, 2, 3]
           TestData3:
           String str = “abc”;
           Program:
           [a, b, c]
           []
                    */

        String s = "###A1%%%b2#$@C^&3";
        System.out.println(Arrays.toString(s.replaceAll("[^A-Za-z]","").toCharArray()));// will return AbC
        System.out.println(Arrays.toString(s.replaceAll("[^0-9]","").split("")));// will return A123


















    }
}
