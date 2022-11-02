package homeworks;

import java.util.Arrays;

public class HomeWork06 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");
//
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


        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\t\n ============ TASK 3 ============\n");


        int[] num = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        System.out.println("\t\n ============ TASK 4 ============\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\t\n ============ TASK 5============\n");

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


        double[] number = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(number));
        for (double numb : number) {
            System.out.println(numb);
        }


        System.out.println("\t\n ============ TASK 8 ============\n");

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
