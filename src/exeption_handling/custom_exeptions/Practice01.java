package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

import javax.xml.bind.annotation.XmlType;

public class Practice01 {
    public static void main(String[] args) throws IllegalAccessException {

        int age= ScannerHelper.getAnAge();
        if (age >= 16) System.out.println("YOU ARE WELCOME TO JOIN THE CLUB!");
        else throw  new IllegalAccessException("Age  not acceptable!!!" + age +" .");

       int num = ScannerHelper.getANumber();

        switch (num){
            case 1:
                System.out.println("MONDAY");
                break;
                case 2:
                System.out.println("TUESDAY");
                break;
                case 3:
                System.out.println("WEDNESDAY");
                break;
                case 4:
                System.out.println("THURSDAY");
                break;
                case 5:
                System.out.println("FRIDAY");
                break;
                case 6:
                System.out.println("SATURDAY");
                break;
                case 7:
                System.out.println("SUNDAY");
                break;
            default:
                throw  new IllegalAccessException(num + " does not reflect any day!!!");

        }
        System.out.println("End of the program");
    }
}
