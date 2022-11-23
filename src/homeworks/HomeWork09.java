package homeworks;

import java.util.*;

public class HomeWork09{
    public static void main(String[] args) {

        System.out.println("\n--------- Task 1 ----------\n");

    /*

Requirement:
Write a program to find the first duplicated number in an int array
It should print “There is no duplicates” if there are no duplicate
elements.
NOTE: Make your code dynamic that works for any given int array.
Test data 1:
int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

Expected output 1:
0
Test data 2:
int[] numbers = {-8, 56, 7, 8, 65};

Expected output 2:
There is no duplicates
Test data 3:
int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

Expected output 2:
3

     */

            int[] arr = {3, 4, 3, 3, 5, 5, 6, 6, 7};
            int min = -1;
            HashSet<Integer> set = new HashSet<>();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (set.contains(arr[i]))
                    min = i;
                else set.add(arr[i]);
            }
            if (min != -1)
                System.out.println("The first duplicate is " + arr[min]);
            else System.out.println("There are no duplicates elements");





        System.out.println("\n--------- Task 2 ----------\n");
    /*
    Task-2
Requirement:
Write a program to find the first duplicated String in a String array, ignore
cases. It should print “There is no duplicates” if there are no duplicate
elements.
NOTE: Make your code dynamic that works for any given String array.
Test data 1:
String[] words = {“Z”, “abc”, “z”, “123”, “#” };

Expected output 1:
Z
Test data 2:
String[] words = {“xyz”, “java”, ”abc”};

Expected output 2:
There is no duplicates
Test data 3:
String[] words = {“a”, “b”, “B”, “XYZ”, “123”};

Expected output 2:
b
     */
            String[] str = {"a", "b", "B", "XYZ", "123"};
            boolean dup = false;
            for (int i = 0; i < str.length - 1; i++) {
                for (int j = i + 1; j < str.length; j++) {
                    if ((str[i].toLowerCase().equalsIgnoreCase(str[j]))) {
                        dup = true;
                        System.out.println("The first repeating elements is : " + str[i]);
                        break;
                    }
                }
            }



        System.out.println("\n--------- Task 3 ----------\n");
    /*
    Task-3
Requirement:
Write a program to find the all duplicates in an int array. It
should print “There is no duplicates” if there are no
duplicate elements.
NOTE: Make your code dynamic that works for any given
int array.
Test data 1:
int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

Expected output 1:
0
-7
Test data 2:
int[] numbers = {1, 2, 5, 0, 7};

Expected output 2:
There is no duplicates
     */

            int[] num = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> duplicates = new ArrayList<>();
            boolean flag = false;
            for (int i = 0; i < num.length ; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        if (i != j)
                            flag = true;
                        System.out.println("Duplicate elements : " + num[j]);
                    }
                }
            }



        System.out.println("\n--------- Task 4 ----------\n");
   /* Task-4
    Requirement:
    Write a program to find the all duplicates in a String array,
    ignore cases. It should print “There is no duplicates” if
    there are no duplicate elements.
            NOTE: Make your code dynamic that works for any given
    String array.
    Test data 1:
    String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”,
            “java”};

Expected output 1:
        A
        foo
        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };

        Expected output 2:
        There is no duplicates*/



            String[] words = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
           ArrayList<String> duplicate = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    if (!duplicate.contains(words[i])) duplicate.add(words[i]);
                }
            }

        }System.out.println(" The duplicate :" + duplicate);
        if (duplicate.isEmpty()) System.out.println(" There are no duplicates");




        System.out.println("\n--------- Task 5 ----------\n");
    /*
    Task-5
Requirement:
Write a program to reverse elements in an array, then
print array.
NOTE: Make your code dynamic that works for any
given array.
Test data 1:
String[] words1 = {“abc”, “foo”, “bar”};

Expected output 1:
[bar, foo, abc]
Test data 2:
String[] words2 = {“java”, “python”, “ruby”};

Expected output 2:
[ruby, python, java]
     */     String[] array = {"abc", "foo", "bar"};
            List<String> list = Arrays.asList(array);
            Collections.reverse(list);
            String[] reverseArray = list.toArray(array);
            System.out.println("Reverse elements : " + Arrays.toString(reverseArray));




        System.out.println("\n--------- Task 6 ----------\n");
    /*
    Task-6
Requirement:
Write a program to reverse each word in a given String
NOTE: Make your code dynamic that works for any
given String.
Test data 1:
String str = “Java is fun”;

Expected output 1:
avaJ si nuf
Test data 2:
String str = “Today is a fun day”;

Expected output 2:
yadoT si a nuf yad
DUE DATE
     */

        String sentence = "Java is fun";
        String[] array2 = sentence.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String s1 : array2) {
            reverse.append(new StringBuilder(s1).reverse().append(" "));
        }
        System.out.println(reverse.toString().trim());

    }
}