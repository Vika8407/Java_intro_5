package operators.short_hand_assignment_opeators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
                     /*
                    Balance = $100.00
                    1st transaction = $25.75
                    2nd transaction =  $12.50
                    3rd transaction = $7.25

                    Expected output:
                    Balance after 1st transaction = $74.25
                    Balance after 2nd transaction = $61.75
                    Balance after 3rd transaction = $54.5
                    */

        Scanner inputReader = new Scanner(System.in);

        double balance, firstTransactoin, secondTransaction, thirdTransactoin;

        System.out.println(" Hey user, please enter your balance");
        balance = inputReader.nextDouble();

        System.out.println(" Now, please tell your first transaction:");
        firstTransactoin = inputReader.nextDouble();

        balance -= firstTransactoin;

        System.out.println(" Balance after 1St transaction:" + balance);


        System.out.println(" What is your 2nd transaction :" );
        secondTransaction = inputReader.nextDouble();
        balance -= secondTransaction;
        System.out.println( " Balance after 2nd transaction is: " + balance);

        System.out.println( " What is yours 3rd transaction:" );
        thirdTransactoin = inputReader.nextDouble();
        balance -= thirdTransactoin;
        System.out.println( " Balance after 3rd transaction is :" + balance);








    }
}
