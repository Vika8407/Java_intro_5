package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] students ={
                {"Ali", "Mehmet", "Alex"},
                {"Alex","Regina"},
                {"Abdallah","Newer"}
        };
        System.out.println(students[0][1]);//Mehmet
        System.out.println(students[1][1]);//Regina

        System.out.println(students.length);// 3 size of outer arrays

        //Printing inner array with fori loop

        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }

         //Printing inner array with foreach loop

        for (String[] group : students){
            System.out.println(Arrays.toString(group));
        }

        //printing the multi - dimensional array
        System.out.println(Arrays.deepToString(students));//[[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]

        //Task : print each member in different lines

        ///      Foreach loop     ///
        for (String[] group : students){
            for (String student : group) {
                System.out.println(student);
            }
        }

        ///      Fori loop      ///


    }
}
