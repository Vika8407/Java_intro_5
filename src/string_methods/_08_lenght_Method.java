package string_methods;

public class _08_lenght_Method {
    public static void main(String[] args) {
        /*
        1. RETURN TYPE
        2.RETURN INT WHICH IS THE TOTAL COUNT OF THE CHARACTERS
        3. NON - STATIC
        4. DOES NOT TAKE ANY ARGUMENT
         */
        String s = "John";
        int len = s.length();
        System.out.println(len);//4
        System.out.println("".length());//0
        System.out.println(" ".length());//1
        System.out.println("  ".length());//2


    }
}
