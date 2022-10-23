package string_methods;

public class Exercise04_Substring {
    public static void main(String[] args) {
        /*
        Task 1
                Assume you are given below sentence
        "The best is Java"
        Write a Java program that extracts "Java" from given sentence
        And store extracted value in another String
        Finally, print the extracted String

         */
        String  s = "The best is Java";
        String s1 = s.substring(12);
        System.out.println(s1);

        // or alternative way
        System.out.println(s1.substring(s1.indexOf(" Java")));
        // or with length
        System.out.println(s1.substring(s1.length()-4));

                    /*
            TASK-2
            Assume you are given below sentence
             "Java is an object-oriented programming language"
            Write a Java program that extracts "Java" and "object-oriented" from given sentence
            And store extracted values in separate Strings
            Finally, print the extracted Strings

             */

        String str1 = "Java is an object-oriented programming language";
        String str2 =  s.substring(0,4);
        System.out.println(str2);
        String str3 = s.substring(11,26);
        System.out.println(str3);

        //Alternative way

        String java = "Java";
        String oo = "object-oriented";
        System.out.println(str1.substring((str1.indexOf(java)),java.length()));// logic for codding bat
        System.out.println(str1.substring((str1.indexOf(oo)),oo.length()));



    }
}
