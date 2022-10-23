package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComperison {
    public static void main(String[] args) {
                    /*
            Write a Java program that asks user to enter 2 strings
            And store answers of user in different String variables
            Finally, check if given 2 Strings are equal or not and print messages given below

            Test data 1:
            Java is fun
            Hello World

            Expected output 1:
            These strings are not equal

            Test data 2:
             Hello


            Expected output 2:
            These strings are equal
             */

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string1 ");
        String s1 = input.nextLine();
        System.out.println(" Enter a string2 ");
        String s2 = input.nextLine();

        if (s1.equals(s2)) System.out.println(" The strings are equal");
        else System.out.println(" This string are not equal");


        String a1 = ScannerHelper.getAString();
        String a2 = ScannerHelper.getAString();

        if (a1.equals(a2)) System.out.println(" This string are equal");
        else System.out.println(" These string are not equal");


    }

}
