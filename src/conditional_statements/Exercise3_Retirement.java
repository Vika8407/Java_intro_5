package conditional_statements;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {
                /*
        Write a Java program that asks user to enter their age
        And print "It is your time to get retired!" if their age is more than or equal to 55
        else calculate and tell user how many years later they can be retired

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 60

        Program: It is your time to get retired!

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 45

        Program: You have 10 years to be retired

         */

        Scanner input = new Scanner(System.in);

        System.out.println(" What is your age");
        int age = input.nextInt();
        if ( age >= 55) {
              System.out.println("It is your time to get retired!");
        }
        else {
            int difference =( 55- age);
            if ( difference ==1){
                System.out.println("Yuo have 1 year to be retired");
            }
            else {
                System.out.println(" Yuo have" + difference + "  years to be retired ");
            }
            System.out.println(" Yuo can retire in " + ( 55 - age) + " years");
        }

        System.out.println("End of the program!");






    }
}
