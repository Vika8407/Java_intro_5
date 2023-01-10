package homeworks;

public class HomeWork14 {
    public static void main(String[] args) {

        System.out.println("\n========== Task1 ==========\n");

        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(15);

        System.out.println("\n========== Task2 ==========\n");

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("\n========== Task3 ==========\n");

        System.out.println(findSumNumbers("frfrfr34fr"));
        System.out.println(findSumNumbers("43!"));
        System.out.println("\n========== Task4 ==========\n");

        System.out.println(findBiggestNumber("asdff123sd4"));
        System.out.println(findBiggestNumber("655"));

        System.out.println("\n========== Task5 ==========\n");

        System.out.println(countSequence0fCharacters(""));
        System.out.println(countSequence0fCharacters("abc"));
        System.out.println(countSequence0fCharacters("abJava is fun"));

    }

    //==========Task 1==========//
/*
Create a method called fizzBuzz1()
-This method will take an int argument, and it will print numbers starting from 1 to given argument. BUT, it will print
"Fizz" for the numbers divided by 3, "Buzz" for the numbers divided by 5, and "FizzBuzz" for the numbers divided both by 3 and 5.
*/
    public static void fizzBuzz1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

             //==========Task 2==========//

    /*
-Create a method called fizzBuzz2 ()
-This method will take an int argument, and it will return a String. BUT it will return "Fizz" if the given number is divided by 3, "Buzz" if the number is divided by 5, and
"FizzBuzz" if the number is divided both by 3 and 5.
Otherwise, it will return number itself.
*/

public static String fizzBuzz2(int n) {
String result = "";
if (n % 3 == 0 && n % 5 == 0) result = "FizzBuzz";
else if (n % 3 == 0) result = "Fizz";
else if (n % 5 == 0) result = "Buzz";
else result = String.valueOf (n);
return result;
}
             //==========Task 3==========//

    /*
-Create a method called findSumNumbers ()
-This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.
NOTE: If there are no numbers represented in the String, return 0.
*/
    public static int findSumNumbers(String str) {
        int sum = 0;
        StringBuilder builder = new StringBuilder ();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit (c)) builder.append (c);
            else {
                if (builder.length() > 0) {
                    sum += Integer.parseInt(builder.toString()); builder.setLength(0);
                }
            }
        }
        if (builder.length() > 0) {
            sum += Integer.parseInt(builder.toString());
        }
        return sum;
    }

                //==========Task 4==========//

    /*
-Create a method called findBiggestNumber ()
-This method will take a String argument and it will return an int which is the number presented in the String.
NOTE: If there are no numbers represented in the String, return 0.
*/
    public static int findBiggestNumber(String str) {
        int count = 0;
        StringBuilder s = new StringBuilder ();
        for (int i = 0; i < str.length (); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) s.append(c);
            else {
                if (s.length() > 0) {
                    int num = Integer.parseInt(s.toString());
                    count = Math.max (count, num);
                    s.setLength(0);
                }
            }
        }
        if (s.length() > 0) {
            int num = Integer.parseInt(s.toString());
            count = Math.max (count, num);
        }
        return count;
    }

             //==========Task 5==========//

    /* -Create a method called countSequence0fCharacters ()
-This method will take a String argument and it will return a String which is the count of repeated characters in a sequence in the String.
            NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
            */
    public static String countSequence0fCharacters (String str) {

        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = str.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == currentChar) {
                currentCount++;
            } else {
                stringBuilder.append(currentCount).append(currentChar);
                currentChar = c;
                currentCount = 1;
            }
        }
        stringBuilder.append(currentCount);
        return stringBuilder.toString();
    }
}
