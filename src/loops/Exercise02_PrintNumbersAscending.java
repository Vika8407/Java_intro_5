package loops;

import java.util.SortedMap;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i != 10) System.out.println(i + " - ");
            else System.out.println(i);

            //------------- Adenced way----------// Home work logic
            String result ="";
            for (int i1 = 1; i1 <= 10; i++ ){
                result += i1 + " - ";
            }
            System.out.println(result.substring(0,result.length()-3));
        }
    }
}