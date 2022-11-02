package arralist_linkedlist_vector;

import java.util.ArrayList;

public class _04_AddAll_RemoveAll_Methods {
    public static void main(String[] args) {

        ArrayList<String>group1Students = new ArrayList<>();
        group1Students.add("Alex");
        group1Students.add("Mike");

        ArrayList<String>group2Students = new ArrayList<>();
        group2Students.add("John");
        group2Students.add("Jane");
        group2Students.add("James");

        ArrayList<String>group3Students = new ArrayList<>();
        group3Students.add("Leo");
        group3Students.add("lucy");
        group3Students.add("Lucio");

        ArrayList<String>allStudents = new ArrayList<>();
        allStudents.addAll(group1Students);
        System.out.println(allStudents);//[Alex, Mike]

        allStudents.addAll(group3Students);
        System.out.println(allStudents);//[ Alex,Mike,Leo,Lucy,Lucio]

       // when we want add group2 in a beginning and move all other
        allStudents.addAll(0,group2Students);
        System.out.println(allStudents);//[ John,Jane,James,Alex,Mike,Leo,Lucy,Lucio]

        // remove all group1
        group1Students.add("Messi");
        System.out.println(allStudents.removeAll(group1Students));
        System.out.println(allStudents);

    }
}
