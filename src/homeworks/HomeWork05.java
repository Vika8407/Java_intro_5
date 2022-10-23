package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {

         System.out.println("\t\n ============ TASK 1 ============\n");


         for (int i = 1; i <= 100; i++){
            if( i % 7 == 0)System.out.print(i + " - ");
        }


          System.out.println("\t\n ============ TASK 2 ============\n");

        for (int i = 1; i <= 50; i++){
            if( i % 2 == 0 || i % 3 == 0)System.out.print(i + " - ");
        }


        System.out.println("\t\n ============ TASK 3 ============\n");


        for (int i = 100; i >= 50; i--){
            if( i % 5 == 0)System.out.print(i + " - ");
        }


        System.out.println("\t\n ============ TASK 4 ============\n");

        for (int i = 1; i <= 7; i++){
            System.out.println( " The square of " + i + " is = " + (i * i));
        }

          System.out.println("\t\n ============ TASK 5 ============\n");

        int sum = 0 ;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

          System.out.println("\t\n ============ TASK 6 ============\n");

        int num = ScannerHelper.getANumber();
        int factorial = 1;
        for (int i = 1; i <= num; ++i){
            factorial *= i;
        }
        System.out.println(factorial);

          System.out.println("\t\n ============ TASK 7 ============\n");

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your full name ");
        String fullName = input.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i < fullName.length()-1 ; i++ ){
            char l = fullName.charAt(i);

            if(l =='a' || l == 'e' || l == 'o' || l == 'i' || l =='u')
                counter++ ;
        }
        System.out.println("There are " + counter + " vowel letters in this full name ");


          System.out.println("\t\n ============ TASK 8 ============\n");

            int number = ScannerHelper.getANumber();
            if (number > 100) System.out.println("This number is already more than 100");
            else {
                int sumOfNumbers = number;
            do {
                int number1 = ScannerHelper.getANumber();
                sumOfNumbers += number1;
            }
            while (sumOfNumbers < 100);
            System.out.println("Sum of the entered numbers is at least 100");
        }


            System.out.println("\t\n ============ TASK 9 ============\n");


            int givenNum = 5, firstTerm = 0, secondTerm = 1;
            String answer = "";
         for (int i = 1; i <= givenNum; ++i){
            answer = (firstTerm + " - " );
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm ;
        }
        System.out.println(answer.substring(0, answer.length()-3));



         System.out.println("\t\n ============ TASK 10 ============\n");

        String name;
        do {
            name = ScannerHelper.getAName();
        }
        while (name.toLowerCase().charAt(0) != 'j');



    }
}
