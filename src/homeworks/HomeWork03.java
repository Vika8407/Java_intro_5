package homeworks;

import mathClass.MathRandomMethod;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class HomeWork03 {
    public static void main(String[] args) {


        System.out.println("\t\n ============ TASK 1============\n");

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter number 1");
        int num1 = input.nextInt();
        System.out.println(" Please enter number 2");
        int num2 = input.nextInt();
        System.out.println( " The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("\t\n ============ TASK 2============\n");


        System.out.println(" Please enter a number 1 ");
        int number1 = input.nextInt();
        System.out.println(" Please enter a number 2 ");
        int number2 = input.nextInt();
        System.out.println(" Please enter a number 3 ");
        int number3 = input.nextInt();
        System.out.println(" Please enter a number 4 ");
        int number4 = input.nextInt();
        System.out.println(" Please enter a number 5 ");
        int number5 = input.nextInt();

        System.out.println(" Number1 is " + number1);
        System.out.println(" Number2 is " + number2);
        System.out.println(" Number3 is " + number3);
        System.out.println(" Number4 is " + number4);
        System.out.println(" Number5 is " + number5);
        System.out.println(" Max value = " + Math.max ( Math.max( Math.max (number1, number2), Math.max (number3, number4)), number5));
        System.out.println(" Min value = " + Math.min ( Math.min( Math.min (number1, number2), Math.min (number3, number4)), number5));

        System.out.println("\t\n ============ TASK 3============\n");


        int randomNum1 = (int)(Math.random() * ( 100 - 50 +1) + 50);
        System.out.println((" Number 1 = ") + randomNum1) ;
        int randomNum2  = (int)(Math.random() * ( 100 - 50 +1) + 50);
        System.out.println(("Number 2 = ") + randomNum2 ) ;
        int randomNum3  = (int)(Math.random() * ( 100 - 50 +1) + 50);
        System.out.println(("number 3 = ") + randomNum3) ;

        int sum = randomNum1 + randomNum2 + randomNum3;
        System.out.println("The sum of the numbers is = " + sum);


        System.out.println("\t\n ============ TASK 4============\n");

        int moneyAlex = 125;
        int moneyMike = 220;
        double monAlex = moneyAlex;
        double monMike = moneyMike;
        System.out.println("Alex's money " + (monAlex - 25.5));
        System.out.println("Mike money " + (monMike + 25.5));



        System.out.println("\t\n ============ TASK 5============\n");


        double savingPerDay = 15.60;
        double saveAmount = 390;
        System.out.println( (int) (saveAmount / savingPerDay ));



        System.out.println("\t\n ============ TASK 6============\n");


        String s1 = "5", s2 ="10";
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        System.out.println( " Sum of 5 and 10 =" + (a1 + a2));
        System.out.println( " Product of 5 and 10 =" + (a1 * a2));
        System.out.println( " Division of 5 and 10 =" + (a1 / a2));
        System.out.println( " Subtraction  of 5 and 10 =" + (a1 - a2) );
        System.out.println( " Remainder of 5 and 10 =" + (a1 % a2) );


        System.out.println("\t\n ============ TASK 7============\n");


        String b1 = "200", b2 ="-50";
        int c1 = Integer.parseInt(b1);
        int c2 =  Integer.parseInt(b2);
        System.out.println( " The greatest value is = " +  Math.max(c1 ,c2) );
        System.out.println( " The smallest value is = " + Math.min(c1 ,c2) );
        System.out.println( " The average is = " + ((c1 + c2 )/ 2) ) ;
        System.out.println( " The absolute difference is = " + Math.abs(c1 - c2) );


        System.out.println("\t\n ============ TASK 8============\n");

        double quoter2 = 0.75;
        double dime = 0.1;
        double nickels2 = 0.1;
        double penny =0.01;
        double sumP = ( quoter2 + dime +nickels2 + penny);
        System.out.println((int) (24 / sumP) + " days");
        System.out.println((int) ( 168 /sumP) + " days");
        int month5 = (30*5);
        System.out.println( " $ " +  sumP * month5);


        System.out.println("\t\n ============ TASK 9============\n");


        double computerPrise = 1250 ;
        double dailySavings = 62.5;
        System.out.println( (int)(computerPrise /  dailySavings));


        System.out.println("\t\n ============ TASK 10============\n");

        double carPrise = 14265;
        double payment1 = 475.50;
        double payment2 =951;

        System.out.println(" Option 1 will take " + (int) (carPrise / payment1) + " month");
        System.out.println(" Option 2 will take " + (int) (carPrise / payment2) + " month");



        System.out.println("\t\n ============ TASK 11============\n");

        System.out.println(" Please enter a number 1 ");
        int numberOne = input.nextInt();
        System.out.println(" Please enter a number 2 ");
        int numberTwo = input.nextInt();
        System.out.println((double) numberOne/ numberTwo );


        System.out.println("\t\n ============ TASK 12============\n");


        int rNumber = (int)(Math.random() * 101) ;
        System.out.println(" Random number between 0 and 100 is " + rNumber);
        int ranNumber = (int)(Math.random() * 101) ;
        System.out.println(" Random number between 0 and 100 is " + ranNumber);
        int randomNumber = (int)(Math.random() * 101) ;
        System.out.println(" Random number between 0 and 100 is " + randomNumber);

        int m1 = (rNumber + ranNumber + randomNumber);

            if(m1  > 25) {
                System.out.println(" true ");
            }
        else{
            if(m1 == 25){
                System.out.println(" false ");

            }
        }

        System.out.println(" End of the program!");



        System.out.println("\t\n ============ TASK 13============\n");


        System.out.println( " Please enter number between 1 and 7");
        int k1 = input.nextInt();
        if( k1 == 3){
            System.out.println(" WEDNESDAY");

        }
        else{
            System.out.println(" FRIDAY ");
        }

        System.out.println("End of the program!");




        System.out.println("\t\n ============ TASK 14============\n");

        System.out.println(" Tell me your exam result?");
        int examResult1 = input.nextInt();
        int examResult2 = input.nextInt();
        int examResult3 = input.nextInt();
        int average =(examResult1 + examResult2 + examResult3) /3;

        if( average >= 70){
            System.out.println("YOU PASSED");

        }
        else{
            System.out.println("YOU FAILED");
        }

        System.out.println("End of the program!");



        System.out.println("\t\n ============ TASK 15============\n");


        System.out.println("Please enter number 1 ");
        int n1 = input.nextInt();
        System.out.println("Please enter number 2 ");
        int n2 = input.nextInt();
        System.out.println("Please enter number 3 ");
        int n3 = input.nextInt();
        if (n1 == n2 && n2 ==n3){
            System.out.println(" TRIPLE MATCH");
        }
        else if( n1 ==n2 || n2 == n3 || n1 == n3 ){
            System.out.println(" DOUBLE MATCH ");
        }
        else {
            System.out.println("NO MATCH");
        }

        System.out.println("End of the program!");














    }
}
