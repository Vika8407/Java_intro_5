package collection;

import java.util.*;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("France", " Paris");
        System.out.println(capitals);//{France= Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");
        System.out.println(capitals);//{Italy=Rome, France= Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("\n----------Retrives value with their keys----------\n");
        System.out.println(capitals.get("Spain"));// Madrid
        System.out.println(capitals.get("Belgium"));//null
        System.out.println(capitals.getOrDefault("Belgium", "Does not exist"));//Does not exist

        System.out.println("\n----------Check if map contains given key or value----------\n");
        System.out.println(capitals.containsKey("Germany"));// true
        System.out.println(capitals.containsKey("Portugal"));//false
        System.out.println(capitals.containsValue("Ankara"));//false
        System.out.println(capitals.containsValue("Berlin"));//true

        System.out.println("\n----------Update the value for specified key----------\n");
        System.out.println(capitals.replace("Ukraine", "Kyiv"));//null
        System.out.println(capitals.replace("Germany","berlin","Munic"));//false
        System.out.println(capitals.replace("Germany","Berlin","Munic"));//true

        capitals.put("Turkey","Ankara");
        System.out.println(capitals);
        capitals.put("Turkey","Istanbul");
        System.out.println(capitals);

        System.out.println("\n----------Remove some entries----------\n");
        capitals.remove("France");
        System.out.println(capitals);//{Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}
        capitals.remove("USA");//null
        capitals.remove("Germany","Stuttgart");
        System.out.println(capitals);//{Turkey=Istanbul, Italy=Rome, Germany=Munic, Spain=Madrid}
        capitals.remove("Germany","Munic");
        System.out.println(capitals);//{Turkey=Istanbul, Italy=Rome, Spain=Madrid}

        System.out.println("\n----------Advanced Map methods----------\n");
        //Key:Turkey,Italy,Spain
        //Values:Istanbul,Rome,Madrid


        Set<String > set = capitals.keySet();
        System.out.println(set);//[Turkey, Italy, Spain]
        TreeSet<String> treeSet = new TreeSet<>(set);// casting to tree set we need create a new object (constructor for that)
        System.out.println(treeSet);

        Collection<String> collections = capitals.values();
        System.out.println(collections);//[Istanbul, Rome, Madrid]

        System.out.println("\n----------Iterating key and values----------\n");
        ArrayList<String > list = new ArrayList<>(capitals.values());
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }// Turkey Italy Spain
        for (String s : capitals.values()) {
            System.out.println(s);
        }//Istanbul Rome Madrid

        System.out.println("\n----------Getting all the entries----------\n");

        Set<Map.Entry<String,String>> entries = capitals.entrySet();

        for (Map.Entry<String,String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

















    }
}
