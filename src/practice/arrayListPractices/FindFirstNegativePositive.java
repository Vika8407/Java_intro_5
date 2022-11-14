package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {

      ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
      findFirstPositiveAndNegative(numbers);
    }
    /*
    Create public static void method which will take an ArrayList and will find
    the first positive and first  negative number and print them.
    Example:
    ArrayList -> [0, -4, -7, 0, 5, 10, 45]

     Output:
    First positive number is: 5
    First negative number is: -4
     */

    public static void findFirstPositiveAndNegative(ArrayList<Integer> numbers){

        int countPositive = 0;
        int countNegative = 0;

        for (Integer number : numbers) {
            if( number > 0 && countPositive == 0){
                countPositive = number;
            }
            if (number < 0 && countNegative == 0){
                countNegative = number;
            }

        }
        System.out.println("First positive number is:" + countPositive);
        System.out.println("First negative number is:" + countNegative);




    }

}
