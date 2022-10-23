package practice.loops_practice;

public class ForIPractise {
    public static void main(String[] args) {

        System.out.println(" \n Hardcoded print statements \n");

        System.out.println("Congrats!!!");
        System.out.println("Congrats!!!");
        System.out.println("Congrats!!!");

        System.out.println(" \n Fori loop print statement \n");
        // I want to print massage 3 times
              //v1
        for( int i = 0; i < 3; i++){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i );
        }
             //v 2
        for( int i = 1; i < 3; i++){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i );
        }

        for( int i = 3; i > 0; i--){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i );
        }

        for( int i = 100; i < 97; i--){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i );
        }
    }

}
