package conditional_statements.if_else_statements;

import java.util.Scanner;

public class ShortsIfElse {
    public static void main(String[] args) {

        /*
        Write a programs that ask user to enter 2 different numbers.
        And the max number and print it with a massage as below
        EXAMPLE PROGRAM:
        Please enter 2 numbers
        User: 5 10

        Program: 10 is the greatest

        NOTE: Do not use Math class
          */

         // we can use this shortcut only in single statement( we need {} in multiple)!!!
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a 2 different  ");
        int  num1 = input.nextInt(), num2 = input.nextInt();

        int greatest;

        if (num1 > num2)greatest = num1;

        else System.out.println( num2 + "is a greatest");

            System.out.println(" End of the program");











    }
}
