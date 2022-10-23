package casting;

public class PrimitivesToString {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println( num1 + num2);        //15 - primitive
        System.out.println("" + num1 + num2);    // 510  - string (text)
        System.out.println(' ' + num1 + num2);   // ASCII table space is =32 +5+10=47 ( in this case it is a char)
        System.out.println("" +  (num1 +num2));  // 15  as String ( text)

        System.out.println((String.valueOf(num1)) + String .valueOf(num2)); // 510 - String _text "5" +"10" =510
        System.out.println((String.valueOf(23) +5)); // "23" +5 = 235










    }
}
