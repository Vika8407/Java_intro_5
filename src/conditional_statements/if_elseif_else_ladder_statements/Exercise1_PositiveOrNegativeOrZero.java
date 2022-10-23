package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {

        /*

        Write a program that asks user to enter a number
        if number is more than zero, print "POSITIVE"
        if number is less than zero, print "NEGATIVE"
        Otherwise, print "ZERO"
         */


        Scanner input = new Scanner(System.in);
        System.out.println( " Enter a number");
        int number = input.nextInt();

        // logical mistakes ( we should  start from 0 to positive)
        if (number == 0){
            System.out.println(" zero ");
        }
        else if( number < 0){
            System.out.println(" negative ");
        }
        else {
            System.out.println("positive");
        }

        System.out.println("End of the program!");

        /*
        solution 1
         */
         /*
Solution 1 - ladder
 */

        if(number > 0){
            System.out.println("POSITIVE");
        }
        else if(number < 0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }

/*
Solution-2 nested if else statements
 */
        if(number == 0){
            System.out.println("ZERO");
        }
        else{
            if(number < 0){
                System.out.println("NEGATIVE");
            }
            else{
                System.out.println("POSITIVE");
            }
        }



















    }
}
