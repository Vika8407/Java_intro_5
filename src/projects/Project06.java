package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n--------- Task 1 ----------\n");

        String str = "  abc";
        //System.out.println(countMultipleWords(str));

        System.out.println("\n--------- Task 2 ----------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        System.out.println("\n--------- Task 3 ----------\n");

        String password = "Abcd123!";
        System.out.println(validatePassword(password));

        System.out.println("\n--------- Task 4 ----------\n");

        String email = "abcd@gmail.com";
        System.out.println(validateEmailAddress(email));
    }

             /*TASK-1 - countMultipleWords() method
         •Write a method that takes a String[] array as an argument and counts
         how many strings in the array has multiple words
         •This method will return an int which is the count of multiple words
         •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
         “    abc”,  “abc   “
         Test data:
         [c]
         Expected output:
         2
            */
    public static int countMultipleWords(String[] str){

        int counter = 0;
        for (String s : str) {
            s = s.trim();
            if (Pattern.matches("([\\w] [\\w]) +", s)) counter++;
        }
        return counter;
    }
    /*
              TASK-2 - removeNegatives() method
          •Write a method that takes an “ArrayList<Integer> numbers” as an
          argument and removes all negative numbers from the given list if there
          are any
          •This method will return an ArrayList with removed negatives
          Test data 1:
          [2, -5, 6, 7, -10, -78, 0, 15]
          Expected output 1:
          [2, 6, 7, 0, 15]
          Test data 2:
          [2, -5, 6, 7, -10, -78, 0, 15]
          Expected output 2:
          [2, 6, 7, 0, 15]
               */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {

        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if (num < 0) numbersIterator.remove();
        }
        return numbers;
    }

    /*
               TASK-3 - validatePassword() method
               •Write a method that takes a “String password” as an argument and
               checks if the given password is valid or not
               •This method will return true if given password is valid, or false if given
               password is not valid
               •A VALID PASSWORD:
               -should have length of 8 to 16 (length of 7 or 17 should return false)
               -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
               char
               -should NOT have any space
               Test data 1:
               Expected output 1:
               false
               Test data 2:
               abcd
               Expected output 2:
               false
               Test data 3:
               abcd1234
               Expected output 3:
               false
               Test data 4:
               Abcd1234
               Expected output 4:
               false
               Test data 5:
               Abcd123!
               Expected output 5:
               true
                    */
    public static boolean validatePassword(String password){

        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#%&*!+_])[\\S]{8,16}",password));

    }

                       /*
                TASK-4 - validateEmailAddress() method
                •Write a method that takes a “String email” as an argument and checks if
                the given email is valid or not
                •This method will return true if given email is true, or false if given email is
                not valid
                •A VALID EMAIL:
                -should NOT have any space
                -should not have more than one “@” character
                -should be in the given format <2+chars>@<2+chars>.<2+chars>
                Test data 1:
                a@gmail.com
                Expected output 1:
                false
                Test data 2:
                abc@g.com
                Expected output 2:
                false
                Test data 3:
                abc@gmail.c
                Expected output 3:
                false
                Test data 4:
                abc@@gmail.com
                Expected output 4:
                false
                Test data 5:
                abcd@gmail.com
                Expected output 5:
                true
                     */
    public static boolean validateEmailAddress (String email){

        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}",email));
    }


}
