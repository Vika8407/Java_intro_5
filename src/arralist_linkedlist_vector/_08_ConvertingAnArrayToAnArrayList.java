package arralist_linkedlist_vector;

import java.util.*;

public class _08_ConvertingAnArrayToAnArrayList {
    public static void main(String[] args) {
        /*
        Create an Array list of cities
        Tokyo, Berlin, moskov  Denver
        Create a Linked List of characters ->A, #, 5, +
        Create a Vector of numbers -> 1, 2, 2, 7, 10


         */System.out.println("\t\n ============ Way 1  ============\n");

        String[] arr1 = {"Tokyo", "Berlin", "moskov",  "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);

        System.out.println("\t\n ============ Way 2 with loop manualy  ============\n");

        char[] arr2 = {'A', '#', '5', '+'};
        ArrayList<Character> characters = new ArrayList<>();

        for (char c : arr2) {
            characters.add(c);
        }
        System.out.println(characters);

        System.out.println("\t\n ============ Way 3 with collection.addAll() method  ============\n");

        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers); // [1, 2, 2, 7, 10]


    }

}
