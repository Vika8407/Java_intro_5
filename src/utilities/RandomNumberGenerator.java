package utilities;

public class RandomNumberGenerator {

    public static int getARandomNumber( int i1, int i2){
        return (int )(Math.random () * Math.abs(i1 -i2 +1 )) + Math.min(i1, i2);
    }

}