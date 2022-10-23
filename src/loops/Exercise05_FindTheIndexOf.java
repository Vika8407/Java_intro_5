package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {

    }

    /*
   Create a public static method named as findFirstIndexOf() and it will take a String,
   and a char then it will return the index of the first occurrence of the char. If the
   char doesn't exist in the String then return -1.

   Example:

   "I love Java", 'a' ->  8
   "Banana", 'a' -> 1
   "Banana", 't' -> -1


    public static int findFirstIndexOf(String s, char c) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    /*
            Create a public static method named as findLastIndexOf() and it will take a String,
            and a char then it will return the index of the last occurrence of the char. If the
            char doesn't exist in the String then return -1.

            Example:

            "I love Java", 'a' ->  10
            "Banana", 'a' -> 5
            "Banana", 't' -> -1
             */
    public static int findLastIndexOf(String s, char c) {

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

            /*
        Create a public static method named as clearChar() and it will take a String,
        and a char then it will return the String without the given char.

        Example:

        "I love Java", 'a' ->  "I love Jv"
        "Banana", 'a' -> "Bnn"
        "Banana", 't' -> "Banana"
         */

    public static String clearChar(String s, char c){
        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                newS += s.charAt(i);
            }
        }
        return newS;
    }

            /*
        Create a public static method named as clearWord() and it will take two Strings,
        then it will return the String without the given second String. If the second
        String is bigger than the first one return empty.

        Example:

        "I love Java", "av" ->  "I love Ja"
        "Banana", 'an' -> "Ba"
        "Banana", 'bananananaa' -> ""
         */

    public static String clearWord(String s, String word){
        if (word.length()> s.length()){
            return "";
        }
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(!s.substring(i).startsWith(word)){
                newS += s.charAt(i);
            }else {
                i += word.length() - 1;
            }
        }
       return newS;
    }

            /*
        Create a public static method named as frontAndBack() and it will take a String,
        then it will return a String which has the most common words from start and end.

        Examples:

        "abcxxxabc" -> "abc"
        "abxxxab" -> "ab"
        "axxxa" -> "a"
        "wordxxxword" -> "word"
         */

    public static String frontAndBack(String s) {
        String newS = "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.endsWith(s.substring(0, i + 1))){
                newS = s.substring(0, i + 1);
            }
        }
      return newS;
    }

            /*
        Create a public static method named as mostRepeatedChar() and it will take a String,
        then it will return the most repeated letter from String. If there is same amount of repetation
        return the first one. Hint: use a String container

        Example:

        "I love Java" ->  "v"
        "Banana" -> "a"
        "Python"> "P"


             */


  // public static char mostRepeatedChar(String s) {

  //     char mostRepeated = ' ';
  //     int mostAmountOfRepetitions = 0;

  //     for (int i = 0; i < s.length(); i++){

  //         if (countChar(s, s.charAt(i)) > mostAmountOfRepetitions){
  //             mostRepeated = s.charAt(i);
  //             mostAmountOfRepetitions = countChar(s, s.charAt(i));
  //         }
  //     } return mostRepeated;

  // }
  // public static String countChar(String s, char c) {
  //     int counter = 0;
  //     for (int i = 0; i < s.length(); i++) {
  //         if (s.charAt(i) == c) counter++;
  //     }
  //     return counter;
  // }
}


