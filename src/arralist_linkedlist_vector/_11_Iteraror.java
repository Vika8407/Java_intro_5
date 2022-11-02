package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Iterator;

public class _11_Iteraror {
    public static void main(String[] args) {

        ArrayList<String > food = new ArrayList<>();
        food.add("Pizza");
        food.add("Pasta");
        food.add("Burger");
        food.add("Lamb chops");
        food.add("Falafel");
        food.add("Sushi");

        /*
        remove food that has 5 characters(length is 5)
        Print the list
         */

        //food.removeIf(x -> x.length() == 5);
        //System.out.println(food);

        Iterator<String> foodIterator = food.iterator();

        while(foodIterator.hasNext()){
            String f = foodIterator.next();
            if(f.length() == 5) foodIterator.remove();
        }

        System.out.println(food);





    }
}
