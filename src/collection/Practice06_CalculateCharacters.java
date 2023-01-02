package collection;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {
        /*
        You ar e given a String as "banana"
        Print all duplicated letter

        Expected
        a
        n

        Key     Values
        b        1
        a        3
        n        2
         */

        System.out.println("\n ------------Task 1 -----------\n");
        String str = "banana";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);

        }
        System.out.println(map);//{a=3, b=1, n=2}

        /*
        Check thr entry
        If the value > 1 , then print the key of the value
         */
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) System.out.println(entry.getKey());
        }

        System.out.println("\n ------------Task 2 -----------\n");
        System.out.println(getMostCounted(""));
        System.out.println(getMostCounted(null));
        System.out.println(getMostCounted("banana"));
        System.out.println(getMostCounted("apple"));
        System.out.println(getMostCounted("papa"));
        System.out.println(getMostCounted("abcacbabc"));
        System.out.println(getMostCounted("Java is fun but it is complicated!"));
    }
        /*
        Create a method that takes String as arg
        and return the most occurred character in the String
        if there are more than one character that is counted the most, then return all
        If the String is empty just return nothing

        "" -> []
        null -> []
        "banana" ->[a]
        "apple" -> [p]
        "papa" ->[a,b,c]
        "abcabcacb" -> [a, b, c]
         */

        public static Set<Character> getMostCounted(String str){
            /*
            1.Count all unique characters
            2. Find the max occurrence // 3
            3. Find all characters that has the max count, put them in collection and return it back
             */
            Set <Character> result = new LinkedHashSet<>();
            if (str == null || str.isEmpty())return result;

            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (Character c : str.toCharArray()) {
                if (map.containsKey(c))map.put(c, map.get(c)  +1);
                else map.put(c,1);//increasing by 1
            }
            int maxCount = new TreeSet<>(map.values()).last();//3
            for (Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() == maxCount) result.add(entry.getKey());
            }
            return result;
        }











}
