package methods;

import utilities.ScannerHelper;

public class ScannerPractice {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();
        int age = ScannerHelper.getAnAge();
        System.out.println(name + "'s age is " + age + ".");

        //

        System.out.println(ScannerHelper.getAName() + "'s age is = " + ScannerHelper.getAnAge() + "." +
                            "\nAddress is " + ScannerHelper.getAddress());
    }
}
