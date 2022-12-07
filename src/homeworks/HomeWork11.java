package homeworks;

import java.util.Arrays;

public class HomeWork11 {
    public static void main(String[] args) {

        System.out.println("\n--------- Task 1 ----------\n");

        System.out.println(noSpace("   Hello   "));

        System.out.println("\n--------- Task 2 ----------\n");

        System.out.println(replaceFirstLast("lech GlobaT"));

        System.out.println("\n--------- Task 3 ----------\n");

        System.out.println(hasVowel("Java"));

        System.out.println("\n--------- Task 4 ----------\n");

        checkAge(1984);

        System.out.println("\n--------- Task 5 ----------\n");

        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n--------- Task 6 ----------\n");

        String[] str = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(str)));

        System.out.println("\n--------- Task 7 ----------\n");

        int[] num = {99, 11, 100, 13, 14, 101};
        System.out.println(Arrays.toString(no3or5(num)));

        System.out.println("\n--------- Task 8 ----------\n");

        int[] arr = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(arr));

    }

  /*


Requirement:
-Create a method called noSpace()
-This method will take one String argument and it will
return a new String with all spaces removed from the
original String
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “Java”
Expected Result 2: “Java”
Test Data 3: “    Hello    ”
Expected Result 3: “Hello”
Test Data 4: “ Hello World   ”
Expected Result 4: “HelloWorld”
Test Data 5: “Tech Global”
Expected Result 5: “TechGlobal”

*/

    public static String noSpace( String str){

        String counter = "";
        counter= str.replaceAll("\\s+", " ").trim();

        return counter;
    }

    /*
Task-2
Requirement:
-Create a method called replaceFirstLast()
-This method will take one String argument and it will return a new
String with first and last characters replaced
NOTE: if the length is less than 2, then return empty String
NOTE: Ignore all before and after spaces (get actual String only)
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “A”
Expected Result 2: “”
Test Data 3: “    A       ”
Expected Result 3: “”
Test Data 4: “Hello”
Expected Result 4: “oellH”
Test Data 5: “Tech Global”
Expected Result 5: “lech GlobaT”

*/

   public static String replaceFirstLast(String argument){

       return argument.substring(argument.length()-1) +
               argument.substring(1,argument.length()-1) +
               argument.substring(0,1);
   }

    /*
Task-3
Requirement:
-Create a method called hasVowel()
-This method will take one String argument and it will return a
boolean checking if String has any vowel or not
NOTE: Vowels are = a, e, o, u, I
NOTE: Ignore cases
Test Data 1: “”
Expected Result 1: false
Test Data 2: “Java”
Expected Result 2: true
Test Data 3: “1234”
Expected Result 3: false
Test Data 4: “ABC”
Expected Result 4: true
*/
    
    public static boolean hasVowel(String letter){

        letter = letter.toLowerCase();
        for (int i = 0; i < letter.length() ; i++) {
            char vl = letter.charAt(i);
            if (vl == 'a' || vl == 'e' || vl =='i' || vl == 'o' || vl =='u'){
            }
        }
        return true;
    } 



    /*
Task-4
Requirement:
-Create a method called checkAge()
-This method will take an int yearOfBirth as  argument and it will print
message below based on the entry
If the age is less than 16, then print “AGE IS NOT ALLOWED”
If the age is 16 or more, then print “AGE IS ALLOWED”
If the age is more than 100 or a future year entered, print “AGE IS NOT
VALID”
NOTE: Calculate the age taking base year as current year in a dynamic
way. You can use Date class.
Test Data 1: 2010
Expected Result 1: AGE IS NOT ALLOWED
Test Data 2: 2006
Expected Result 2: AGE IS ALLOWED
Test Data 3: 2050
Expected Result 3: AGE IS NOT VALID
Test Data 4: 1920
Expected Result 4: AGE IS NOT VALID
Test Data 5: 1800
Expected Result 5: AGE IS NOT VALID

*/

    public static void checkAge(int yearOfBirth){

        int thisYear = 2022;
        if (thisYear - yearOfBirth > 100)
            System.out.println("Age is not valid!");
        if (thisYear  - yearOfBirth >= 16)
            System.out.println("age is allowed!");
        else
            System.out.println("Age is not allowed");

    }

    /*

Task-5
Requirement:
-Create a method called averageOfEdges()
-This method will take three int arguments and it will return
average of min and max numbers
Test Data 1: 0, 0 ,0
Expected Result 1: 0
Test Data 2: 0, 0, 6
Expected Result 2: 3
Test Data 3: -2, -2, 10
Expected Result 3: 4
Test Data 4: -3, 15, -3
Expected Result 4: 6
Test Data 4: 10, 13, 20
Expected Result 4: 15

*/public static double averageOfEdges( int n1, int n2, int n3) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] numbers = {n1, n2, n3};

        for (int number : numbers) {
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        return (max + min ) / 2;
    } 

    /*
Task-6
Requirement:
-Create a method called noA()
-This method will take a String array argument and it
will return a new array with all elements starting with A
or a replaced with “###”
NOTE: Assume length will always be more than zero
NOTE: Ignore cases
Test Data 1: [“java”, “hello”, “123”, “xyz”]
Expected Result 1: [“java”, “hello”, “123”, “xyz”]
Test Data 2: [“appium”, “123”, “ABC”, “java”]
Expected Result 2: [“###”, “123”, “###”, “java”]
Test Data 3: [“apple”, “appium”, “ABC”, “Alex”, “A”]
Expected Result 3: [“###”, “###”, “###”, “###”,
“###”]

*/

    public static String[] noA(String[] letter) {

        for (int i = 0; i < letter.length; i++) {
            if (letter[i].toLowerCase().startsWith("a")) letter[i] = "###";
        }
        return letter;
    }

    /*
Task-7
Requirement:
-Create a method called no3or5()
-This method will take an int array argument and it will
return a new array with some elements replaced as below
If element can be divided by 5, replace it with 99
If element can be divided by 3, replace it with 100
If element can be divided by both 3 and 5, replace it with
101
NOTE: Assume length will always be more than zero
Test Data 1: [7, 4, 11, 23, 17]
Expected Result 1: [7, 4, 11, 23, 17]
Test Data 2: [3, 4, 5, 6]
Expected Result 2: [100, 4, 99, 100]
Test Data 3: [10, 11, 12, 13, 14, 15]
Expected Result 3:  [99, 11, 100, 13, 14, 101]

*/
    public static int[] no3or5( int[] arr){
        
        int[] number = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (number[i] / 3 == 0 && number[i] / 5 == 0){
                number[i] = 101;
            }
            else if (number[i] / 5 == 0){
                number[i] = 99;
            }
            else if (number[i] /3 == 0){
                number[i] = 10;
            }

        }return number;
        
    }

    /*
Task-8
Requirement:
-Create a method called countPrimes()
-This method will take an int array argument and it will return
how many elements in the array are prime numbers
NOTE: Prime number is a number that can be divided only by 1
and itself
NOTE: Negative numbers cannot be prime
Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
NOTE: Smallest prime number is 2
Test Data 1: [-10, -3, 0, 1]
Expected Result 1: 0
Test Data 2: [7, 4, 11, 23, 17]
Expected Result 2: 4
Test Data 3: [41, 53, 19, 47, 67]
Expected Result 3:  5

   */
    
    public static int countPrimes(int[] arr){

       int countPrimes = 0;
       for (int i = 0; i < arr.length; i ++) {
           if (arr[i] == 3 || arr[i] == 2) countPrimes++;
           else if (arr[i] > 3 ) {
               boolean prime = true;
               for (int j = 0; j < 1; j++) {
                  if( arr[i] % j == 0 )
                      prime = false;
               }
           }
       }
       return countPrimes;
    }

}
