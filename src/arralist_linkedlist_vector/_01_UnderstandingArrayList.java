package arralist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        // 1. Declaring Array vs an Arraylist

        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>();// capasity in ampty  is 10 by default

        System.out.println("\n -----------Size of Array vs ArrayList----------\n");

        // 2. Getting the size of the array vs arraylist

        System.out.println(" The size of Arrays = " + names1.length);// 3
        System.out.println(" The size of ArrayList = " + names2.size());// 0

        // 3. Printing an  Array vs ArrayList

        System.out.println("\n -----------Printing of Array vs ArrayList----------\n");
        System.out.println(" The Array = " +Arrays.toString(names1));//[nul,null, null]
        System.out.println("The ArrayList = " + names2);//[]

        // 4. Adding elements to specific index
        System.out.println("\n -----------Printing of Array vs ArrayList----------\n");
        names1[0] = "Alex";
        names2.add(0,"John");// names2.add(John);
        System.out.println(" The Array = " +Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);


        names1[0] = "Ali";
        names1[1] ="Alex";
        names1[2] ="Andrii";
        System.out.println(Arrays.toString(names1));

        names2.add("John");
        names2.add("Jane");
        names2.add("Joe");
        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Yildiz");
        names2.add("Samir");

        System.out.println(" The Array List "+ names2);
        System.out.println("The size of the aarayList = " + names2.size());

        //5. Updating an existing elements

        names1[1] = "Mike";//arrays
        names2.set(1, "Olena");//arraylist
        System.out.println(" The Array = " +Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);






    }
}
