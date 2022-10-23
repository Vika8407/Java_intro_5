package practice;

public class ReturnMethodPractices {
    public static void main(String[] args) {

    }
            /*

        Create a public static method named as "isIncluded" which takes two String values, and return true if
        the small string is inside the other one. NOTE: You have to check which string is bigger than check if
        it is included.

        Example:
        "John", "John Doe" -> true
        "green, blue, red", "blue" -> true
        "John", "blue" -> false
         */
    public static boolean isIncluded (String str1, String str2) {
        if (str1.length() > str2.length()) return str1.contains(str2);
        return str2.contains(str1);
    }
    }


