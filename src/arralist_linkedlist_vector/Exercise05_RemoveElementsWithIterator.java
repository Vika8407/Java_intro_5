package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {

        /*
        TASK
        Remove elements that contains "book"
        -This is case - insensitive

        Print the list -> [Pen,Pencil]
         */
        ArrayList<String> object = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));

        Iterator<String> objectIterator = object.iterator();

        while(objectIterator.hasNext()){
            String s =  objectIterator.next();
            if( s.toLowerCase().contains("book")) objectIterator.remove();
        }

        System.out.println(object);
    }
}
