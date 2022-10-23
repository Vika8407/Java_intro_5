package arrays;

public class UnderstandingArray {
    public static void main(String[] args) {

        //Storing name in a String
        String name = "John";// holds single name

        //Storing best friends names
        //String bff1 ="Jane", bff2 ="Alex", bff3 = "Mike";

        String name1 = "James";
        String [] names = {"Beyza", "Andrii", "Vlad", "Olena"};// holding a collection of name

       // Retrieving an element from an array - using index
        System.out.println(names[2]);
        System.out.println(names[3]);

        // ArrayIndexOutOfBoundException 0-4
        //System.out.println(names[5]);
        //System.out.println(names[-1]);

        int age = 25;
        int [] ages = {21, 23, 25};
        System.out.println(ages[2]); //25


    }
}
