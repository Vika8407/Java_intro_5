package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {


        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";


        System.out.println( wordPart1 + wordPart2 + wordPart3 );

        String sentencePart1 ="I can";
        String sentencePart2 =" learn Java";
        String sentencePart3 = sentencePart1.concat("").concat(sentencePart2);

        System.out.println( sentencePart3 );


    }
}
