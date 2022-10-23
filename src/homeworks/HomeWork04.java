package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.indexOf;
import static jdk.nashorn.internal.objects.NativeString.lastIndexOf;

public class HomeWork04 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1============\n");

        String name = ScannerHelper.getAName();
        System.out.println(" The length of the name is = " + name.length());
        System.out.println(" The first character in the name is = " + name.charAt(0));
        System.out.println(" The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println(" The first 3 characters in the name are = " + (name.substring(0, 3)));
        System.out.println(" The last 3 characters in the name are = " + (name.substring(name.length() - 3)));
        System.out.println(" You are in a club " + name.startsWith("A"));
        if (name.toLowerCase().charAt(0) == 'a') {
            System.out.println(" You are in the club");
        } else  {
            System.out.println(" Sorry you are not");
        }


        System.out.println("\t\n ============ TASK 2============\n");

        String fullAddress = ScannerHelper.getAddress();
        if (fullAddress.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        }
        else if (fullAddress.toLowerCase().contains("des plaines")) {
            System.out.println("You are welcome to join the club");
        }
        else System.out.println("Sorry you will newer be in the club");


        System.out.println("\t\n ============ TASK 3============\n");

        String favColors = ScannerHelper.getAColors();
        if (favColors.toLowerCase().contains("green") && favColors.toLowerCase().contains("red"))
            System.out.println("Green and red are  in the list");
        else if (favColors.toLowerCase().contains("red"))
            System.out.println("Red is in the list");
        else if (favColors.toLowerCase().contains("green"))
            System.out.println("Green in the list");
        else
            System.out.println("Green and red are not in the list");


        System.out.println("\t\n ============ TASK 4============\n");

        String str =" Java is FUN ";
        str = str.toLowerCase().trim();
        String str1 = str.substring(0, str.indexOf(' '));
        String str2 = str.substring(str.indexOf(' ') + 1, str.lastIndexOf( ' ') );
        String str3 = str.substring(str.lastIndexOf(' ')) + 1 ;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);




    }

}

