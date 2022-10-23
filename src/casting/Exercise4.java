package casting;

public class Exercise4 {
    public static void main(String[] args) {

        // tru, false -- boolean
        //"true", "falce" -- string

        System.out.println(true && false); // false
        //System.out.println("tru" &&" falsee"); compiler error

        System.out.println(String.valueOf(true) + String.valueOf(false)); // "true" + 'false"
        System.out.println("" + true + false);//truefalse ( as a text)
        System.out.println(String.valueOf('A') + 'a');// "A" + 'a' = Aa    char
        System.out.println("" + 10.5+ 5); // 10.55 as String (text) "10.5" +5 = 1055




    }
}
