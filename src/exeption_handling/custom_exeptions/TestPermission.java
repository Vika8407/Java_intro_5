package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TestPermission {
    public static void main(String[] args) {


        int age = ScannerHelper.getAnAge();
        try {
            if (Permission.isAgeValid(age)) ;
            System.out.println("You can get DL");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("You are " + age + ".");
        }


    /*
        Write a program to ask user to enter the day
     Let user know the check in hours
     In case of any error, catch it and print the error
     Finally, print the current date - day
     */
        try {
            System.out.println(Permission.getCheckInHours(ScannerHelper.getANumber()));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Date date = new Date();
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            System.out.println("Current day = " + dayFormat.format(date));
        }
    }
}
