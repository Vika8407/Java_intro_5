package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 10 ) {
            if (num % 2 == 1) System.out.println(num);
            num++;
        }

    }
}
