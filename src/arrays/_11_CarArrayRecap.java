package arrays;

import java.util.Arrays;

public class _11_CarArrayRecap {
    public static void main(String[] args) {

        char[] initials = {'V', 'i', 'k', 't', 'o', 'r', 'i', 'a'};
        //System.out.println(Arrays.toString(initials));

        for(char initial : initials) {
            System.out.print(initial);
        }

        for (int i = 0; i <initials.length ; i++) {
            System.out.print(initials[i]);
        }


    }


}

