package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");


        String str = ScannerHelper.getAName();

        if (str.length() >= 8){
            String first4 = str.substring(0,4);
            String middle = str.substring(4, str.length()-4);
            String last4 = str.substring(str.length()-4);
            System.out.println(last4 + middle + first4);

        }
       else{
            System.out.println("This String does not have 8 characters");
        }

       System.out.println("\t\n ============ TASK 2 ============\n");

        Scanner input = new Scanner(System.in);
       System.out.println("Pleas enter a sentence");
       str = input.nextLine();

       if(str.contains("")) {
           String firstWorld = str.substring(0, str.indexOf(' '));
           String middle = (str.substring(str.indexOf(' '),str.lastIndexOf(' ')));
           String lastWord = str.substring(str.lastIndexOf(' '));
           System.out.println(lastWord + middle + firstWorld);
       }
       else {
           System.out.println("This sentence does not have 2 or more words to swap");
       }

        System.out.println("\t\n ============ TASK 3 ============\n");

        String str1 = "These books are so stupid";
        String s1 = str1.replace("stupid", "nice");
        System.out.println(s1);

        String str2 = "I like idiot behaviors";
        String s2 = str2.replace("idiot", "nice");
        System.out.println(s2);

        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";
        String s3 = str3.replace("idiot", "nice");
        System.out.println(s3);


        System.out.println("\t\n ============ TASK 4 ============\n");

        String name = ScannerHelper.getAName();
        if(name.length()>2){
            if (name.length() % 2 ==0 )
                System.out.println(name.substring(name.length()/2 -1,name.length()/2 +1));
            else System.out.println(name.charAt(name.length()/2));
        }else System.out.println("Invalid input");

        System.out.println("\t\n ============ TASK 5 ============\n");

            Scanner input1 = new Scanner(System.in);
            System.out.println("Please enter a country");
            String country = input1.nextLine();
            if(country.length() >5) System.out.println(country.substring(2,country.length()-2));
            else System.out.println("Invalid input");


        System.out.println("\t\n ============ TASK 6 ============\n");

       String address = ScannerHelper.getAddress();

       address = address.replace('a', '*').replace('A','*').
                         replace('e','#').replace('E', '#').
                         replace('i','+').replace('I','+').
                         replace('u','$').replace('U','$').
                         replace('o','@').replace('O', '@');
       System.out.println(address);



       System.out.println("\t\n ============ TASK 7 ============\n");

        int randomNumber1 = RandomNumberGenerator.getARandomNumber(0,25);
        int randomNumber2 =RandomNumberGenerator.getARandomNumber(0,25);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        String counter = "";
        Math.min(randomNumber1,randomNumber1);
        Math.max(randomNumber2,randomNumber1);
        for (int i = 0; i <= 25; i++){
            if( i % 5 == 0 )System.out.print(counter += i + " - ");
        }
        System.out.print(counter.substring(0, counter.length()-3));



        System.out.println("\t\n ============ TASK 8 ============\n");

         System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                count++;
        }
        if (count > 0)
            System.out.println("This sentence has " + (count + 1) + " words.");
        else
            System.out.println("This sentence does not have multiple words");



        System.out.println("\t\n ============ TASK 9 ============\n");

        int num = ScannerHelper.getANumber();
        System.out.println(" Number is " + num);
        for  (int i = 0; i < 6; i++ ){
            if( i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if( i % 2 == 0 ) System.out.println( "Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        System.out.println("\t\n ============ TASK 10 ============\n");

        ScannerHelper.getAString();
        String word = "";
        String reverse = "";
        for (int i = word.length()-1; i >=0; --i) {
            reverse = reverse + word.charAt(i);
        }
         if(word.toLowerCase().equals(reverse.toLowerCase()))
             System.out.println( word + "This word is palindrome");
         else{
            System.out.println("This word is not palindrome");

        }

        System.out.println("\t\n ============ TASK 11 ============\n");

        System.out.println(" Please enter a sentence");
        String s = input.nextLine();
        s = s.toLowerCase();
        int container = 0;

        if (s.length() > 0){
            for (int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a')
                    container++;
            }
            if (container == 1) System.out.println("This sentence has one a or A letter");
            else System.out.println("This sentence has " + container + " a or A letter");
        }
        else System.out.println("This sentence does not have any characters");
    }


}
