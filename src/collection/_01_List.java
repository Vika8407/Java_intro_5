package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_List {
    public static void main(String[] args) {

        /*
        - They preserve insertion order
        - They allowed duplicates
        - They allowed Null elements

        // for the future we not learn now
        -Performance
        -Memory
        Initial capacity
        -Load
        -The way they store the data
         */

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");


        System.out.println(fruits.element());

        System.out.println(fruits);//[Apple, Apple, Orange, , , Null, Null]

    }
}
