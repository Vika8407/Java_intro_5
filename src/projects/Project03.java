package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1============\n");

        /*

-Assume that you are given below Strings
String s1 = “24”, s2 = “5”;
-Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
The sum of 24 and 5 = 29
The subtraction of 24 and 5 = 19
The division of 24 and 5 = 4.8
The multiplication of 24 and 5  = 120
The remainder of 24 and 5 = 4

         */
        String s1 = "24", s2 = "5";
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println( " Sum of 24 and 5 = "  + (a1 + a2) );
        System.out.println( " Subtraction  of 24 and 5 = " + (a1 - a2) );
        System.out.println( " Division of 24 and 5 = " + (a1 / a2) );
        System.out.println( " Multiplication of 24 and 5 = " + (a1 * a2) );
        System.out.println( " Remainder of 24 and 5 = " + (a1 % a2) );


        System.out.println("\t\n ============ TASK 2============\n");
        /*
        Write a program that generates a random number between 1 to 35 (1 and 35 are
included)
-Find if the given number is a Prime Number
-If random number generated is a prime one, then print “THE NUMBER IS A
PRIME NUMBER”.
-Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”
Prime number is a number that can be divided only by itself and 1. It cannot be
divided by any other number. The smallest prime number is 2 and 2 is the only
even prime number.
So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17,
19, 23, 29, 31
Test data 1:
Random number = 11
Expected result 1:
11 IS A PRIME NUMBER
Test data 2:
Random number = 15
Expected result 2:

15 IS NOT A PRIME NUMBER
 */

        int random = (int) (Math.random() * (35) +1);
        System.out.println(" Random number between 1 and 35 is " + random);

        int number = random ;
        System.out.println(" Random number  is = " + number);
        switch (number){
            case 1 :
                System.out.println( " THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 2 :
                System.out.println( " THE NUMBER IS PRIME NUMBER ");
                break;
            case 3 :
                System.out.println( " THE NUMBER IS PRIME NUMBER ");
                break;
            case 4 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 5 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 6 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 7 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 8 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 9:
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 10 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 11 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 12 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 13 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 14 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 15 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 16 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 17 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 18 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 19 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 20 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 21 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 22 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 23 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 24 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 25 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 26 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 27 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 28 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 29 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 30 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 31 :
                System.out.println(" THE NUMBER IS PRIME NUMBER ");
                break;
            case 32 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 33 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 34 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;
            case 35 :
                System.out.println(" THE NUMBER IS NOT PRIME NUMBER ");
                break;


        }

        System.out.println("\t\n ============ TASK 3============\n");

        /*

-Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
included)
-Find and print each number in an ascending order
-Ascending order is ordering from lowest to greatest
NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
task.
Test data: Assume below numbers are generated
Random number 1 = 43
Random number 2 = 7
Random number 3 = 30
Expected result:
Lowest number is = 7
Middle number is = 30
Greatest number is = 43

         */
        int randomNumber1 = (int) (Math.random() * (50) +1);
        System.out.println(" Random number 1 is : " + randomNumber1);
        int randomNumber2 = (int) (Math.random() * (50) +1);
        System.out.println(" Random number 2 is : " + randomNumber2);
        int randomNumber3 = (int) (Math.random() * (50) +1);
        System.out.println( " Random number 3 is : " + randomNumber3);
        int min = randomNumber1 < randomNumber2 ? randomNumber1 : randomNumber3;
        System.out.println( " Lowest number is = " + min);
        int middle = randomNumber2 < randomNumber3 ? randomNumber2 : randomNumber1;
        System.out.println( " Middle number is = " + middle );
        int max = randomNumber1 < randomNumber2 ? randomNumber3 : randomNumber1 ;
        System.out.println( " Greatest number is = " + max);


        System.out.println("\t\n ============ TASK 4============\n");

        /*
        -Assume you are given a single character. (It will be hard-coded)
-First, check if given char is a letter but not digit or special character.
-If the given char is not a letter, then print “Invalid character detected!!!”.
-If it is a letter, then find out if it is an uppercase or a lowercase letter.
-If the letter is uppercase, then print “The letter is uppercase”, else print “The
letter is lowercase”.
NOTE: You need to use ASCII table and casting for this task
Test data 1: Assume you are given 5
char c = ‘5’;
Expected result 1:
Invalid character detected!!!
Test data 2: Assume you are given a
char c = ‘a’;
Expected result 2:
The letter is lowercase
Test data 3: Assume you are given R
char c = ‘R’;
Expected result 3:

The letter is uppercase
         */

         char c1 = 53;
         char c2 = 97;
         char c3 = 82;
        System.out.println(" Your char is a number " + c1);
        System.out.println(" Your char is lowercase letter " + c2);
        System.out.println(" Your char is uppercase letter " + c3);
        if ( c1 <= c2 && c1 <= c3 && c2 <=c3 ){
            System.out.println(" Invalid character detected !!! ");
        } else if (c1 <= c2 && c2 >= c3) {
            System.out.println(" The letter is lowercase ");
        } else if (c1 <= c3 && c1 <= c3) {
            System.out.println(" The letter is uppercase ");
        }


        System.out.println("\t\n ============ TASK 5============\n");

/*
Assume you are given a single character. (It will be hard-coded)
-First, check if given char is a letter but not digit or special character.
-If it is not a letter, then print “Invalid character detected!!!”.
-If it is a letter, then find out whether it is a vowel or a consonant.
-If the letter is vowel, then print “The letter is vowel”, else print “The letter is
consonant”.
-Vowel letters: a, e, i o, u, A, E, I, O, U
NOTE: You need to use ASCII table and casting for this example
Test data 1: Assume you are given #
char c = ‘#’;
Expected result 1:
Invalid character detected!!!
Test data 2: Assume you are given E
char c = ‘e’;
Expected result 2:
The letter is vowel
Test data 3: Assume you are given R
char c = ‘R’;
Expected result 3:
The letter is  consonant

 */
         char y1 = 35;
         char y2 = 101;
         char y3 = 82;
        System.out.println(" Char is  a special character " + y1);
        System.out.println(" Char is  a lowercase letter " + y2);
        System.out.println(" Char is  a uppercase letter" + y3);
         if ( y1 <= y2 && y1 <= y3 && y2 <= y3){
             System.out.println(" Invalid character detected");
         }
         else if ( y2 > y1 && y2 > y3) {
             System.out.println(" The letter is vowed ");
         }
         else {
             System.out.println(" The letter is consonant");
         }


        System.out.println("\t\n ============ TASK 6============\n");

/*
(Find if given char is special character or not)
-Assume you are given a single character. (It will be hard-coded)
-First, check if the given char is a special character but not a digit or not a letter.
-If it is not a special character, then print “Invalid character detected!!!”.
-If it is a special character, then print “Special character is =
{givenCharacter}”.
NOTE: You need to use ASCII table and casting for this example
Test data 1: Assume you are given 8
char c = ‘8’;
Expected result 1:
Invalid character detected!!!
Test data 2: Assume you are given *
char c = ‘*’;
Expected result 2:
Special character is = *
TASK-7 (Find if given char is a letter or digit or special character)
-Assume you are given a single character. (It will be hard-coded)
-If given char is a letter, then print “Character is a letter”
-If given char is a digit, then print “Character is a digit”
-Otherwise, print “Character is a special character”
Test data 1: Assume you are given g
char c = ‘g’;
Expected result 1:
Character is a letter
Test data 2: Assume you are given 5
char c = ‘5’;
Expected result 2:
Character is a digit
Test data 3: Assume you are given 5
char c = ‘@’;
Expected result 3:

Character is a special character
 */
        char character  = 42 ;
        if (character > 65 && character < 95){
            System.out.println(" INVALID CHARACTER DETECTED" );
        } else if ( character < 97 && character < 122 ) {
            System.out.println(" SPECIAL CHARACTER IS = " + character);
        }


        System.out.println("\t\n ============ TASK 7============\n");

        char num1 = 103;
        char num2 = 53;
        char num3 = 64;
        if (num1 > num2 && num1 > num3 ){
            System.out.println(" Character is a letter " + num1);
        }
        else if (num2 < num1 && num2 < num3 ) {
            System.out.println(" The character is a digit" + num2);
        }
        else {
            System.out.println(" The character is a special character " + num3 );
        }


    }
}
