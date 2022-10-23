package loops.while_loops;

public class Exercise02_PrintNumbersdividedBy3 {
    public static void main(String[] args) {

        // Print numbers divided by 3 bt 1 to 100

        int number = 1;

        while (number <= 100){
            if( number % 3 == 0)
            System.out.println(number);
            number++;
        }
        System.out.println(" End of the program ");
    }
}
