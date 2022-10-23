package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 10};
        //search for 7 and return true if exists in this array, return false otherwise
        boolean has7 = false;
        for (int number : numbers) {
            if(number == 7){
                has7 = true;
                break;
            }
            System.out.println(has7);

        }
        //Search for 5 and return true if it exists in this array, return false otherwise -> true

        boolean has5 = false;
        for (int number:numbers) {
            if (number == 5){
                has5 = true;
                break;
            }
            System.out.println(has5);
        }

        System.out.println("\n----------Binary search in Array---------\n");

        // NOTE: Binary search can be used if the array is sorted, otherwise ewe will get wrong result
        // Also binary search returns the index of the element if found
        // 3, 5, 8, 10
        // if index returns 0 or positive, it means element exist
        // if index returns negative, it means element  not exist
        // if two elements  exists it will returns the last index

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5));//1
        System.out.println(Arrays.binarySearch(numbers, 10));//3
        System.out.println(Arrays.binarySearch(numbers, 9));//- means not exist

    }
}
