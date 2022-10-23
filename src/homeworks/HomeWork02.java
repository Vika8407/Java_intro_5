package homeworks;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1============\n");

        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println(" The number 1 entered by user is = ");
        num1 = input.nextInt();

        System.out.println(" The number 2 entered by users is =");
        num2 = input.nextInt();

        int sum1 = num1 + num2;
        System.out.println(" The sum of number 1 and 2 entered by user is = " + sum1);
        input.nextLine();

        System.out.println("\t\n ============ TASK 2============\n");

        int number1, number2 ;

        System.out.println(" Enter number 1 ");
        number1 = input.nextInt();

        System.out.println( " Enter number 2 ");
        number2 = input.nextInt();

        int sum2 = number1 * number2;
        System.out.println(" The product of the given 2 numbers is : " + sum2);
        input.nextLine();

        System.out.println("\t\n ============ TASK 3============\n");

        double n1;
        double n2;
        System.out.println( " What is number1:");
        n1 = input.nextDouble();

        System.out.println(" What is number2:");
        n2 = input.nextDouble();

        System.out.println(" The sum of the given numbers is = "+ ( n1 + n2 ));
        System.out.println(" The product of the given numbers is = "+ ( n1 * n2 ));
        System.out.println(" The subscription of the given numbers is = "+ ( n1 - n2 ));
        System.out.println(" The division of the given numbers is = "+ ( n1 / n2 ));
        System.out.println(" The remainder of the given numbers is = "+ ( n1 % n2 ));

        System.out.println("\t\n ============ TASK 4============\n");

        System.out.println( +-10 + 7 * 5);
        System.out.println( ( 72 + 24) % 24 );
        System.out.println( 10 + -3 * 9 / 9 );
        System.out.println( 5 + 18 / 3 * 3 - (6 % 3));

        System.out.println("\t\n ============ TASK 3============\n");

        int numberOne, numberTwo;

        System.out.println(" Enter number one :");
        numberOne = input.nextInt();

        System.out.println(" Enter number two :");
        numberTwo = input.nextInt();

        int average = numberOne + numberTwo ;
        System.out.println("The average of the given numbers is:" + ( average /2));

        System.out.println("\t\n ============ TASK 6============\n");

        int numb1, numb2, numb3, numb4, numb5;

        System.out.println(" Please enter number1 :");
        numb1 = input.nextInt();
        System.out.println(" Please enter number2 :");
        numb2 = input.nextInt();
        System.out.println(" Please enter number3:");
        numb3 = input.nextInt();
        System.out.println(" Please enter number4 :");
        numb4 = input.nextInt();
        System.out.println(" Please enter number5 :");
        numb5 = input.nextInt();

        int averageNumber = numb1 + numb2 + numb3 + numb4 + numb5;
        System.out.println(" This average of the given number is :" + (averageNumber / 5));

        System.out.println("\t\n ============ TASK 7============\n");

        int number10, number20, number30;

        System.out.println(" What is number1 :");
         number10= input.nextInt();
        System.out.println(" What is number2 :");
         number20= input.nextInt();
        System.out.println(" What is number3:");
         number30 = input.nextInt();

        System.out.println( " The 5 multiplied with 5 is " + number10 * 5 );
        System.out.println( " The six multiplied with 6 is " + number20 * 6 );
        System.out.println( " The 10 multiplied with 10 is " + number30 * 10 );

        System.out.println("\t\n ============ TASK 8============\n");

        int squareSide;
        System.out.println(" What is a square side :");
        squareSide = input.nextInt();

        System.out.println(" Perimeter of the square = " + squareSide * 4 );
        System.out.println( "Area of the square is = " + squareSide * 7 );
        input.nextLine();

        System.out.println("\t\n ============ TASK 9============\n");

        double annualSalary = 90_000;
        System.out.println(" A Software engineer in Test can earn $" + annualSalary * 3 + " in 3 years. ");

        System.out.println("\t\n ============ TASK 10============\n");

        String favBook, favColor;
        int favNumber;

        System.out.println(" What is your favorite book: ");
        favBook = input.nextLine();
        System.out.println(" What is your favorite color: ");
        favColor = input.nextLine();
        System.out.println( " What is your favorite number:");
        favNumber = input.nextInt();

        input.nextLine();

        System.out.println(" User's favorite book is : " + favBook +
                "\n User's favorite color is : " + favColor +
                "\n User's favorite number is : " + favNumber );
        input.nextLine();

        System.out.println("\t\n ============ TASK 11============\n");

        String firstName, lastName, emailAddress, phoneNumber, address ;
        int age;

        System.out.println("What is your first name : \n " );
        firstName = input.nextLine();
        System.out.println("What is your last name:");
        lastName = input.nextLine();
        System.out.println("What is your age:");
        age = input.nextInt();
        System.out.println("What is your email address:");
        emailAddress= input.nextLine();
        System.out.println("What is your phone number:");
        phoneNumber = input.nextLine();
        System.out.println("What is your address:");
        address = input.nextLine();

        input.nextLine();


        System.out.println(" User who joined this program is " + firstName + lastName + ". John's age is " + age + " . John's email" +
                " \n address is " + emailAddress  + " , phone number is " + phoneNumber + " , and address is " +
                 "\n "+ address + ".");







    }

}
