package mathClass;

public class MinAndMaxMethod {
    public static void main(String[] args) {

        // Math class doesn't ned object for using

        int maxNumber = Math.max(80,27); // 80
        int maxNumber2 = Math.max(maxNumber,45);
        int maxNumber3 = Math.max(maxNumber, 625);

        System.out.println(maxNumber);
        System.out.println("maxNumber2 = " + maxNumber2);//125
        System.out.println("maxNumber3 =" +maxNumber3);


        int minNumber =Math.min (80,27);
        int minNumber2 =Math.min (minNumber, 2);
        int minOfTwoNeg =Math.min (-40, -60);
        // -infinite,.....-10,-9,......-1,0,1...9,10,,,,,.


        System.out.println("\n minNumber =" + minNumber);
        System.out.println("\n minNumber2 =" + minNumber2);
        System.out.println("minOFTwoNeg =" + minOfTwoNeg); //-60

        double minOfTwoDecimals  =Math.min (1.7, 2.1);
        double minOfTwoDecimalsNeg  =Math.min (-5.4, -27.2);
        System.out.println(" \n maxOfTwoDesimals =  " + minOfTwoDecimals); //6.5
        System.out.println(" \n maxOfTwoDecimalsNeg = " +minOfTwoDecimalsNeg );

        int max1 = Math.max(6,9);
        int max2 = Math.max(17,49);
        double max3 = Math.max (34.2 ,12.5);
        int max4 = Math.max(-14,-32);
        int max5 = Math.max(Math.max(17,49), 125);//  when we need to compare 3 numbers

        System.out.println(" max number = "  + max1);
        System.out.println(" max number = "  + max2);
        System.out.println(" max number = "  + max3);
        System.out.println(" max number = "  + max4);
        System.out.println(" max number = "  + max5);

        int min1 = Math.min(6,9);
        int min2 = Math.min(17,49);
        double min3 = Math.min (34.2 ,12.5);
        int min4 = Math.min(-14,-32);
        int min5 = Math.min(Math.min(17,49), 125);
        int min6= Math.min(Math.min(45,32), Math.min (56,89));

        System.out.println(" Min number = "  + min1);
        System.out.println(" MIn number = "  + min2);
        System.out.println(" Min number = "  + min3);
        System.out.println(" Min number = "  + min4);
        System.out.println(" Min number = "  + min5);
        System.out.println(" Min number = "  + min6);



    }
}
