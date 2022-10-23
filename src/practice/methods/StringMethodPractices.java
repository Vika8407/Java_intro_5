package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {




    }
    /*


     */
    public static boolean isCharExisting(String str, char c, int index){
        return str.charAt(index) == c;
    }
    /*


     */
     public static boolean inCharContained(String str, char c){
         return str.contains( c + "");
         //return str.contains(String.valueOf(c));
     }

}
