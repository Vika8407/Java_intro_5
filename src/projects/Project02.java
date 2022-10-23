package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {


        System.out.println("---------Task1---------");

        int number1, number2,number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number1");
        number1 = input.nextInt();
        System.out.println( " Please enter number2");
        number2 = input.nextInt();
        System.out.println(" Please enter number3");
        number3 = input.nextInt();
        int sum = number1 * number2 * number3;
        System.out.println(" The product of the number entered is = " + sum);

        System.out.println("---------Task2---------");

        System.out.println(" Please enter your first name:" );
        String firstName = input.next();
        System.out.println(firstName);
        System.out.println(" Please enter your last name :" );
        String lastName = input.next();
        System.out.println(lastName);
        System.out.println("Please enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        int age =  2022 - yearOfBirth;
        System.out.println(" Users ag is = " + age);

        System.out.println("---------Task3---------");

        String fullName ;
        input.nextLine();
        System.out.println(" What is your fullName?");
        fullName = input.nextLine();
        System.out.println(" What is" + " your weight in kg ?");
        double kg = input.nextDouble();
        System.out.println( fullName + "" + kg * 2.205 + " lb." );

        System.out.println("---------Task4---------");


        String fullName1, fullName2, fullName3;
        input.nextLine();
        int age1, age2, age3;
        System.out.println(" What is your full name student 1?" );
        fullName1 = input.nextLine();
        System.out.println(fullName1);
        System.out.println("What is your full name student 2?");
        fullName2 = input.nextLine();
        System.out.println(fullName2);
        System.out.println("What is your full name student 3?");
        fullName3 = input.nextLine();
        System.out.println(fullName3);
        System.out.println(" What is your age student 1" );
        age1 = input.nextInt();
        System.out.println(" What is your age student 2");
        age2 = input.nextInt();
        System.out.println(" What is your age student 3");
        age3 = input.nextInt();

        int maxAge = Math.max (age3, Math.max(age2, age1 ));
        System.out.println(("The oldest age is : ") + maxAge);
        int minAge = Math.min( age3, Math.min(age2, age1));
        System.out.println(" The age is :" + minAge);






    }
}
