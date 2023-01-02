package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {

        //Create a TreeDet object
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", " New York", "San Francisco", "LA"));

        //print the TreeSet
        System.out.println(cities);

        System.out.println(cities.headSet("Miami"));
        System.out.println(cities.headSet("Miami", true));

        System.out.println(cities.tailSet("New York"));
        System.out.println(cities.tailSet("New York", false));

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers);// [1,2,3,7,10]

        System.out.println(numbers.first());
        System.out.println(numbers);

        System.out.println( numbers.pollFirst());
        System.out.println(numbers);

        numbers.clear();
       // System.out.println(numbers.last());//NoSuchElementException
        //System.out.println(numbers.first());//NoSuchElementException

        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());

    }
}
