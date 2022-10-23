package homeworks;

import java.util.Arrays;

public class HomeWork06 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 9;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\t\n ============ TASK 2 ============\n");

        String[] str =new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\t\n ============ TASK 3 ============\n");

        int[] num = {23, -34, -56, 0, 89, 100};
        System.out .println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("\t\n ============ TASK 4 ============\n");
        /*Requirement:
        -Create a String array that stores countries below
                Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
                -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]

          [Argentina, Germany, Romania, Ukraine]
        */
        //String[] countries = new String[3];
        //countries[0] = "Germany";
        //countries[1] = "Argentina";
        //countries[2] = "Ukraine";
        //countries[3] = "Romania";
        //System.out.println(Arrays.toString(countries));
        //Arrays.sort(countries);
        //System.out.println(Arrays.toString(countries));
//

        System.out.println("\t\n ============ TASK 7 ============\n");


        double[] number = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(number));
        for (double numb : number){
            System.out.println(numb);
        }
    }
}
