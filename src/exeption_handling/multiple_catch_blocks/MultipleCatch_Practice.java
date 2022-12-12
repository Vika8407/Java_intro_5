package exeption_handling.multiple_catch_blocks;

public class MultipleCatch_Practice {
    public static void main(String[] args) {

        String  name = null;
        int age = 25;

        /*
        Get the first character from the name and print it
        Divide the age by 0 and the result
        Print {name}'s age is {ages}
         */

        try{
            System.out.println(name.charAt(0));
            System.out.println(age / 0);
        }
        catch (NullPointerException nullPointerException){
           nullPointerException.printStackTrace();
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
        System.out.println(name + "'s" + " age is " + age + ".");

    }
}
