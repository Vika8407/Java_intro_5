package practice.if_else_statements;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {

        System.out.println("\n-------Task1------\n");
        int rNumber = (int) (Math.random() * (51) + 0);
        System.out.println(" Random number between 0 and 50 is " + rNumber);

        // if else solution
        int m1 = (rNumber);
        System.out.println(" My random number  is = ");
        if (m1 >= 10 && m1 <= 25) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }

        // ternary  solution( expression) ? : " true" : " false ";
        System.out.println((m1 >= 10 && m1 <= 25) ? " treu" : " false");

        // printing booling expration
        System.out.println((m1 >= 10 && m1 <= 25));

        System.out.println("\n-------Task2------\n");


        int random = (int) (Math.random() * (100) + 1);
        System.out.println(" Random number between 1 and 100 is " + random);
        System.out.println(" Your random  number is = " + random);
        if (random <= 1 && random >= 50) {
            System.out.println(" 1st half ");
        } else if (random <= 1 && random >= 50) {
            System.out.println(" 1st quarter ");
        } else if (random <= 26 && random >= 50) {
            System.out.println(" 2st quarter ");
        }
        if (random >= 50 && random <= 100) {
            System.out.println(" 2nd half ");
        } else if (random <= 51 && random >= 75) {
            System.out.println(" 3st quarter ");
        } else if (random <= 76 && random >= 100) {
            System.out.println(" 4st quarter ");
        } else {

        }

        // second  way , rigth one , to solve Task 2
        if (random <= 50) {
            //1-50
            System.out.println("1st half");
            if (random <= 25) {
                System.out.println("1st quarter");
            } else {
                System.out.println("2nd quarter");
            }
        } else {
            System.out.println("2nd half");

            if (random <= 75) {
                System.out.println("3rd quarter");
            } else {
                System.out.println("4th quarter");
            }
        }

        /*
                // Scanner//
                Is it raining (true/false)
                Do you have umbrella? (true/false)
                Are you hungry? (true/false)

                // if elses //
                it is raining -> it is raining outside
                    if you have umbrella -> you can go outside
                    otherwise -> you stay home

                it is not raining -> it is not raining outside
                    if you are hungry -> you go to chick-fil-a
                    otherwise -> you are riding a bike
 */
        // my solution
        Scanner input = new Scanner(System.in);
        boolean rainOutside = input.nextBoolean();
        System.out.println(" Is it raining outside?");
        rainOutside = input.nextBoolean();
        boolean umbrella = true;
        System.out.println(" Do you have umbrella?");
        umbrella = input.nextBoolean();
        boolean hungry = true;
        System.out.println(" Are you hungry ?");
        hungry = input.nextBoolean();

        if (rainOutside) {
            System.out.println(" It is rain outside");
        }
            if (umbrella) {
            System.out.println(" You can go outside ");
        }
            else {
            System.out.println(" Stay at home ");
        }

        if (hungry) {
            System.out.println(" You are ridding a bike ");
        }








    }
}