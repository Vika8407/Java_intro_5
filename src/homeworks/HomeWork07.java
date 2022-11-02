package homeworks;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class HomeWork07 {
    public static void main(String[] args) {
        System.out.println("\t\n ============ TASK 1 ============\n");
        /*
                Requirement:
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
        Expected Result:
        23
        10
        67
        10, 23, 67, 23, 78]
                 */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("\t\n ============ TASK 2 ============\n");
        /*

            Create an ArrayList and store below colors
            lue, Brown, Red, White, Black, Purple
            HEN:
            Print element at index of 1
            Print element at index of 3
            Print element at index of 5
            Print the entire list
            xpected Result:
            rown
            hite
            urple

            [Blue, Brown, Red, White, Black, Purple]

                    */
        ArrayList<String>  colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

                System.out.println("\t\n ============ TASK 3 ============\n");
                    /*
                    Requirement:
            -Create an ArrayList and store below numbers
            23, -34, -56, 0, 89, 100
            THEN:
            -Print the entire list
            -Print the entire list sorted in ascending order
            Expected Result:
            [23, -34, -56, 0, 89, 100]

            [-56, -34, 0, 23, 89, 100]

                     */

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);


        System.out.println("\t\n ============ TASK 4 ============\n");
        /*
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        THEN:
        -Print the entire list
                -Print the entire list sorted lexicographically
        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]

        [Berlin, Istanbul, Madrid, Paris
         */
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\t\n ============ TASK 5 ============\n");
                   /*

            Create an ArrayList and store Marvel characters below
            pider Man, Iron Man, Black Panter, Deadpool, Captain America
            HEN:
            Print the entire list
            Then, check if it contains Wolwerine
            f it contains Wolwerine, then print true
            f it does not contain Wolwerine, print false
            xpected Result:
            Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
            false
                    */


        ArrayList<String> hero = new ArrayList<>(Arrays.asList("Spider Men", "Iron Man"," Black Panter", "Deadpool", "Captaine America"));
        System.out.println(hero);
        System.out.println(hero.contains("Wolwerine"));


        System.out.println("\t\n ============ TASK 6 ============\n");
        /*
                                equirement:
            -Create an ArrayList and store Avengers characters
            below
            Hulk, Black Widow, Captain America, Iron Man
            THEN:
            -Print the entire list sorted lexicographically
            -Then, check if it contains Hulk and Iron Man
            if it contains both, then print true
            if it does not contain both, print false
            Expected Result:
            [Black Widow, Captain America, Hulk, Iron Man]
            true
         */
        ArrayList<String> superHeroes = new ArrayList<>(Arrays.asList("Hulk", "Black Widow",
                "Captain America", "Iron Man"));

        ArrayList<String> someHeroes = new ArrayList<>(Arrays.asList("Hulk" , "Iron Man"));
        System.out.println(superHeroes.containsAll(someHeroes));

        System.out.println("\t\n ============ TASK 7 ============\n");
        /*
                    Create an ArrayList and store characters below
            A, x, $, %, 9, *, +, F, G
            THEN:
            -Print the entire list
            -Print each element
            Expected Result:
            [A, x, $, %, 9, *, +, F, G]
            A
            x
            $
            %
            9
            *
            +
            F
            G
         */

        ArrayList<Character> symbols = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(symbols);
        for (Character symbol : symbols) {
            System.out.println(symbol);

        }



        System.out.println("\t\n ============ TASK 8 ============\n");
        /*
        Requirement:
            -Create an ArrayList and store below objects
            Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
            THEN:
            -Print the entire list
            -Print the entire list sorted lexicographically
            -Count objects that starts with M or m
            -Count objects that does not have A or a or E or e
            Expected Result:
            [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
            [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
             3
             1
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(words);
        Collections.sort(words);
         int counterM = 0;
         int counterAandE = 0;

        for (String word : words) {
            if( word.toLowerCase().contains("M"))counterM++;
            if (! word.toLowerCase().contains("a") && !word.toLowerCase().contains("e"))counterAandE++;
        }
        System.out.println(counterM);
        System.out.println(counterAandE);



        System.out.println("\t\n ============ TASK 9 ============\n");
                /*

        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer
        THEN:
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p
        Expected Result:
        [Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p = 2
                 */

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(objects);

        int countUpper = 0, countLower =0, countHavingPop = 0, countStarPOrp = 0;

        for (String object : objects) {
             if (Character.isUpperCase(object.charAt(0)))countUpper++;
             if (Character.isLowerCase(object.charAt(0)))countLower++;
             if (object.toLowerCase().contains("p"))countHavingPop++;
             if (object.toLowerCase().startsWith("p") && object.toLowerCase().endsWith("p"))countStarPOrp++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements  having P or p = " + countHavingPop);
        System.out.println("Elements  starting or ending with P or p = " + countStarPOrp);


        System.out.println("\t\n ============ TASK 10 ============\n");
       /*

            -Create an ArrayList and store below numbers
            3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
            THEN:
            -Print the entire list
            -Print how many element can be divided by 10
            -Print how many even numbers are greater than 15
            -Print how many odd numbers are less than 20
            -Print how many elements are less than 15 or greater
            than 50
            Expected Result:
            [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
            Elements that can be divided by 10 = 4
            Elements that are even and greater than 15 = 3
            Elements that are odd and less than 20 = 4
            Elements that are less than 15 or greater than 50 = 8
                    */

        ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numb);

        int countBy10 = 0, countEandG15 = 0, countLess20 = 0, countL15G50 = 0;

        for (Integer integer : numb) {
            if (integer % 10 == 0 ) countBy10++;
            if (integer % 2 == 0 && integer > 15) countEandG15++;
            if (integer % 2 !=0 && integer < 20) countLess20++;
            if (integer < 15 || integer > 50) countL15G50++;
        }
        System.out.println("Elements that can be divided by 10 = " +countBy10);
        System.out.println("Elements that are even and greater than 15 = " +countEandG15);
        System.out.println("Elements that are odd and less than 20 =  " +countLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " +countL15G50);

    }
}
