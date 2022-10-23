package mathClass;

public class MathRandomMethod {
    public static void main(String[] args) {


        double myRandom = Math.random();
        int myRandomBetween0To10 =(int) (Math.random()* 11); //this is casting
                                                              // 0,10 ( both included)
        int myDice = (int) (Math.random()*6) +1;


        /**
        randomNumber *(big  point - small point +1) + start
        10-0+1
         */

        // 0.0, 0.1, ........0.9999999999
        //0,1,2,3,.....9

        //System.out.println(" Random number is = " + Math.random());

        System.out.println(" Random number is = " + myRandom);
        System.out.println(" Random number is = " + myRandomBetween0To10);
        System.out.println(" My dice value is = " + myDice);

        //50-100

         int MyRandomBetween50to100 =  (int)(Math.random()*(100 -50 +1) +50);
        System.out.println(" Random number between 50 to100 is =" + MyRandomBetween50to100);

        // Create a random number between 20 - 40 and print it

        int MyRandomBetween10to20 =  (int)(Math.random()*(20 -10 +1) +10);
        System.out.println(" Random number between 10 to 20 is =" + MyRandomBetween10to20);


    }
}
