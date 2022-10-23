package casting;

public class CastingChars {
    public static void main(String[] args) {

        int i1 = 65;
        System.out.println(i1);//65 (from ASCII table

        char c1 = (char) i1;//A decimal value ASCII table in this case
        System.out.println(c1);//A
        System.out.println(51);//3
        System.out.println((char) 123);//{
        System.out.println((char)32);// space which we cant see
        System.out.println((char) 1020);


        char char1= 'A';
        char char2 =97;//'a' we will get in this case from ASCII table

        System.out.println(char1 + char2);//65+97=162
        System.out.println( "" + char1 + char2 );//  Aa if we add empty double concatenation  we will  string result// get Aa
        System.out.println( "" + ( char1 + char2 ));//162 as string
        System.out.println( char1 + char2 + "");//162 as a text
        System.out.println( char1 + "" + char2 );//Aa

        /*
        primitive + string = String
        String + primitives = String
        primitive + primitive + String = number String
        primitive + String + a =Aa

         p+p+p+S+p+p+p =
         1+1+1+""+1+1+1 = "3111" String
         1+1+1+""+(1+1+1) = 33 String
         */




    }
}
