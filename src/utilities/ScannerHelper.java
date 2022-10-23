package utilities;

import java.util.Scanner;

public class ScannerHelper {
       static Scanner input = new Scanner(System.in);
        /*
        Create a method that ask user to enter  the name and return it

         */

       public static String getAName() {
           System.out.println(" Please enter a name ");
        String name = input.nextLine();

        return name;
    }
       public static int getAnAge() {
         String name = ScannerHelper.getAName();
         int age = ScannerHelper.getAnAge();
         input.nextLine();
         return age;
     }


        public static String getAddress () {
            System.out.println(" Please enter your address : ");
            String address = input.nextLine();
            return  address;

        }
        public static String getAString(){
            System.out.println("Please enter a string");
            return input.nextLine();
        }

        public static String getAColors() {
            System.out.println("Please enter a colors");
            return input.nextLine();

        }
       public static int getANumber() {
           System.out.println(" Please enter a number");
            return input.nextInt();

    }

    public static String getFullAName() {

        System.out.println(" Please enter a name ");
        String fullName = input.nextLine();

        return fullName;
    }


}
