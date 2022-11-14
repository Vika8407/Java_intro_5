package practice.arrayListPractices;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class Contains2Or3 {
    public static void main(String[] args) {
        System.out.println(contains2or3());
        System.out.println(containce7or13());
    }
     /*
    create a public static method which generate 5 numbers between 1-10 (both included)
    then store all of them inside of an arrayList and return true if it is containing
    "2" or "3".

    Examples:
    [0, -4, -7, 0, 5] -> false
    [0, 2, -7, 0, 5] -> true
    [0, -4, -7, 0, 3] -> true
    [0, 2, -7, 0, 3] -> true
     */
    public static boolean contains2or3(){

        ArrayList<Integer> random = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
                random.add(RandomNumberGenerator.getARandomNumber(1,10));
                return true;
        }
        System.out.println(random);
        return random.contains(2) || random.contains(3);
            }
        /*
        create a public static method which generate 7 numbers between -20 to 20 (both included)
        then store all of them inside an arrayList and return true if it is containing
        "7" or "13".

         */
    public static boolean containce7or13(){
        ArrayList<Integer> random = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            random.add(RandomNumberGenerator.getARandomNumber(-20,20));
            return true;
        }
        System.out.println(random);
        return random.contains(7) || random.contains(13);
    }


}
