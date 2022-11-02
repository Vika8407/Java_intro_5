package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Assume you have an ArrayList of language as below
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java

        expected output
         */

        String[] lenguages = {"Java","JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(lenguages));
        ArrayList<String> uniques = new ArrayList<>();

        for (String language : lenguages) {
            if (!uniques.contains(language))uniques.add(language);
        }
        System.out.println(uniques);

    }

}
