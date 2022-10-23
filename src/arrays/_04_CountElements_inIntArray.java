package arrays;

public class _04_CountElements_inIntArray {
    public static void main(String[] args) {

        int[] numbers ={-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        How many negatives: 2
                 positives: 5
                 neutral or zeros: 3

                 even: 6
                 odd:4

                 max :10
                 min:-7
                 sum:28
                 average of the numbers: 2
                 how many unique numbers: 7
                 how many of those numbers represented fibonacci sequences: 6
                 prime numbers: 2
                 how many numbers can be divided by 5: 6
                 absolute difference between the max and min of these numbers: 17
                 closes number to 9(take the smallest): 8

                 */

        int negatives = 0;
        for (int number :numbers) {
            if(number < 0) negatives++;
        }
        System.out.println("Negative counts is = " + negatives);

        int positives = 0;
        for (int number :numbers) {
            if(number > 0) positives++;
        }
        System.out.println("Positive counts is = " + positives);




        System.out.println("\t\n ============ TASK 1 ============\n");
                /*
        Count how many even numbers you have
        -1, 3, 0, 5, -7, 10, 8, 0, 10, 0
        EXPECTED:
        6
         */
        // for each loop
        int even = 0;
        for (int number :numbers) {
            if(number % 2 == 0) even++;
        }
        System.out.println(even);

        // fori loop
        int even1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0)even1++;
        }
        System.out.println(even1);

    }

}

