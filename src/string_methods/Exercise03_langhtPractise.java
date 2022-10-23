package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise03_langhtPractise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a string ");
        String n1 = input.nextLine();
        int s1 = n1.length();
        System.out.println(" Please enter a string 2");
        String  n2 = input.nextLine();
        int s2= n2.length();

        System.out.println(s1);
        System.out.println(s2);

        String str1 = ScannerHelper.getAString();
        String str2 = ScannerHelper.getAString();

        System.out.println( " " + str1);
        System.out.println( " " + str2);

    }
}
