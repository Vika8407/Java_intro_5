package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println("\n--------- Task 1 ----------\n");

        String str = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str));

        System.out.println("\n--------- Task 2 ----------\n");

        String s = "QA stands for Quality Assurance";
        System.out.println(countA(s));

        System.out.println("\n--------- Task 3 ----------\n");

        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(n));

        System.out.println("\n--------- Task 4 ----------\n");

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        //System.out.println(removeDuplicateElements(num));

        System.out.println("\n--------- Task 5 ----------\n");

        ArrayList<String> element = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(element));

        System.out.println("\n--------- Task 6 ----------\n");

        String string = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(string));

        System.out.println("\n--------- Task 7 ----------\n");

        int[] arr1 = {10, 3, 6, 3, 2};
        int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(arr2, arr1)));

        System.out.println("\n--------- Task 8 ----------\n");

        int[] digit = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(digit));


    }
                                 //=================Task-1====================//
             /*
             Task-1
         Requirement:
         Write a method countWords() that takes a String as an
         argument, and returns how many words there are in the
         the given String
         Test data 1:
         String str = “      Java is fun       ”;
         Expected output 1:
         3
         Test data 2:
         String str = “Selenium is the most common UI
         automation tool.   ”;
         Expected output 2:
         8
         NOTE: Make your code dynamic that works for any given
         String
         NOTE: Be careful about empty String
         NOTE: Be careful about before and after white spaces

         */

    public static int countWords(String words) {


        int counter = 0;
        words = words.replaceAll("\\s+", " ").trim();

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ')
                counter++;
        }
        return counter;
    }

                              //=================Task-2====================//
            /*
        Task-2
        Requirement:
        Write a method countA() that takes a String as an argument,
        and returns how many A or a there are in the the given String
        Test data 1:
        String str = “TechGlobal is a QA bootcamp”;
        Expected output 1:
        4
        Test data 2:
        String str = “QA stands for Quality Assurance”;
        Expected output 2:
        5
        NOTE: Make your code dynamic that works for any given
        String
        NOTE: Be careful about empty String
        NOTE: Be careful about uppercase and lowercase

        */
    public static int countA(String letterA) {
        letterA = letterA.toLowerCase();
        int container = 0;

        if (letterA.length() > 0) {
            for (int i = 0; i < letterA.length(); i++) {
                if (letterA.charAt(i) == 'a')
                    container++;
            }
        }
        return container;
    }

                                  //=================Task-3====================//
           /*
       Task-3
       Requirement:
       Write a method countPos() that takes an ArrayList of
       Integer as an argument, and returns how many elements
       are positive
       Test data 1:
       [-45, 0, 0, 34, 5, 67]
       Expected output 1:
       3
       Test data 2:
       [-23, -4, 0, 2, 5, 90, 123]
       Expected output 2:
       4
       NOTE: Make your code dynamic that works for any given
       ArrayList of Integer

       */
    public static Integer countPos(ArrayList<Integer> positive) {

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList());
        int countPositive = 0;

        for (Integer integer : positive) {
            if (integer > 0) countPositive++;

        }
        return countPositive;
    }
                                 //=================Task-4====================//
         /*
     Task-4
     Requirement:
     Write a method removeDuplicateNumbers() that takes an
     ArrayList of Integer as an argument, and returns it back
     with removed duplicates
     Test data 1:
     [10, 20, 35, 20, 35, 60, 70, 60]
     Expected output 1:
     [10, 20, 35, 60, 70]
     Test data 2:
     [1, 2, 5, 2, 3]
     Expected output 2:
     [1, 2, 5, 3]
     NOTE: Make your code dynamic that works for any given
     ArrayList of Integer
           */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> dupNum) {

        int[] numbers = {};
        ArrayList<Integer> numbs = new ArrayList<>();

        for (Integer num : dupNum) {
            if (!dupNum.contains(numbers)) {
                boolean add = dupNum.add(num);
            }
        }
        return numbs;
    }

                                //=================Task-5====================//
           /*
       Task-5
       Requirement:
       Write a method removeDuplicateElements() that takes an
       ArrayList of String as an argument, and returns it back with
       removed duplicates
       Test data 1:
       [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
       Expected output 1:
       [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
       Test data 2:
       [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
       Expected output 2:
       [“abc”, “xyz”, “123”, “ab”, “ABC”]
       NOTE: Make your code dynamic that works for any given
       ArrayList of String
       NOTE: Be careful about lowercase and uppercases, this method
       is case sensitive

          */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements) {

        ArrayList<String> uniques = new ArrayList<>();

        for (String element : elements) {
            if (!uniques.contains(element)) uniques.add(element);

        }
        return uniques;
    }

                                //=================Task-6====================//

           /*

       Task-6
       Requirement:
       Write a method removeExtraSpaces() that takes a String as an
       argument, and returns a String with removed extra spaces
       Test data 1:
       String str = “   I   am      learning     Java      ”;
       Expected output 1:
       I am learning Java
       Test data 2:
       String str = “Java  is fun    ”;
       Expected output 2:
       Java is fun
       NOTE: Make your code dynamic that works for any given
       String
       NOTE: Be careful about empty String
       NOTE: Be careful about before and after white spaces

       */
        public static String removeExtraSpaces (String str) {

            return str = str.replaceAll("\\s+", " ").trim();
        }



                                //=================Task-7====================//

           /*
       Task-7
       Requirement:
       Write a method add() that takes 2 int[] arrays as arguments and
       returns a new array with sum of given arrays elements.
       Test data 1:
       int[] arr1 = {3, 0, 0, 7, 5, 10};
       int[] arr2 = {6, 3, 2};
       Expected output 1:
       [9, 3, 2, 7, 5, 10]
       Test data 1:
       int[] arr1 =  {10, 3, 6, 3, 2};
       int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
       Expected output 1:
       [16, 11, 9,  3, 2, 7, 5, 10, 34]
       NOTE: Make your code dynamic that works for any given arrays
       NOTE: You will assume that length of arrays are always more than zero
       NOTE: Be careful about arrays length, if they were equal, it would be
       an easy task, but they can be different as given in the example above.

                      */

        public static int[] add ( int[] arr1, int[] arr2){
            if (arr1.length > arr2.length) {
                for (int i = 0; i < arr2.length; i++) {
                    arr1[i] += arr2[i];
                }
            } else {
                for (int i = 0; i < arr1.length; i++) {
                    arr2[i] += arr1[i];
                }
            }

            if (arr1.length > arr2.length) return arr1;
            else return arr2;
        }

                                 //=================Task-8====================//

              /*
          Task-8
          Requirement:
          Write a method findClosestTo10() that takes an int[] array as an
          argument, and returns the closest element to 10 from given array
          Test data 1:
          int[] numbers = {10, -13, 5, 70, 15, 57};
          Expected output 1:
          5
          Test data 2:
          int[] numbers = {10, -13, 8, 12, 15, -20};
          Expected output 2:
          8
          NOTE: You will assume that length of array is always more than
          zero
          NOTE: Make your code dynamic that works for any given int[]
          array
          NOTE: Be careful about element to be 10 (ignore it)
          NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in
          this case return smallest which is 8

               */
        public static int findClosestTo10(int[] num8){
           int absDifference = Integer.MAX_VALUE;

           for (int num : num8) {
                if (Math.abs(10 - num) <= Math.abs(absDifference - 10) && num != 10) {
                    if (Math.abs(10 - num) == Math.abs(absDifference - 10))
                        absDifference = Math.min(num, absDifference);
                    else absDifference = num;
                }
           }
            return absDifference;
        }


}