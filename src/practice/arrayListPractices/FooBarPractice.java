package practice.arrayListPractices;

public class FooBarPractice {
    public static void main(String[] args) {

        printLucky();
        printFooBar();

    }

    /*
    Create a public static method which will print numbers from 1 to 10,
     and it print "Lucky if it is dividable by "3"

    Expected:
    1
    2
    Lucky
    4
    5
    Lucky
    7
    8
    Lucky
    10
     */
    public static void printLucky(){

        for (int i = 1; i <= 10 ; i++) {
            if(i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    public static void printFooBar(){

        for (int i = 1; i <= 10 ; i++) {
            if (i % 10 == 0)
                System.out.println("FooBar");
             else if (i % 2 == 0 )
                System.out.println("Foo");
             else if (i % 5 == 0)
                System.out.println("Bar");
             else System.out.println(i);
        }

    }





}
