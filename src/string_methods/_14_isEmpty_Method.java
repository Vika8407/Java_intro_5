package string_methods;

public class _14_isEmpty_Method {
    public static void main(String[] args) {
        /*
        1.RETURN
        2. RETURNS A BOOLEAN
        3.NON STATIC
        4.IT DOES NOT TAKES ANY ARGUMENTS
         */
        String s1 = "Hello";
        String s2 = " ";
        String s3 = "";// length is = to 0

        System.out.println(s1.isEmpty());//false
        System.out.println(s2.isEmpty());//false
        System.out.println(s3.isEmpty());// true


    }
}
