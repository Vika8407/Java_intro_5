package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {
       // abs method we aren always getting positive result
        System.out.println( " Difference between your numbers is =" + Math.abs(10-14));
        System.out.println( " Difference between your numbers is =" + Math.abs(14-10));
        System.out.println( " Subtraction between your numbers is =" + (10-14));


                    /*
            Write a program asks user two ages and gets the difference between ages
            and prints them

            Output:
            "Please enter an age"
            input -> 24
            "Please enter another age"
            input -> 32

            "Difference between your ages is = 8"
             */
        Scanner input = new Scanner(System.in);
        System.out.println( " Please enter an age " );
        int age1 = input.nextInt();
        System.out.println( " Please enter another age " );
        int age2 = input.nextInt();
        System.out.println(" Difference  is " + Math.abs(age1 - age2));

        System.out.println("Bigest age is = "  + Math.max (age1 ,age2));
        System.out.println(" Smallest age is = "  + Math.min (age1,age2));


    }
}
