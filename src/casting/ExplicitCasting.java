package casting;

public class ExplicitCasting {
    public static void main(String[] args) {

        //Explicit casting - narrowing or down casting

        int age = 25;
        byte b = (byte) age;
        System.out.println(b); //25
        /*
         but we wii lose date if bigger primitives hold the data that
         cannot be stored in the smaller ono
         */

        /*
        int num1  = 5000;
        byte num2 = (byte) num1; // it seems ok for the compiler
        System.out.println(num2); but it wrong we cant do that  because we will get a wrong result

         */




    }
}
