package arrays;

import java.util.Arrays;

public class _09_Find_Max_Min {
    public static void main(String[] args) {

    }

   /*
      Create public static method which will take an int array then it will
      find the max min numbers from there and print it.

    reate public static method which will take an int array then it will find the
    ax and min numbers from there and print it.

    xamples:
       Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};

    utput:
       Max = 7
       Min = -5

    OTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
    ethod names:
       *printMaxAndMinWithSort
       *printMaxAndMinWithoutSort
    */



    public static void printMaxAndMinWithSort (int[] numbers){

        Arrays.sort(numbers);
        if(numbers.length > 0) {
            System.out.println("Max = " + numbers[numbers.length - 1]);
            System.out.println("Min = " + numbers[0]);
        }else{
            System.out.println(" Array is empty!");
        }

    }

    public static void printMaxAndMinWithLoop(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        System.out.println("Max is = " + max );
        System.out.println(" MIn is = " + min);
    }




}

