package loops.while_loops;

public class UnderstandingWhileLoop {
    public static void main(String[] args) {

        // Print numbers from 1 to 10

        //--------ForI Loop--------//
        for (int i = 1; i <= 10; i++){ //
            System.out.println(i);
        }

        //---------While loop----------//

        int start = 1;

        while (start <= 10){
            System.out.println(start);
            start++;
        }
    }
}
