package utilities;

public class MathHelper {

    /*
    Math.max ( num1 ,num2,) num3)

     */
    public static int maxOfThree(int num1, int num2, int num3){
       return Math.max(Math.max ( num1 ,num2), num3);

    }

    public static int minOfThree(int num1, int num2, int num3){
        return Math.min(Math.min ( num1 ,num2 ), num3);
    }
    /*
      Write method that returns the middle number
     */

    public static int middleOfTree (int num1, int num2, int num3){
        int max = maxOfThree( num1,num2,num3);
        int min = minOfThree( num1,num2,num3);
        return  num1+ num2 + num3 - min -max ;

    }

      public static boolean isEven ( int num){
        return num % 2 == 0 ;//  simple way

        //if ( num % 2 == 0)return true;
        //else return false;

    }

    public static boolean isOdd ( int number){
        return  number % 2 == 1;// or number % 2 != 0;
        /*
        long way
        IF (number %  2 != 0) return true;
        else return false
         */
    }


            /*
            Create a method that takes int arguments and return their sum
             */


          // OVERLOADING METHOD
     public static int findSum (int num1, int num2 ) {
        return num1 + num2;
     }
    public static double findSum (double num1, double num2 ) {
        return num1 + num2;
     }
    public static long findSum (long num1, long num2 ) {
        return num1 + num2;
     }
    public static int findSum (byte num1, int num2 ) {
        return num1 + num2;
    }


}

