package character_class;

public class EasyMethodPractices {
    public static void main(String[] args) {

        String s1 = "2860 south River road Des  Plaines il";
        String s2 = "12334 @!#$!@ TechGlobal";
        System.out.println("String: \"" + s1 + "\" has " + countLetters(s1) + " characters ");
        System.out.println("String: \"" + s2  + "\" has " + countLetters(s1) + " characters ");

    }

    /*
    Create a public static method which take  a String  and return the number of letters
     */
    //"2860 south River road Des  Plaines il" -> 26
    //"12334 @!#$!@ TechGlobal" -> 10

      public static int countLetters(String s) {
          int counter = 0;
          for (int i = 0; i < s.length(); i++) {// 0, 1, 2, 3, ...L-1
              if (Character.isLetter(s.charAt(i))) {
                  counter++;
              }
          }
          return counter;
                  /*
        Create a public static method named as countUpperCases() which will take a String
        and counts the upper case letters then returns it
         */
          //"12334 @!#$!@ TechGlobal" -> 2
          //"TeChGloBal" -> 4
          //"123123 TeChGloBal #$%#$%" -> 4



                  /*
        Create public static method named as printStringAttributes() takes a String as parameter
        and prints the message dynamically for the string

        Print output -> "Given "(string)" has:
                        x amount of upper cases
                        x amount of lower cases
                        x amount of letters
                        x amount of digits
                        x amount of spaces
                        x amount of specials"


           Example Output:
           Given "12345 @!#$!@ TechGlobal" has:
                 2 amount of upper cases
                 8 amount of lower cases
                 10 amount of letters
                 5 amount of digits
                 2 amount of spaces
                 6 amount of specials
         */





    }
    /*
      Create a public static method named as countUpperCases() which will take a String
      and counts the upper case letters then returns it
       */
    //"12334 @!#$!@ TechGlobal" -> 2
    //"TeChGloBal" -> 4
    //"123123 TeChGloBal #$%#$%" -> 4
    public static int countUpperCase(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }
        return counter;

    }
}
