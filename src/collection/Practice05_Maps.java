package collection;

import java.util.HashMap;
import java.util.Map;

public class Practice05_Maps {
    public static void main(String[] args) {

        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

         // Keys: Day, Color, City, Car, Pet
         // Values: Friday, Black, Chicago, Lexus, Turtle

         /*
         Get keys and print them
         [Car, Color, City, Day, Pet]
          */

        System.out.println(favorites.keySet());//[Car, Color, City, Day, Pet]
        for (String fav : favorites.keySet()) {
            System.out.println(fav);

        }

        /*
        Print each value with a loop
         */

        System.out.println(favorites.values());
        for (String fav : favorites.values()) {
            System.out.println(fav);
        }

        /*
        Print all entries as below
        1. key = Car and the value for in  = Lexus
        2.
        3.
        4.
        5.
         */

        int i = 1;
        for (Map.Entry<String,String> fav : favorites.entrySet()) {
            System.out.println(fav);
            System.out.println( i ++ +". key = " + fav.getKey() + "Car and the value for in  = " + fav.getValue());

        }
    }
}
