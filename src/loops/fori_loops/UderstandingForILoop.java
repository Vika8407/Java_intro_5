package loops.fori_loops;

public class UderstandingForILoop {
    public static void main(String[] args) {
        /*
        Syntax :
        for (initialization; termination condition; change){
        //code block will be executed
        }

        deside first
        start point
        and point
         */

        System.out.println(" Hello World");
        System.out.println(" Hello World");
        System.out.println(" Hello World");
        System.out.println(" Hello World");
        System.out.println(" Hello World");


        for (int i = 0; i <= 7 ; i++){ // 0,1,2,3,4,5,6,7, // in case <7 its gonna be 0,1,2,3,4,5,6,because 7 not included
                                       // if you use i-- it's infinitive loops never stops,never reach the condition
            System.out.println("Hallo World !");
        }
        System.out.println(" End of program ");
    }

}
