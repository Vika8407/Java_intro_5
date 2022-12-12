package recursion;

import static sun.misc.Version.print;

public class UnderstandingRecursion {


    public static void pr(){
        System.out.println("Hello");
        print();
    }
    // create a method that prints number from 1 to given positive number
// This is regular way
    public static void printNumbers(int end){
        for (int i = 0; i <= end ; i++) {
            System.out.println(i);
        }
    }
    // This is recursion way
    public static void printNumbersRecursively(int end){
        if (end == 0)return;// return in void method is breaking a loop( so it should stop at 1)
        printNumbersRecursively(end -1);// 4,3,2,1
        System.out.println(end);
    }

    public static void main(String[] args) {
       // print(); // StackOverFlowError

        printNumbers(5);
        printNumbersRecursively(5);
    }
}
