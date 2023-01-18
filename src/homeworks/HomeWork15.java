package homeworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWork15 {
    public static void main(String[] args) {

        System.out.println("\n----------Task1----------");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));

        System.out.println("\n----------Task2----------");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("\n----------Task3----------");
        //System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{}))); // []
        //System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        //System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        //System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\n----------Task4----------");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("\n----------Task5----------");
        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));


    }

    /*
    Task-1
    Requirement:
-Create a method called fibonacciSeries1()
-This method will take an int argument as n, and it will
return n series of Fibonacci numbers as an int
array.
REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
Test Data 1: 3
Expected Result 1: [0, 1, 1]
Test Data 2: 5
Expected Result 2: [0, 1, 1, 2, 3]
Test Data 3: 7
Expected Result 3: [0, 1, 1, 2, 3, 5, 8]
*/

    public static int[] fibonacciSeries1(int num){
        int[] arr = new int[num];
        int num1 = 1; int num2 = 0; int num3 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num1;
            num3 = num2 + num1;
            num2 = num1;
            num1 = num3;
        }
        return arr;
    }


    /*
Task-2
Requirement:
-Create a method called fibonacciSeries2()
-This method will take an int argument as n, and it will
return the nth series of Fibonacci number as an
int.
REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
Test Data 1: 2
Expected Result 1: 1
Test Data 2: 4
Expected Result 2: 2
Test Data 3: 8
Expected Result 3: 13
*/

    public static int fibonacciSeries2(int num){
        int[] arr = fibonacciSeries1(num);
        return arr[arr.length-1];

    }
    /*
Task-3
Requirement:
-Create a method called findUniques()
-This method will take 2 int array argument and it will return
an int array which has only the unique values from both given
arrays.
NOTE: If both arrays are empty, then return an empty array.
NOTE: if one of the array is empty, then return unique values
from the other array.
Test Data 1: [], []
Expected Result 1: []
Test Data 2: [], [1, 2, 3, 2]
Expected Result 2: [1, 2, 3]
Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
Expected Result 3: [1, 2, 5]
Test Data 4: [8, 9], [9, 8, 9]
Expected Result 4: []


    public static int[] findUniques(int[] num1, int[] num2){
        Set<Integer> unique = new HashSet<>();

        for (int i : num1) {
            unique.add(i);
        }
        for (int i : num2) {
            unique.add(i);
        }

        return unique;
    }

     */


    /*
Task-4
Requirement:
-Create a method called isPowerOf3()
-This method will take an int argument and it will
return true if given int argument is equal to 3
power of the X. Otherwise, it will return false.
Numbers that are power of 3 = 1, 3, 9, 27, 81, 243....
Test Data 1: 1
Expected Result 1: true
Test Data 2: 2
Expected Result 2: false
Test Data 3: 3
Expected Result 3: true
Test Data 4: 81
Expected Result 4: true
*/

    public static  boolean isPowerOf3(int num){
        if(num == 1 || num % 3 == 0);
        return true;
    }

    /*
Task-5
Requirement:
-Create a method called firstDuplicate()
-This method will take an int array argument and it will
return an int which is the first duplicated number.
NOTE: All elements will be positive numbers.
NOTE: If there are no duplicates, then return -1
NOTE: If there are more than one duplicate, then return
the one for which second occurrence has the smallest
index.
Test Data 1: []
Expected Result 1: -1
Test Data 2: [1]
Expected Result 2: -1
Test Data 3: [1, 2, 2, 3]
Expected Result 3: 2
Test Data 4: [1,  2, 3, 3, 4, 1]
Expected Result 4: 3

     */

    public static int firstDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
           int min = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else set.add(arr[i]);
        }
        if (min != -1)
            System.out.println("The first duplicate is " + arr[min]);
        else System.out.println("There are no duplicates elements");
        return min;
    }


}
