package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork16 {

    public static void main(String[] args) {

        System.out.println("==========Task1==========");

        String data = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        Map<String, String> parsedData = parseData(data);
        System.out.println(parsedData);

        System.out.println("==========Task2==========");

        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 2);
        items.put("Orange", 3);
        items.put("Mango", 1);
        double totalPrice = calculateTotalPrice1(items);
        System.out.println("Total price: " + totalPrice);

        System.out.println("==========Task3==========");

        Map<String, Integer> items2 = new HashMap<>();
        items.put("Apple", 4);
        items.put("Orange", 3);
        items.put("Mango", 8);
        double totalPrices = calculateTotalPrice2(items2);
        System.out.println("Total price: " + totalPrices);
    }

    /*

Task-1
Write a method called as parseData() which takes a
String has some keys in {} and values after between }{
and returns a collection that has all the keys and values
as entries.
NOTE: The keys should be sorted!
Test Data:
{104}LA{101}Paris{102}Berlin{103}Chicago{100}Lon
don
Expected Output:
{100=London, 101=Paris, 102=Berlin, 103=Chicago,
104=LA}
*/
    public static Map<String, String> parseData(String data) {
        // Initialize empty map to store key-value pairs
        Map<String, String> parsedData = new HashMap<>();

        // Split the input string by '}{' to separate key-value pairs
        String[] pairs = data.split("}\\{");

        // Iterate through each pair and add to map
        for (String pair : pairs) {
            // Remove curly braces from each side of the pair
            pair = pair.replaceAll("[{}]", "");

            // Split the pair into key and value
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            // Add key-value pair to map
            parsedData.put(key, value);
        }

        // Sort the map by key
        parsedData = new TreeMap<>(parsedData);
        return parsedData;
    }

    /*
Task-2
Requirement:
Write a method called as calculateTotalPrice1() which takes
a Map of some shopping items with their amounts and
calculates the total prices as double. Item prices are given
below
Apple = $2.00
Orange = $3.29
Mango = $4.99
Pineapple = $5.25
Test Data 1:
{Apple=3, Mango = 1}
Expected Output 1:
10.99
Test Data 2:
{Apple=2, Pineapple = 1, Orange=3}
Expected Output 2:
19.12
*/

    public static double calculateTotalPrice1(Map<String, Integer> items) {
        double totalPrice1 = 0;
        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 2.00);
        itemPrices.put("Orange", 3.29);
        itemPrices.put("Mango", 4.99);
        itemPrices.put("Pineapple", 5.25);
        // Add more item prices as necessary
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String item = entry.getKey();
            int amount = entry.getValue();
            if (itemPrices.containsKey(item)) {
                totalPrice1 += itemPrices.get(item) * amount;
            }
        }
        return totalPrice1;
    }

    /*
Task-3
Requirement:
Write a method calculateTotalPrice2() which takes a Map of some
shopping items with their amounts and calculates the total prices as
double. Item prices are given below
Apple = $2.00
Orange = $3.29
Mango = $4.99
BUT there will be some discounts as below
There will be %50 discount for every second Apple
There will be 1 free Mango if customer gets 3. So, fourth one is free.
Test Data 1:
{Apple=3, Mango = 5}
Expected Output 1:
24.96
Test Data 2:
{Apple=4, Mango = 8, Orange=3}
Expected Output 2:
45.81

     */

    private static final double PRICE_APPLE = 2.00;
    private static final double PRICE_ORANGE = 3.29;
    private static final double PRICE_MANGO = 4.99;

    public static double calculateTotalPrice2(Map<String, Integer> items2) {
        double totalPrice2 = 0;

        int appleCount = items2.getOrDefault("Apple", 0);
        totalPrice2+= (appleCount - appleCount / 2) * PRICE_APPLE;

        int orangeCount = items2.getOrDefault("Orange", 0);
        totalPrice2 += orangeCount * PRICE_ORANGE;

        int mangoCount = items2.getOrDefault("Mango", 0);
        totalPrice2 += (mangoCount - mangoCount / 4) * PRICE_MANGO;

        return totalPrice2;


    }

}
