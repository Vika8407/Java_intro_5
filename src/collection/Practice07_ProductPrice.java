package collection;

import java.util.*;

public class Practice07_ProductPrice {
    public static void main(String[] args) {
        /*
        iPhone     -> 1000
        MacBookPro -> 13000
        iMac       -> 1500
        Airpods    -> 200
        iPad       -> 700

        Task 1
        Find the most expensive product and print it as below

        Expected output
        iMac is the most expensive with the price og 1500
         */

        /*
        Pseudo code:
         1. Store items in HashMap
         2. Find the max price value from HashMap values
         3. Loop and find the item which has the value equals max price value

         */


        HashMap<String, Double> product = new HashMap<>();
        product.put("iPhone",1000.0);
        product.put("MacBookPro",13000.0);
        product.put("iMac",15000.0);
        product.put("AirPods",200.0);
        product.put("iPad",700.0);

        double maxPrice = new TreeSet<>(product.values()).last();

        for (Map.Entry<String, Double> entry : product.entrySet()) {
            if (entry.getValue() == maxPrice){
                System.out.println(entry.getKey()+ " is the most expensive with the price of $ " + entry.getValue());
                break;
            }
        }
        System.out.println(maxPrice);
    }
}
