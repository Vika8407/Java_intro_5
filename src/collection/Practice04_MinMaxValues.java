package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice04_MinMaxValues {
    public static void main(String[] args) {

        System.out.println(max(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(max(new Integer[]{12}));
        System.out.println(max(new Integer[]{}));//null

        System.out.println(min(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(min(new Integer[]{12}));
          System.out.println(min(new Integer[]{}));//NullPointerException

        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(secondMax(new Integer[]{10, 10, 10}));
        System.out.println(secondMax(new Integer[]{12}));
        System.out.println(secondMax(new Integer[]{}));

        System.out.println(secondMin(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(secondMin(new Integer[]{10, 10, 10}));
        System.out.println(secondMin(new Integer[]{12}));
        System.out.println(secondMin(new Integer[]{}));

        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10,100,123,507,25)),3));//100
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(100,100,100,100,100)),3));//null
        System.out.println(nthMax(new ArrayList<>(Arrays.asList()),3));//null
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(23,25)),3));//null

        System.out.println(nthMin(new ArrayList<>(Arrays.asList(10,100,123,507,25)),3));//100
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(100,100,100,100,100)),3));//null
        System.out.println(nthMin(new ArrayList<>(Arrays.asList()),3));//null
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(23,25)),3));//null



    }
    /*
    Find the max from given numbers below
    [10,100,123,507,25] -> Max 507
    [12] -> itself
    [] -> null
     */

   /* public static int max(Integer[] arr) {
        int max = Integer.MIN_VALUE;

        for (Integer i : arr) {
            if (i > max) max = i;
        }
        return max;
    }*/

    public static int max(Integer[] arr){

        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    // find min
    public static  int min (Integer[] arr){

        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }

    //find the second max from given numbers
    public static Integer secondMax(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if (set.size() < 2) return null;
        set.pollLast();
        return set.last();
    }

    public static Integer secondMin(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if (set.size() < 2) return null;
        set.pollFirst();
        return set.first();
    }


    public static Integer nthMax(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if (set.size() < nth) return null;
        // nth -1  time pollLast() amd then return last()
        for (int i = 0; i <= nth -1; i++) {
            set.pollLast();
        }
        return set.last();
    }

    public static Integer nthMin(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if (set.size() < nth) return null;
        // nth -1  time pollFirst() amd then return last()
        for (int i = 0; i <= nth -1; i++) {
            set.pollFirst();
        }
        return set.first();
    }

}
