package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {



        int smallest = ScannerHelper.getANumber();
        int biggest = ScannerHelper.getANumber();

        for (int i = Math.min(smallest, biggest); i <= Math.max(smallest, biggest); i++){
            if(i  == 5 )continue;
            System.out.println(i);
        }
        System.out.println(" End of the program ");

    }
}
