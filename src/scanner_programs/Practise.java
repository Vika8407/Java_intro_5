package scanner_programs;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is your name");
        String name = input.nextLine();
        input.nextLine();
        System.out.println( " What is your age ?");
        int age = input.nextInt();

    }
}
