package recursion;

public class Practice02_ReverseString {


    /*
    Create a method called reverse
    It takes String and return it back reversed
    Use recursion
     */

    //iterative way
    public static String reverse(String str){

        String reverse  = "";
        for (int i = str.length()-1; i  > 0; i--) {
            reverse += str.charAt(i);
        }return reverse;
    }
    //recursion way
    public static  String  reverseStringRecursionWay(String str){
        if (str.length() < 2 ) return str;
        return reverseStringRecursionWay(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println(reverseStringRecursionWay("Hello"));

    }
}
