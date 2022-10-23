package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1============\n");

        String s1 = "24", s2 = "5";
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println( " Sum of 24 and 5 = "  + (a1 + a2) );
        System.out.println( " Subtraction  of 24 and 5 = " + (a1 - a2) );
        System.out.println( " Division of 24 and 5 = " + (a1 / a2) );
        System.out.println( " Multiplication of 24 and 5 = " + (a1 * a2) );
        System.out.println( " Remainder of 24 and 5 = " + (a1 % a2) );


        System.out.println("\t\n ============ TASK 2============\n");

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
