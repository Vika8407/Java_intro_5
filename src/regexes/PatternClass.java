package regexes;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");
        System.out.println(pattern);// returns pattern
        System.out.println(pattern.pattern());// returns the pattern as a string
        System.out.println(pattern.toString());// returns the pattern as a string
        System.out.println(Pattern.matches(pattern.pattern(),"Apple"));// return false  becouse uppercase

        String str = " I go to school at TechGlobal and I love it";
        String [] arr = str.split("[a-z0-9]{5,10}");
        System.out.println(Arrays.toString(arr));



        System.out.println("\t\n ============ TASK 1 ============\n");

               /*
                    Ask the user to enter a username.
            If the username matches the format of [a-zA-Z0-9]{5,10}, print out
            “Valid Username”.

            If it does not match the desired format then print out “Error!
            Username must be 5 to 10 characters long and can only contain
            letters and numbers”
            Scenario 1:
            Program: Please enter a username
            User: JDoe123
            Program: Valid Username
            Scenario 2:
            Program: Please enter a username
            User: John Doe
            Program: Error! Username must be 5 to 10 characters long and can
            only contain letters and numbers
                     */

         String username = ScannerHelper.getAName();
         pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");

         if (pattern.matches(pattern.toString(),username))
             System.out.println("Valid user name");
         else System.out.println("Error! Username must be 5 to 10 characters long and can \n" +
                 "     only contain letters and numbers");

               // or another way
        if (username.matches("[a-zA-Z0-9]{5,10}"))
            System.out.println("Valid user name");
        else System.out.println("Error! Username must be 5 to 10 characters long and can \n" +
                " only contain letters and numbers");

























    }
}
