package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Mock_Practices {
    public static void main(String[] args) {


    }
    public static  Integer[] secMax(Integer[] numbers){
        TreeSet<Integer> num = new TreeSet<>();
        for (Integer i : num) {
            num.add(i);
        }
        return new Integer[]{num.lower(num.last())};
    }

    public static Integer[] secMin (Integer[] numbers){
        TreeSet<Integer> num = new TreeSet<>();
        for (Integer i : num) {
            num.add(i);
        }
        return new Integer[]{num.higher(num.first())};
    }

    // sum of String
    public static  int sumOfString(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
}
