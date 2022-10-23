package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. RETURN
        2. RETURNS CHAR IN GIVEN INDEX

         */

        String sentence = "Java is fun ";

        char c1 = sentence.charAt(3);//'a'
        System.out.println(c1);
        char c2 = sentence.charAt(4);// '  ' spase
        System.out.println(c2);

        System.out.println(sentence.charAt(9));//u

        // NOTE : RUNTIME ERROR  - StringIndexOutOfBoundException
        //System.out.println(sentence.charAt(-5));
        //System.out.println(sentence.charAt(50));
        //System.out.println(sentence.charAt(1).toUppercase());//not nposible - compiler error
        // because
        System.out.println(" End of the program ");






    }
}
