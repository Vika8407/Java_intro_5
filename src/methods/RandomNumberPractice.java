package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractice {

    public static void main(String[] args) {

        /*
        Generate 5 random numbers  and find their average!
        First -> 5 and 15
        Second -> 3 and 10
        Third -> bt 50 and 55
        Fourth -> bt 6 and 63
        Fifth -> 100 and 113
         */

        int r1 = RandomNumberGenerator.getARandomNumber(5,15);
        int r2 = RandomNumberGenerator.getARandomNumber(3,10);
        int r3 = RandomNumberGenerator.getARandomNumber(50,55);
        int r4 = RandomNumberGenerator.getARandomNumber(6,63);
        int r5 = RandomNumberGenerator.getARandomNumber(100,113);

        System.out.println("Number 1 = " + r1);
        System.out.println("Number 2 = " + r2);
        System.out.println("Number 3 = " + r3);
        System.out.println("Number 4 = " + r4);
        System.out.println("Number 5 = " + r5);

        System.out.println("The average is = " + (r1 + r2 + r3 + r4 + r5) / 5);

    }

            /*

        Create a public static method named as "isIncluded" which takes two String values, and return true if
        the small string is inside the other one. NOTE: You have to check which string is bigger than check if
        it is included.

        Example:
        "John", "John Doe" -> true
        "green, blue, red", "blue" -> true
        "John", "blue" -> false
         */
          // if str1 containing str2 or str2 containing str1
           public static boolean isIncluded (String str1, String str2) {
            /*if (str1.length() > str2.length()) return str1.contains(str2);
            return str2.contains(str1);
             } */

               return str1.contains(str2) || str2.contains(str1);
           }
}
