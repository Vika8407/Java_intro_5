package casting;

public class CastingNegativeNumToChars {

    public static void main(String[] args) {

        int negative = -32;
        char myChar = (char) negative;
        System.out.println( " Negative number char value = " + myChar);

        char zero = 48;
        System.out.println("Zero = " + zero); //it gonna print 0

        char upperA = 65;
        char upperZ = 90;
        System.out.println(" Uppercase A = " + upperA);
        System.out.println( " Uppercase Z = " + upperZ);

        char myCharO ='0';
        int oAsciiValue = myCharO;

        System.out.println(" Uppercase 0 = " + myChar );
        System.out.println(" 0  Ascii value = " );

        if (oAsciiValue >=65 && oAsciiValue <= 90) {
            System.out.println("Your char is uppercase");
        }
        else {
            System.out.println(" Your char is not uppercase");
        }




    }
}
