package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");
        int[] digits = {10, 7, 7, 10, -3, 10, -3 };
        findGreatestAndSmallestWithSort(digits);

        System.out.println("\t\n ============ TASK 2 ============\n");

        int[] numbers ={10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(numbers);

        System.out.println("\t\n ============ TASK 3 ============\n");

        findSecondGreatestAndSmallestWithSort(numbers);
        System.out.println("\t\n ============ TASK 4 ============\n");

        findSecondGreatestAndSmallest(numbers);

        System.out.println("\t\n ============ TASK 5 ============\n");
        String[] str = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(str);

        System.out.println("\t\n ============ TASK 6 ============\n");

        String[] strings = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(strings);
    }
                          //------ Task 1 -----//
       public static void findGreatestAndSmallestWithSort(int[] numbers){

           int[] digits = {10, 7, 7, 10, -3, 10, -3 };
           Arrays.sort(digits);
           System.out.println("Smallest = "+ digits[0]);
           System.out.println("Greatest = "+ digits[digits.length -1]);

       }

                         //------ Task 2 -----//
             public static void findGreatestAndSmallest(int[] numbers) {
                 int greatest = Integer.MIN_VALUE;
                 int smallest = Integer.MAX_VALUE;

                 for (int number : numbers) {
                     if (number > greatest) greatest = number;
                     if (number < smallest) smallest = number;
                 }
                 System.out.println(" Greatest = " + greatest);
                 System.out.println( "Smallest = " + smallest);

             }

                          //-----Task 3 ------//
     public static void findSecondGreatestAndSmallestWithSort( int[] numbers) {

         int countSecondSmallest = Integer.MAX_VALUE;
         int countSecondGreatest = Integer.MIN_VALUE;
         Arrays.sort(numbers);

         int max = numbers[numbers.length - 1];
         int min = numbers[0];

         for (int number : numbers) {
             if (number < countSecondGreatest && number != max) {
                 max = number;

             }
             if (number > countSecondSmallest && number != min) ;
             min = number;
         }
         System.out.println("Second Smallest = " + min);
         System.out.println("Second Greatest = " + max);
     }

                             //-----Task 4 -----//
            public static int findGreatest(int[] numbers) {
                int greatest = Integer.MIN_VALUE;

                for (int number : numbers) {
                    if (number > greatest) greatest = number;
                }
                return greatest;
            }

            public static int findSmallest(int[] numbers) {
                int smallest = Integer.MAX_VALUE;
                for (int number : numbers) {
                    if (number < smallest) smallest = number;
                }
                return smallest;
            }

            public static void findSecondGreatestAndSmallest( int[] numbers){

                int secondGreatest = Integer.MIN_VALUE;
                int secondSmallest = Integer.MAX_VALUE;
                for(int number : numbers){
                    if (number > secondGreatest && number < findGreatest(numbers)){
                        secondGreatest = number;
                    }
                    if(number < secondSmallest && number > findSmallest(numbers)){
                        secondSmallest = number;
                    }
                }System.out.println("Greatest = " + findGreatest(numbers));
                System.out.println("Smallest = " + findSmallest(numbers));
                System.out.println(" Second greatest = " + secondGreatest);
                System.out.println(" Second smallest = " + secondSmallest);



            }

                            //----- Task 5-----//
          public static void findDuplicatedElementsInAnArray(String[] str){

              for (int i = 0; i <  str.length; i++) {
                  for (int j = i +1; j < str.length ; j++) {
                      if (str[i].equals(str[j])){
                          System.out.println(str[i]);
                          break;
                      }
                  }
              }
          }


                           //------ Task 6-----//
         public static void findMostRepeatedElementInAnArray(String[] string){
             int counter = 0;
             int  mostRepited = 0;
             String words = "";

             for (int i = 0; i < string.length; i++) {
                 for (int j = i + 1 ; j <string.length ; j++) {
                     if (string[i].equals(string[j]))counter++;

                 }
                 if (counter > mostRepited) {
                     mostRepited = counter;
                     words = string[i];
                 }
                 counter = 0;
             }
             System.out.println(words);
         }
}
