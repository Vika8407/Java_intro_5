package primitives;

public class Numbers {
    public static void main(String[] args) {
        System.out.println();
                /* There are 6 primitives used to store numbers data,
                byte, short, int, long, --- used to store absolute numbers

                byte = 1 byte
                short = 2 byte
                int = 4 byte
                log =8 bytes


                John
                his --45
                his favorite number =70
                his balance--400.45
                 */
                // dataType variableName = value;


                byte age = 45;// byte holds  max 127
                byte favNumber = 70;
                long fNumber = 2_147_483_648L;

        System.out.println(age);// 45
        System.out.println(favNumber);

        System.out.println("\n-------Floating Numbers-float-double--------\n");

        float balance = 23.28762385762384F;
        double balance2 = 23.28762385762384F;
        double price = 23.5;

        System.out.println(balance);// 23.287624
        System.out.println(balance2);//23.28762385762384
        System.out.println(price);//23.5

        double transaction =20;
        System.out.println(transaction);






    }
}
