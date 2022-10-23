package casting;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        /*
        ps5 ->$6000
        $20 per day saving

        expected output :
        Yuo can buy ps5 in 30 days
         */
        Scanner input = new Scanner(System.in);
        double priceForPs5 = 600;
        System.out.println(" Tre price for ps5 is currently =$" + priceForPs5);
        System.out.println(" How much are you going to save daily?");
        double dailySave = input.nextDouble();
        System.out.println( " You can buy ps5 in" + (int)priceForPs5 / dailySave + " daily ");




    }
}
