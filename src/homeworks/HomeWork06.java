package homeworks;

import java.util.Arrays;

public class HomeWork06 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");
//
        /*

            equirement:
            Create an int array having size of 10
            Assign 23 to index of 2
            Assign 12 to index of 4
            Assign 34 to index of 7
            Assign 7 to index of 9
            Assign 15 to index of 6
            Assign 89 to index of 0
            HEN:
            Print element at index of 3
            Print element at index of 0
            Print element at index of 9
            Print the entire array
            xpected Result:

            9

            89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
                    */
        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\t\n ============ TASK 2 ============\n");

        /*

        -Create a String array having size of 5
        -Assign “abc” to index of 1
        -Assign “xyz” to index of 4
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 4
        -Print the entire array
        Expected Result:
        null
        null
        xyz
        [null, abc, null, null, xyz
                 */

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\t\n ============ TASK 3 ============\n");

        /*
                Requirement:
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100
                 */

        int[] num = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        System.out.println("\t\n ============ TASK 4 ============\n");

               /*
               Requirement:
        Create a String array that stores countries below
        ermany, Argentina, Ukraine, Romania
        HEN:
        Print the entire array
        Print the entire array sorted lexicographically
        xpected Result:
        Germany, Argentina, Ukraine, Romania]

        Argentina, Germany, Romania, Ukraine]
                */
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\t\n ============ TASK 5============\n");

                    /*
                    equirement:
            -Create a String array that stores cartoon dogs below
            Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
            THEN:
            -Print the entire array
            -Then, check if it contains Pluto
            if it contains Pluto, then print true
            if it does not contain Pluto, print false
            Expected Result:
            [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
            true
                     */
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        boolean hasPluto = true;
        System.out.println(Arrays.toString(dogs));

        for (String dog : dogs) {
            if (dog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\t\n ============ TASK 6============\n");

                   /*

            equirement:
            Create a String array that stores cartoon cats
            elow
            arfield, Tom, Sylvester, Azrael
            HEN:
            Print the entire array sorted lexicographically
            Then, check if it contains Garfield and Felix
            f it contains both, then print true
            f it does not contain both, print false
            xpected Result:
            Azrael, Garfield, Sylvester, Tom]
            false
                    */
        String[] cats = {" Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        boolean hasCats = false;
        for (String cat : cats) {
            if (cat == "Garfield") {
                if (cat == "Felix")
                    hasCats = true;
                break;
            }
        }
        System.out.println(hasCats);


        System.out.println("\t\n ============ TASK 7 ============\n");

       /*
                       Requirement:
                -Create a double array that stores numbers below
                10.5, 20.75, 70, 80, 15.75
                THEN:
                -Print the entire array
                -Print each element
                Expected Result:
                [10.5, 20.75, 70.0, 80.0, 15.75]
                10.5
                20.75
                70
                80
                15.75
                        */
        double[] number = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(number));
        for (double numb : number) {
            System.out.println(numb);
        }


        System.out.println("\t\n ============ TASK 8 ============\n");

                    /*
                    Requirement:
            -Create a char array that stores characters below
            A, b, G, H, 7, 5, &, *, e, @, 4
            THEN:
            -Print the entire array
            -Print the total count of the letters
            -Print the total count of lowercase letters
            -Print the total count of uppercase letters
            -Print the total count of digits
            -Print the total count of special characters
            Expected Result:
            [A, b, G, H, 7, 5, &, *, e, @, 4]
            Letters = 5
            Uppercase letters = 3
            Lowercase letters = 2
            Digits = 3

            Special characters = 3
                     */
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        int counterL = 0;
        int counterUp = 0;
        int counterLow = 0;
        int counterDig = 0;
        int counterCar = 0;

        // recap way
       //for (char c : characters){
       //    If(characters.isUppercase(c))counterUp++;
       //    else if( characters.isLowercase(c)) counterLow;
       //    else if (characters.isDigits(c))counterDig++;
       //    else if ( c !=  ' ')counterCar;
       //}

        for (char character : characters) {
            if (Character.isLetter(character)) {
                counterL++;
                if (Character.isUpperCase(character))
                    counterUp++;
               else counterLow++;
            }
            else if (Character.isDigit(character))
                counterDig++;
                else counterCar++;

        }System.out.println(Arrays.toString(characters));
            System.out.println("Letter  = " + counterL);
            System.out.println("Uppercase letter = " + counterUp);
            System.out.println("Lowercase letter = " + counterLow);
            System.out.println("Digits = " + counterDig);
            System.out.println(" Special characters = " + counterCar);


        System.out.println("\t\n ============ TASK 9 ============\n");

          /*
                     Requirement:
            Create a String array that stores objects below
            en, notebook, Book, paper, bag, pencil, Ruler
            HEN:
            Print the entire array
            Print how many elements starts with uppercase
            Print how many elements starts with lowercase
            Print how many elements starts with B or P, ignoring cases
            Print how many elements has “book” or “pen” in it, ignoring
            cases
            Expected Result:
            [Pen, notebook, Book, paper, bag, pencil, Ruler]
            Elements starts with uppercase = 3
            Elements starts with lowercase = 4
            Elements starting with B or P = 5
            Elements having ”book” or “pen”= 4
                      */
        String[] elements = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countBAndP = 0;
        int countBookAndPan = 0;

        for (String element : elements) {
            if(Character.isUpperCase(element.charAt(0)))
                countUpperCase++;
            else countLowerCase++;
            if(element.toLowerCase().contains("book") || (element.toLowerCase().contains("pen")))
                countBookAndPan++;
            if(element.toLowerCase().contains("b") || element.toLowerCase().contains("p"))
                countBAndP++;

        }System.out.println(Arrays.toString(elements));
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements starts with uppercase  = " + countUpperCase);
        System.out.println("Elements starts with B or P  = " + countBAndP);
        System.out.println("Elements starts with uppercase  = " + countBookAndPan);



        System.out.println("\t\n ============ TASK 10 ============\n");

             /*

            -Create an int array that stores numbers below
            3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
            THEN:
            -Print the entire array
            -Print how many elements are more than 10
            -Print how many elements are less than 10
            -Print how many elements are 10
            Expected Result:
            [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
            Elements that are more than 10 = 5
            Elements that are less than 10 = 4

            Elements that are 10 = 2
                     */
        int[] numbers1 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int conteinerMore10 = 0;
        int conteinerLess10 = 0;
        int conteinerAre10 = 0;

       for ( int n : numbers1) {
           if(n > 10) conteinerMore10++;
           else if (n < 10) conteinerLess10++;
           else conteinerAre10 ++;
       }   System.out.println("Elements that are more than 10 = " + conteinerMore10);
           System.out.println("Elements that are less than 10 = " + conteinerLess10 );
           System.out.println(" Elements that are 10 = " + conteinerAre10 );


           System.out.println("\t\n ============ TASK 11 ============\n");

           /*

            -Create 2 int arrays that stores numbers below
            First -> 5, 8, 13, 1, 2
            Second -> 9, 3, 67, 1, 0
            THEN:
            -Print both arrays
            –Then, create a new array called that will take
            greatest of same index from first 2 arrays
            -Print third array as well
            Expected Result:
            1st array is =  [5, 8, 13, 1, 2]
            2nd array is = [9, 3, 67, 1, 0]
            3rd array is =  [9, 8, 67, 1, 2]
            */
      int[] numb1 = {5, 8, 13, 1, 2};
      int[] numb2 = {9, 3, 67, 1, 0};
      int[] maxNumb = new int[5];
      for(int i = 0; i < numb1.length; i++){
          maxNumb[i] = Math.max(numb1[i], numb2[i]);
          }
      System.out.println("1st array is =" + Arrays.toString(numb1));
      System.out.println("2nd array is =" + Arrays.toString(numb2));
      System.out.println("3rd array is =" + Arrays.toString(maxNumb));





    }
}
