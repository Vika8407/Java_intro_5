package regexes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provide students a complete education  ... SDET");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());// finding a  word, and printing true if yes
        System.out.println(matcher.group());//printing a string
        System.out.println("Starting index" + matcher.start());// finding and printing starting index
        System.out.println("Ending index" + matcher.end());// finding ending index

        // ------ With while loop--------//
        int couner = 0;
        while (matcher.find()){
            couner++;
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(couner);


                 System.out.println("\t\n ============ TASK 1 ============\n");
                 /*

         Ask the user to enter a sentence and count how many words are in the
         sentence.
         The regex pattern for a single word is [A-Za-z]{2,}

         print out how many words are in the sentence.
         Scenario 1:
         Program: Please enter a sentence
         User: Hello, my name is John.
         Program:
         Hello
         my
         name
         is
         john
         doe
         This sentence contains 6 words
         Scenario 2:
         Program: Please enter a username
         User:
         Program: This sentence contains 0 words

                  */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = input.nextLine();
        pattern = Pattern.compile("[A-Za-z]{2,}");
        matcher = pattern.matcher(sentence);

        int countainer = 0;
        while (matcher.find()){
            System.out.println(matcher.group());
            countainer++;
        }
          System.out.println(" This sentence contains"+ countainer +" words");


        //System.out.println("\t\n ============ TASK 2  ============\n");

        // Identify if method true or false

        Pattern.matches("[xyz]", "xyz"); // false
        Pattern.matches("[a-z&&[^pqrs]]", "n");//true
        Pattern.matches("[a-z&&[^p-s]]", "r");//false
        Pattern.matches("[^xyz]", "y");// false

        System.out.println("\t\n ============ TASK 3 ============\n");

                    /*
                    Write a regex pattern with the conditions below:
            • Must be more than 8 characters.
            • Must be no more than 15 characters.
            • Could include letters(Upper and Lower), numbers,
            _, and -
                     */
        pattern = Pattern.compile("[a-zA-Z0-9[_-]]{9,15}");
        System.out.println(Pattern.matches("[a-zA-Z0-9[_-]]{9,15}", "TechGlobal"));










    }
}
