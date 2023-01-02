package collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice03_SubSet {
    public static void main(String[] args) {
        /*
        Create a collection to store below numbers
        3,2,7,10,20,7,5

        Find all the elements more than 7 -> [10, 15, 20]
        Find all the element less than or = to 5 ->[2, 3, 5]
        Find all th element between 5 and 15 both inclusive -> [5, 7,10,15]

         */

        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        System.out.println(numbers.tailSet(7, false));
        System.out.println(numbers.headSet(5, true));
        System.out.println(numbers.subSet(5, true, 15, true));



    }
}
