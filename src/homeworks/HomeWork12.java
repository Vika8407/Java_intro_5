package homeworks;

import java.util.Arrays;

public class HomeWork12 {
    /*

Requirement:
-Create a method called noDigit()
-This method will take one String argument and it will
return a new String with all digits removed from the
original String
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “Java”
Expected Result 2: “Java”
Test Data 3: “123Hello”
Expected Result 3: “Hello”
Test Data 4: “123Hello World149”
Expected Result 4: “Hello World”
Test Data 5: “123Tech456Global149”
Expected Result 5: “TechGlobal”

*/

    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    /*
Task-2
Requirement:
-Create a method called noVowel()
-This method will take one String argument and it will
return a new String with all vowels removed from the
original String
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “xyz”
Expected Result 2: “xyz”
Test Data 3: “JAVA”
Expected Result 3: “JV”
Test Data 4: “125$”
Expected Result 4: “125$”
Test Data 5: “TechGlobal”
Expected Result 5: “TchGlbl”
*/

    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    /*
Task-3
Requirement:
-Create a method called sumOfDigits()
-This method will take one String argument and it will return an int sum
of all digits from the original String.
NOTE: Return zero if there is no digits in the String
Test Data 1: “”
Expected Result 1: 0
Test Data 2: “Java”
Expected Result 2: 0
Test Data 3: “John’s age is 29”
Expected Result 3: 11
Test Data 4: “$125.0”
Expected Result 4: 8
*/
    public static int sumOfDigits(String str) {
        String count = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))
                count += c;
            else {
                sum += Integer.parseInt(count);
                count = "0";
            }
        }
        return sum + Integer.parseInt(count);
    }

    /*
Task-4
Requirement:
-Create a method called hasUpperCase()
-This method will take one String argument and it will return boolean
true if there is an uppercase letter and false otherwise.
Test Data 1: “”
Expected Result 1: false
Test Data 2: “java”
Expected Result 2: false
Test Data 3: “John’s age is 29”
Expected Result 3: true
Test Data 4: “$125.0”
Expected Result 4: false
*/
    public static boolean hasUpperCase(String str) {

        boolean hasUpperCase = false;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isUpperCase(c))
                hasUpperCase = true;
        }
        return hasUpperCase;
    }

    /*
Task-5
Requirement:
-Create a method called middleInt()
-This method will take three int arguments and it will return the middle
int.
Test Data 1: 1, 1, 1
Expected Result 1: 1
Test Data 2: 1, 2, 2
Expected Result 2: 2
Test Data 3: 5, 5, 8
Expected Result 3: 5
Test Data 4: 5, 3, 5
Expected Result 4: 5
Test Data 4: -1, 25, 10
Expected Result 4: 10
*/

    public static int middleInt(int num1, int num2, int num3) {

        int[] result = {num1,num2,num3};
        Arrays.sort(result);
        return  result[1];
    }

    /*
Task-6
Requirement:
-Create a method called no13()
-This method will take an int array as argument and it will return a new
array with all 13 replaced with 0.
NOTE: Assume length will always be more than zero.
Test Data 1: [1, 2, 3 ,4]
Expected Result 1: [1, 2, 3 ,4]
Test Data 2: [13, 2, 3 ]
Expected Result 2: [0, 2, 3 ]
Test Data 3:[13, 13, 13 , 13, 13]
Expected Result 3: [0, 0, 0, 0, 0]
*/

    public static int[] no13(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13)
                arr[i] = 0;
        }
        return arr;
    }

    /*
Task-7
Requirement:
-Create a method called arrFactorial()
-This method will take an int array as argument and it will return the
array with every number replaced with their factorials.
NOTE: If given array is empty, then return it back empty.
NOTE: 0! equals to 1
Test Data 1: [1, 2, 3, 4]
Expected Result 1: [1, 2, 6, 24]
Test Data 2: [0, 5]
Expected Result 2: [1, 120]
Test Data 3:[5 , 0, 6]
Expected Result 3: [120, 1, 720]
Test Data 4:[]
Expected Result 4: []
*/

    public static int[] arrFactorial(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            for (int j = 1; j < arr[i]; j++)
                num *= j;
            result[i] = num;
        }
        return result;
    }

    /*
Task-8
Requirement:
-Create a method called categorizeCharacters()
-This method will take String as an argument and return a String array as
letters at index of 0, digits at index of 1 and specials at index of 2.
NOTE: IGNORE SPACES
NOTE: Assume length will always be more than zero.
Test Data 1: “     ”
Expected Result 3: [ , , ]
Test Data 2: “abc123$#%”
Expected Result 2: [abc, 123, $#%]
Test Data 3: “12ab$%3c%”
Expected Result 3: [abc, 123, $%%]

     */

    public static String[] categorizeCharacters(String str) {

        String[] result = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                result[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i)))
                result[1] += str.charAt(i);
            else if (!Character.isWhitespace(i))
                result[2] += str.charAt(i);

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("\n----------Task 1 ----------\n");

        String str1 = "123Hello World149";
        System.out.println(noDigit(str1));

        System.out.println("\n----------Task 2 ----------\n");

        String str2 = "JAVA";
        System.out.println(noVowel(str2));

        System.out.println("\n----------Task 3 ----------\n");

        String str3 = "John’s age is 29";
        System.out.println(sumOfDigits(str3));

        System.out.println("\n----------Task 4 ----------\n");

        String str4 = "java";
        System.out.println(hasUpperCase(str4));

        System.out.println("\n----------Task 5 ----------\n");

        System.out.println(middleInt(5, 5, 8));

        System.out.println("\n----------Task 6 ----------\n");

        int[] num = {13, 2, 3};
        System.out.println(Arrays.toString(no13(num)));

        System.out.println("\n----------Task 7 ----------\n");

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(arr)));

        System.out.println("\n----------Task 8 ----------\n");

        String str5 = "abc123$#%";
        System.out.println(Arrays.toString(categorizeCharacters(str5)));

    }
}


