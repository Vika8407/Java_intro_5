package methods;

import utilities.MathHelper;
import utilities.PrintUtils;

public class PrintPractice {

    public static void main(String[] args) {

        PrintUtils myPrinter = new PrintUtils() ;

        myPrinter.printHello(); // Hello

        PrintUtils.printName(" Vlad ");
        PrintUtils.printName(" Viktoria");
        PrintUtils.printName(" John ");


    }
}
