package homeworks;

import utilities.ScannerHelper;

public class HomeWork05Recap {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 8 ============\n");

        int sum = 0;
        int i = 0;

        do {
            sum += ScannerHelper.getANumber();
            i++;
        } while (sum < 100);

        if (i == 1) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("\t\n ============ TASK 9 ============\n");

        int givenNumber = 5;
        int firstNum = 0;
        int secondNum = 1;
        int nextNumber;
        String answer = "";

        if (givenNumber == 1) System.out.println("0");
        else if (givenNumber == 2) System.out.println("0 - 1");
        else {
            for (int j = 0; j < givenNumber; j++) {
                nextNumber = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = nextNumber;
                answer += nextNumber + " - ";

            }
            System.out.println(answer.substring(0, answer.length() - 3));
        }

        System.out.println("\t\n ============ TASK 10 ============\n");

        String name;
        do {
             name = ScannerHelper.getAName();
        }
        while (name.toLowerCase().charAt(0) != 'j');

    }
}
