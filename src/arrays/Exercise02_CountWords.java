package arrays;

import java.util.Arrays;

public class Exercise02_CountWords {
    public static void main(String[] args) {
        /*
        Assume that you are given below String
        String sentence = " I love arrays";
        Count how many words  you have in this String
         */
        //Solution with fori loop
        String sentence = "I love arrays";

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ')count++;
        }
        System.out.println(count +1);

        // Solution with foreach loop
        for (char c:sentence.toCharArray()){
            if(c == ' ')count++;
        }
        System.out.println(count +1);

        // Solution with split method

        System.out.println(sentence.split( " ").length);// 3
    }
}
