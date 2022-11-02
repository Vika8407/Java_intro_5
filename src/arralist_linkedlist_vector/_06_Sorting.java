package arralist_linkedlist_vector;

import java.util.*;

public class _06_Sorting {
    public static void main(String[] args) {

        /*
        Create below link list to store data
        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        print the LinkedList
        Sort the Linked list and print them again


         */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println("\t\n ============ Before sort ============\n");

        System.out.println(numbers);
        System.out.println(objects);

        Collections.sort(numbers);
        Collections.sort(objects);

        System.out.println("\t\n ============ After sort ============\n");

        System.out.println(numbers);
        System.out.println(objects);
    }
}
