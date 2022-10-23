package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        1.RETURN TYPE
        2.RETURNS STRINGS
        3.NON- STATIC
        4. OVERLOADED METHODS < ONE TAKES 2 CHARS THE OTHER TAKES TWO STRINGS

         */
        String s = "Can I can a can";

        String s1 = s.replace('c', 'x');
        System.out.println(s1);// Can I xan a xan

        System.out.println(s.replace("can", "xxx"));//Can I xxx a xxx
        System.out.println(s.toLowerCase().replace("can", "xxx"));// xxx i xxx a xxx

        //IMPORTANT
        String str1 = "John";
        str1 = str1.replace("o","oooo");
        System.out.println(str1);// Joooon

        String str2 = "apple";
        str2 = str2.replace("abc","xyz");
        System.out.println(str2);

        String str3 = "orange";
        str3 = str3.replace("orange","");
        System.out.println(str3);


    }
}
