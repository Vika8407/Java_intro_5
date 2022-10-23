package conditional_statements.ternary_operator;

import mathClass.MathRandomMethod;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {

        //way to do it with Random method
        Random random = new Random();
        random.nextInt();
        int randomNumberFromRandomClass1 = random.nextInt(10) +1 ;//0-9 we need +1 to get 10
        int randomNumberFromRandomClass2 = random.nextInt(10) +1 ;//0-9 we need +1 to get 10
        System.out.println(randomNumberFromRandomClass1);
        System.out.println(randomNumberFromRandomClass2);
        int min = randomNumberFromRandomClass1 < randomNumberFromRandomClass2 ? randomNumberFromRandomClass1 :randomNumberFromRandomClass2;
        System.out.println(" The smallest number is = " + min);

        // way to do it with  ternary
        int num1  = ( int)(Math.random()* 10) +1;
        int num2 = ( int)(Math.random()* 10) +1;

        System.out.println(" The number 1 " + num1) ;
        System.out.println(" The number 2 " + num2) ;

        int miN = num1 < num2? num1 : num2;

        System.out.println( " The smallest number is = " + miN);



    }
}
