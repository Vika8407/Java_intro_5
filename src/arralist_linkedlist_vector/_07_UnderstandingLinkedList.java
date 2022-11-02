package arralist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));
        System.out.println(numbers); // [10.5, 5.5, 20.0]
        System.out.println(numbers.size()); // 3
        System.out.println(numbers.contains(10.5)); //true
        System.out.println(numbers.indexOf(4)); // -1
        System.out.println(numbers.get(1)); // 5.5


        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 20.0
        System.out.println(numbers.offer(4.5)); // true
        System.out.println(numbers); //[4.5, 10.5, 5.5, 20.0]

        System.out.println(numbers.peek());// 4.5 peek retrives or gets first elemets
        System.out.println(numbers.peekFirst());// 4.5 peek retrives  first elementor
        System.out.println(numbers.peekLast());// 4.5 peek retrives  last elementor

        System.out.println(numbers);

        System.out.println(numbers.pop()); // retrives and removes first element
        System.out.println(numbers);

        System.out.println(numbers.poll());
        System.out.println(numbers);

        System.out.println(numbers.pollFirst());//retrives and removes first element
        System.out.println(numbers);

        System.out.println(numbers.pollLast());//retrives and removes last element
        System.out.println(numbers);

        numbers.push( 2.2);
        System.out.println(numbers); //[ 2.0, ]


    }
}
