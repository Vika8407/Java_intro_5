package strings;

public class StringConcatenation {
    public static void main(String[] args) {

        // Declaration
        String city;
        //Assignment
        city = " Berlin";



        String s1 = " Hello";
        String s2 = "World";
        String s3 = s1 +" "+ s2 ;//Hello World

        System.out.println(" \n-------Concatenation with + operator________\n ");

        String firstName = " Viktoria";
        String lastName = "Milian";
        String fullName = firstName + " " + lastName;

        System.out.println( fullName);

        System.out.println(" \n -----------------Concatenation with concat() method----------\n" );

        String fullName2 = firstName.concat( " "). concat( lastName );

        System.out.println(fullName2);






    }
}
