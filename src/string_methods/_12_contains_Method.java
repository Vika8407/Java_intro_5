package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
       /*
        1.RETURN TYPE
        2.RETURN BOOLEAN
        3. NON STATIC
        4. TAKES ARGUMENTS  RETURN
        */

        String s = "TechGlobal School";
        System.out.println(s.contains("Tech"));//true
        System.out.println(s.contains("School"));//true
        System.out.println(s.contains("a"));//true
        System.out.println(s.contains("E"));//false

        // IMPORTANT
        System.out.println("");//true
        System.out.println(s);//true
        System.out.println("Education");//false

    }
}
